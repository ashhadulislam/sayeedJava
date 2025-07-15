// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
       
       String s="helloworld";
       System.out.println(s);
       int lengthOfString=s.length();
       System.out.println("length of string is "+lengthOfString);
       
       for (int pos=0;pos<lengthOfString;pos++){
           char checkChar=s.charAt(pos);
           //System.out.println("Looking at: "+checkChar);
           if ((checkChar=='a')|| (checkChar=='e')||(checkChar=='i')||(checkChar=='o')||(checkChar=='u')||(checkChar=='A')|| (checkChar=='E')||(checkChar=='I')||(checkChar=='O')||(checkChar=='U')||(checkChar==' ')){
               
           }
           else{
               System.out.println(checkChar+" is a consonant");
           }
           
          
       }
    }
}



