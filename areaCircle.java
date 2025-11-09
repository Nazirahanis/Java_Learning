import java.util.Scanner;
class areaTrapezium{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
                  
      //input      
      System.out.println("Enter height: ");
      double height = sc.nextDouble();
      System.out.println("Enter side1: ");
      double side1 = sc.nextDouble();
      System.out.println("Enter side2: ");
      double side2 = sc.nextDouble();
      
      //process
      double areaTrapezium = 0.5*(side1 + side2)*height;
      
      //output
      System.out.print("areaTrapezium: " + areaTrapezium);
      
  }
}