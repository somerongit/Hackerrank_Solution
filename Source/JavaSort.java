import java.util.*;
// import java.util.Arrays;


class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
class sortByCGPA implements Comparator<Student>{
    
    double epsilon=0.001;
    
    public int compare (Student x, Student y){
        
        if(Math.abs(x.getCgpa()-y.getCgpa())>epsilon){
            
            return x.getCgpa()<y.getCgpa()?1:-1;
            
        }else if(!(x.getFname()==y.getFname())){
            
            return (x.getFname().compareTo(y.getFname()));
        }
        
        return (x.getId()-y.getId());
    }
}
public class JavaSort
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
      Collections.sort(studentList,new sortByCGPA());
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



