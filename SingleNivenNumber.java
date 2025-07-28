// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int ld,sum=0;
        System.out.println("Enter the number:");
        int n=in.nextInt();
        int n1=n;
        while(n>0)
        {
            ld=n%10;
            n=n/10;
            sum=sum+ld;
        }
        if(n1%sum==0)
        {
           System.out.println(n1+" is a niven number");    
        }
        else
        {
            System.out.println(n1+" is not a niven number"); 
        }
    }
    
}
