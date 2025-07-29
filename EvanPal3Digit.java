import java.util.*;
class Main {
    public static void main(String[] args) {
        
        for(int i=100;i<=999;i++)
        {
            int n=i;
             int rev=0,sumofdig=0;
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
        }
    }
}
        
        
       
