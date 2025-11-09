// Name : Nur Nazirah Hanis binti Nazri
// Purpose : to Area Circle or Area Square

import java.util.Scanner;
class trial2_PT2{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   
   double radius, areaCircle, areaSqu, lenght;

   System.out.print("Enter code :");
   char code = sc.next().charAt(0);
      
   if (code=='1'){
      System.out.print("Enter radius :");
      radius = sc.nextDouble();
      areaCircle = 3.142 * radius * radius;
      System.out.print("Area Circle : " + areaCircle); 
      }
    
    else if (code=='2'){
      System.out.print("Enter lenght :");
      lenght = sc.nextDouble();
      areaSqu = lenght * lenght;  
      System.out.print("Area Square : " + areaSqu);    
      }

    else{
      System.out.print("Invalid code"); }
            
           
   
  }
}
   