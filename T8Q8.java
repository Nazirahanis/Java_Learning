// Name : Nur Nazirah Hanis binti Nazri
// Purpose : to calculate electric bill

import java.util.Scanner;
class T8Q8{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   
   double usage, bill;

   System.out.print("Enter electricity usage :"); // in Watt
   usage = sc.nextDouble();
   
   if (usage<=1000)
      bill = usage * 0.20;
      
   else 
      bill = 200 + ((usage-1000) * 0.10);
      
   System.out.print("Electric bill : " + bill);
   
  }
}
      