import java.util.Scanner;
class divisibilityCheck{

   public static boolean isNotDivisible(int p, int q){
      return p % q !=0;
      }
    
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the first number(p): ");
      int p = sc.nextInt();
      System.out.print("Enter the second number(q): ");
      int q = sc.nextInt();
      boolean result = isNotDivisible(p,q);
      
      System.out.println(result);
      
      }}

      
