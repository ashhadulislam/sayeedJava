// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        int f=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
          
            {
                System.out.println(+i);
                  f++;
                System.out.println("number of factors till now"+f);
            }
        }
          System.out.println("Number of factors " +f);
          if(f>0)
          {
              System.out.println("It is a composite number");
          }
          else
          {
              System.out.println("It is not a composite number");
          }
    }
}
