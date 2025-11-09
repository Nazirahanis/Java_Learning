// Name : Nur Nazirah Hanis binti Nazri
// Purpose : display an appropriate message if the element is found, index of found element, an appropriate message if the element is not found

import java.util.Scanner;
class assignment1{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
      
   final int SIZE = 10;
   double[] temp = new double[10];
  
   
    for (int i=0; i < 10; i++){
      System.out.print("Enter temperature " + (i+1) + ": ");
      temp[i] = sc.nextDouble();
      }

    System.out.print("Enter temperature to search: ");
      double searchTemp = sc.nextDouble();
      
      boolean found = false;
      System.out.println("The temperature is found ");
      System.out.print("Index : ");
      
       for (int i= 0; i < 10; i++){
         if (temp[i] == searchTemp){
            found= true;
            System.out.print(i+" ");

            }
         }
         
         if(!found){
         System.out.println("The temperature is not found ");
         }
         
         else 
             System.out.println();
             
             
             }}


      
