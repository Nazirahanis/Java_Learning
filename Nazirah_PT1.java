//author : NUR NAZIRAH HANIS BINTI NAZRI
//purpose : calculate the area of shaded area

import java.util.Scanner;   
class Nazirah_PT1{
   public static void main (String[]args){
      Scanner sc = new Scanner(System.in);
      
      
      //input
      System.out.print("Enter radius 1 :");
      int radius1 = sc.nextInt();
      System.out.print("Enter radius 2 :");
      int radius2 = sc.nextInt();
      
      // process
      double shadedArea = (3.142 * radius1 * radius1) - (3.142 * radius2 * radius2);
      
      // output
      System.out.println("--------------------");
      System.out.println("Shaded area = " + shadedArea);
      System.out.println("======================");
      
   }
}  