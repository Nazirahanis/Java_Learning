class SquareMain3 {
   public static void main(String[] args) {
      SquareMain3 sm = new SquareMain3();
      int result=0;
      for (int i = 1; i <= 5; i++) {
         result = sm.getSquare(i);
         System.out.println("Square of "+  i +" is : "+ result);
         }
      }
      int getSquare(int x){
         return x * x;
         }
    }