// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class Main {
    
     public static void main(String[] args) 
    {
        
        for (int j=10;j<=999999;j++){
            System.out.println("Checking for "+j);    
            int ld,sum=0;
            float cube;
            int n=j;
            int n1=n;
            while(n>0)
            {
                ld=n%10;
                n=n/10;
                sum=sum+ld;
            }
            cube=sum*sum*sum;
            System.out.println("Cube: "+cube);
            if(cube==n1)
            {
               System.out.println(n1+" is a dudeney number");    
            }
            else
            {
                System.out.println(n1+" is not a dudeney number"); 
            }
            
            
        }
        
        
    }
    
}
