import java.util.Scanner;
import java.lang.Math;
class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    public long power(int a, int b) throws Exception{
        long c=0;

            if(a==0 && b==0){
                throw new Exception("n and p should not be zero.");
            }else if(a<0 || b<0){
                throw new Exception("n or p should not be negative.");            
            }else{
                c=(long)Math.pow(a,b);
                return c;
            }
    }
    
}

public class JavaExceptionHandling {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
