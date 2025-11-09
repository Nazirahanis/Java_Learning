// Name : Nur Nazirah Hanis binti Nazri
// Purpose : To create array to enable user to input name and mark and linear search of the highest and lowest of the array

import java.util.Scanner;
class searchMarks{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
      
 
   String[] name = new String[2];
   double[] mark = new double[2];
   double total = 0, avg;
  
   for (int i=0; i < 2; i++){
      System.out.print("Enter name of student " + (i+1) + ": ");
      name[i] = sc.next();
      System.out.print("Enter mark " + name[i] + ": ");
      mark[i] = sc.nextDouble();
      total = total + mark[i];
      }
      
   double highest = mark[0]; 
   double lowest = mark[0];
   String nameHighest = name[0]; 
   String nameLowest = name[0];
   
   
   
   for(int i=0; i < 2; i++){
      if(mark[i]>highest){
         highest = mark[i];
         nameHighest = name[i];
         }
              
      if(mark[i]<lowest){
         lowest = mark[i];
         nameLowest = name[i];
         }
    }
    
    avg = total/2;
    
    System.out.println("The highest mark is " + highest + " by " + nameHighest);
    System.out.println("The lowest mark is " + lowest + " by " + nameLowest);
    System.out.println("Total marks: " + total);
    System.out.println("Average mark: " + avg);
    
    
    }}
