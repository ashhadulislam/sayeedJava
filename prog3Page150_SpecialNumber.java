// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n = 146;
        int sum=0;
        int n2=n;
        while(n>0){
            int rem= n%10;
            n=n/10;
            //Calculate factorial of rem
            int fact=1;
            System.out.println("Factorial of " +rem);
            for(int j=rem;j>=1;j--){
                System.out.println(fact+"*"+j);
                fact=fact*j;
                System.out.println("----");
            }
            System.out.println("rem is: " +rem);
            System.out.println("fact is: " +fact);
            System.out.println("n is : " +n);
            sum=sum+fact;
            System.out.println(sum+ " is the sum till now");
            System.out.println("**************");
        }
        
    System.out.println(sum+" is sum of factorials");
    if (sum==n2){
        System.out.println(n2+ " is a special number");
    }
    else{
        System.out.println(n2+ " is not a special number");
    }
        
    }
}



