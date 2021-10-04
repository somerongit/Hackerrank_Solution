import java.util.*;
import java.io.*;
import java.math.BigInteger;

class JavaDatatypes{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                BigInteger x1=BigInteger.valueOf(x);

                System.out.println(x+" can be fitted in:");
                
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)System.out.println("* short");

                if(x1.longValue()>=Integer.MIN_VALUE && x1.longValue()<=Integer.MAX_VALUE)System.out.println("* int");
                
                if(x1.longValue()>=Long.MIN_VALUE && x1.longValue()<=Long.MAX_VALUE)System.out.println("* long");
                
                
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



