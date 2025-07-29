// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        
        
        for(int i=2;i<=100;i++){
            int n=i;
            boolean isPrime=true;
            for(int j=2;j<n;j++)
            {
                if(n%j==0)
                {
                    isPrime=false;
                    break;
                    
                }
            }
            if(isPrime==true)
            {
                System.out.println(n);
            }
        }       
    }
}
