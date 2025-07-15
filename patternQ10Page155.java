// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
       
       int i;
       for(i=1;i<=5;i++){
          //  System.out.print(" i =" +i);
            for(int j=1;j<=5;j++){
                if(j<i)
                {
                    System.out.print(" " +i);
                    
                }
                else{
                    System.out.print(" " +j);
                }
            }
            System.out.println();
       }
    }
}



