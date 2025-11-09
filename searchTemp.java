// Lecturer : Madam Norlisah binti Samsuri
// Class : F4T1
// Name : Nur Nazirah Hanis binti Nazri
// Purpose : To create array to enable user to input temperature and linear search of the temperature of the array

import java.util.Scanner;
class searchTemp{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
      
 
   double[] temp = new double[10];  
   //Declare and create an array named temp with data type double with size 10 to store temperature values
   
   int[] index = new int[10]; 
   //Declare and create an array named index with data type int with size 10 to store found temperature 
   
   
   /*Use for loop and input statement to accept temperature entered by user (user-friendly) into the array created*/
   for (int i=0; i < 10; i++){
      System.out.print("Enter temperature " + (i+1) + ": ");
      temp[i] = sc.nextDouble();
      }
      
      //User-friendly, input temperature to be searched
      System.out.print("Enter temperature to be searched: ");
      
      //Input statement for searchTemp
      double searchTemp = sc.nextDouble();
      
      //Declare and initialize variable found=0
      int found = 0;
      
      //process
      /*This loop is used to check whether the searched temperature can be found in the array or not. 
      If the temperature is found, display the message and update variable found*/  
      for (int i= 0; i < 10; i++){
         if (temp[i] == searchTemp){
            index[found]= i; //to store the index of the foumd temp
            found++;
            }
         }
       
       //output: display results     
       if(found != 0){ //at least one search temperature is found
         System.out.println("The temperature " + searchTemp + " is found!");
         System.out.print("Index : ");
         for (int i= 0; i < found; i++){
            System.out.print(index[i] + " "); // to print all found indexes of the found value
            }
         }
         
         else 
             System.out.println("The searched temperature is not found");
             //To display the message if the searched temperature is not found
                     
    }
 }
            

            
         
                   