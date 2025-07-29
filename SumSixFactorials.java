// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        
        int sum=0;
        for(int j=1;j<=6;j++)
        {
            int n=j;
            int pdt=1;
            for(int i=1;i<=n;i++)
            {
                pdt=pdt*i;
            }
             System.out.println(n+" Factorial is: " +pdt);
            sum=sum+pdt;
        }
        System.out.println("Sum: " +sum);
    }
}
