// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter your choice: 1 or 2");
        int ch=in.nextInt();
        System.out.println("Enter number of terms :");
        int t=in.nextInt();
        if(ch==1)
        {
            for(int i=1;i<=t;i++)
            {
                for(int j=i;j>0;j--)
                {
                    System.out.print(+i);
                }
                System.out.println(" ");
            }
        }
        else
        { 
            for(int i=t;i>0;i--)
            {
                 for(int j=1;j<=i;j++)
                {
                    System.out.print(+i);
                }
                System.out.println(" ");
            }
            
        }
        
    }
}
