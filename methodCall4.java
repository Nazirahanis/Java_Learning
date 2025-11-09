import java.util.Scanner;
class methodCall4{
   public static void main(String[] args){
   methodCall4 mc = new methodCall4();
   Scanner sc = new Scanner(System.in);
  
   
   
   System.out.print("Enter name : ");
   String name = sc.next();
   System.out.print("Enter age : ");
   int age = sc.nextInt();
   mc.printName(name, age);
   }
   
   void printName(String a, int b){
       System.out.println("Hello," + a);
       System.out.println("Your current age is " + b + " years old.");
      
}}
       
