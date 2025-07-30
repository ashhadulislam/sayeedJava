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

or

class Main {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print(i);
            }
                for(int k=i+1;k<=5;k++)
                {
                    System.out.print(k);
                }
            System.out.println (" ");
        }
    }
}



