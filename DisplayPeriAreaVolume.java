import java.util.Scanner;
class T6Q3{
   public static void main(String[] arg){
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter length:");
      double length = sc.nextDouble();
      System.out.println("Enter width :");      
      double width = sc.nextDouble();
      System.out.println("Enter height :");
      double height = sc.nextDouble();     
      
      double perimeter = (4 * length) + (4 * width) + (4 * height); 
      double area = (2 * length * width) + (2 * length * height) + (2 * height * width);
      double volume = length * width * height ;
      
      System.out.println("PerimeterCuboid:" + perimeter);
      System.out.println("AreaCuboid:" + area);
      System.out.println("VolumeCuboid:" + volume);      
    }
}