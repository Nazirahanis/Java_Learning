//author : nazirah F4T1
//purpose : to calculate the shdaded area


import java.util.Scanner;
class shadedArea2{ 
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      
      // input
      System.out.println("Enter lenght: ");
      double lenght = sc.nextDouble();
      System.out.println("Enter width: ");
      double width = sc.nextDouble();
      
      // process
      double shadedArea = (lenght * width) - ((3.142 * (width* 0.5) * (width*0.5)) * 0.5);
      
      // output
      System.out.println("Shaded Area: " + shadedArea);
      
  }
}