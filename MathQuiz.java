import java.util.Scanner;
import java.util.Random;

public class MathQuiz {

    // Method to add two numbers
    public static int adding(int a, int b) {
        return a + b;
    }

    // Method to check the answer
    public static void checking(int userAnswer, int correctTotal) {
        if (userAnswer == correctTotal) {
            System.out.println("Your answer is correct.");
        } else {
            System.out.println("Your answer is incorrect. The correct answer is " + correctTotal);
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int num1 = rand.nextInt(11);  // random number from 1 to 10
        int num2 = rand.nextInt(11);

        System.out.println("Solve: " + num1 + " + " + num2);
        System.out.print("Enter your answer: ");
        int answer = input.nextInt();

        int total = adding(num1, num2);   // sends num1, num2 → a, b
        checking(answer, total);          // sends answer, total → userAnswer, correctTotal

        input.close();
    }
}