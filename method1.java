import java.util.Scanner;
class method1{
   public void printAmerican(String day, int date, String month, int year){
      System.out.println(day + ", " + month + " " + date + ", " + year);
      }
      
   public static void main(String[] args){
   method1 mc = new method1();
  
  mc.printAmerican("Saturday", 22, "July", 2015);
  
  }}