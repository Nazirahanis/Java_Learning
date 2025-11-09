import java.util.Scanner;
class shadedArea{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
   
      //input
      System.out.println("Enter lenghtRec: ");
      double lenghtRec = sc.nextDouble();
      System.out.println("Enter height: ");
      double height = sc.nextDouble();
      System.out.println("Enter lenghtTri: ");
      double lenghtTri = sc.nextDouble();
      
      //process
      double shadedArea = lenghtRec*height - 0.5*height*lenghtTri;  
      
      //output
      System.out.println("shadedArea: " + shadedArea);
      
   }
} 