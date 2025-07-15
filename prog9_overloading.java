// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try 1st sum series");
        System.out.println(seriesSum(6));
        System.out.println("Try 2nd sum series");
        System.out.println(seriesSum(3,6));
        
        System.out.println(product(6));
        System.out.println(product(4));
        System.out.println(product(7));
        System.out.println("Try 3rd sum series");
        System.out.println(seriesSum());
        
    }
    
    public static int seriesSum() {
        
        int sum=0;
        for(int i=1;i<=20;i++){
            
            System.out.println(i+" "+sum+" "+product(i));
            sum=sum+product(i);
        }
        return sum;
    }

    public static int product(int n) {
        
        int product=1;
        for(int i=1;i<=n;i++){
        product=product*i;
        }
        return product;
    }    
    public static int seriesSum(int n) {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        return sum;
    }
    public static float seriesSum(int n, float x) {
        float sum=0;
        for(int i=1;i<=n;i++)
        if(i%2==0)
        {
            sum=sum-x/i;
        }
        else
        {
            sum=sum+x/i;
        }
            return sum;
        
    }
}
