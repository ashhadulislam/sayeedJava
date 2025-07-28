// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter gender (m/f)");
        
        String s;
        Scanner in = new Scanner (System.in);
        s=in.next();
        char gender=s.charAt(0);
        System.out.println("Your gender is "+gender);
         System.out.println("Enter age");
         int age;
         age=in.nextInt();
        System.out.println("Your age is "+age);
        if (age>65 || gender == 'f'){
            System.out.println("Wrong category for age or gender");
        }
        else{
            System.out.println("Enter salary");
            int salary=in.nextInt();
            System.out.println("Your salary is "+salary);
            float IT=0;
            if(salary>1000000)
            {
             IT=((salary-1000000)*30/100)+94000;   
            }
            else if(salary>500000)
            {
             IT=((salary-500000)*20/100)+34000;
            }
            else if(salary>250000)
            {
             IT=((salary-250000)*10/100);
            }
            else
            {
                System.out.println("Nil");
            }
            System.out.println("Income Tax is:"+IT);
        }
    }
}
