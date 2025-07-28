// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        boolean isPronic=false;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            int ans=i*(i+1);
            if(ans==n)
            {
                isPronic=true;
                break;
            }
            
        }
        if(isPronic==true)
        {
            System.out.println(n+" is a pronic number");
        }
         else
         {
             System.out.println(n+" is not a pronic number");
         }
     
          
    }
}
