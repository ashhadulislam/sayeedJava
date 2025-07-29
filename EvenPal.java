// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int rev=0,sumofdig=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=in.nextInt();
        int n2=n;
        while (n>0)
        {
            int ld=n%10;
            n=n/10;
            rev=rev*10+ld;
            sumofdig=sumofdig+ld;
        }
        if(rev==n2 && sumofdig%2==0)
        {
            System.out.println(n2+ " is an evenpal number");
        }
        else
        {
            System.out.println(n2+ " is not an evenpal number");
        }
        
        
    }
}
