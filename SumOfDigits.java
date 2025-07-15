// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n = 71364;
        int sum=0;
        while(n>0){
        int rem= n%10;
        n=n/10;
        System.out.println(rem);
        System.out.println(n);
        sum=sum+rem;
        }
        {
            System.out.println(sum);
        }
    }
}



