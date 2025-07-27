// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n,t,o;
        float s,p;
        System.out.println("Enter the number:");
        n=in.nextInt();
        o=n%10;
        System.out.println("The ones digit:" +o);
        t=n/10;
        System.out.println("The tens digit:" +t);
        s=t+o;
        p=t*o;
        System.out.println("Sum of digits :" +s);
        System.out.println("Product of digits :" +p);
        if(s+p==n)
        {
            System.out.println("Special 2 digit number");
        }
        else
        {
            System.out.println("Not a special digit number");
        }
    }
}
