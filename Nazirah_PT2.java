// Author : NUR NAZIRAH HANIS BINTI NAZRI
// Purpose : to calculate the delivery cost based on weight

import java.util.Scanner;
class Nazirah_PT2{
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      
      
      //declaration 
      double weight, cost;
      
      //input
      System.out.println("*********************");
      System.out.print("Enter weight: ");
      weight = sc.nextDouble();
      
      //process
      if (weight < 5){
         cost = weight * 4.00;
         System.out.println("Delivery cost: RM" + cost);
         }
      else if (weight >= 5) {
         cost = weight * 6.50;
         System.out.println("Delivery cost: RM" + cost);
         }
      else 
         System.out.println("Invalid weight");
      
      //output    
      System.out.print("*********************");
     
   }
}
   