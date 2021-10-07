import java.util.Scanner;
import java.util.regex.*;

public class JavaSyntaxChecker
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
            try{
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");
              
            }catch(Exception e){
                System.out.println("Invalid");
            }
            testCases--;
		}
	}
    /* 
    ---------------------------Sample Code---------------------------
    Pattern p = Pattern.compile(".s");//. represents single character  
    Matcher m = p.matcher("as");  
    boolean b = m.matches();  
    
    //2nd way  
    boolean b2=Pattern.compile(".s").matcher("as").matches();  
    
    //3rd way  
    boolean b3 = Pattern.matches(".s", "as");  
    
    System.out.println(b+" "+b2+" "+b3);
    ------------------------------End---------------------------------    
    */  
}



