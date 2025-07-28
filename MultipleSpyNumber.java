// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class Main {
     public static void main(String[] args) 
    {
        for (int j=1000;j<=9999;j++)
        {
        System.out.println("Checking for "+j);
        Scanner in = new Scanner(System.in);
        int ld,sum=0;
        float pdt=1;
        System.out.println("Enter the number:");
        int n=j;
        int n1=n;
        while(n>0)
        {
            ld=n%10;
            n=n/10;
            sum=sum+ld;
            pdt=pdt*ld;
        }
        if(sum==pdt)
        {
            System.out.println(n1+" is a spy number");
        }
        else
        {
            System.out.println(n1+" is not a spy number");
        }
        
        }
    }
}

        
        
        
        
        
        
        
        
        
