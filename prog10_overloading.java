// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        num_cal(13,'s');
        num_cal(3,'t');
        
        num_cal(3,9,'p');
        num_cal(3,8,'q');

        num_cal("pac","man");        
        num_cal("pac","pac");        
        
       
    }
    
    public static void num_cal(int num,char ch){
        if(ch=='s')
        {
            System.out.println("Sqaure is " +(num*num));
        }
        else
        {
            System.out.println("Cube is " +(num*num*num));
        }
    }
    public static void num_cal(int a,int b,char ch){
        if(ch=='p'){
            System.out.println("The product:" +(a*b));
        }
        else
        {
            System.out.println("The sum :" +(a+b));
        }
    }
    public static void num_cal(String str1,String str2){
        if(str1==str2){
            System.out.println("The strings are equal");
        }
        else
        {
            System.out.println("The strings are not equal");
        }
    }
}




