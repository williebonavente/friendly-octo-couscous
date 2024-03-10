package Selection;

import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            int number3 = (int) (Math.random() * 10);

            // if(number1 < number2) {
            // int temp = number1;
            // number1 = number2;
            // number2 = temp;
            // }
            System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
            int answer = input.nextInt();

            if ((number1 + number2 + number3) == answer) {
                System.out.println("You are correct!");
            } else {
                System.out.println("Your answer is wrong.");
                System.out.println(
                        number1 + " + " + number2 + "+ " + number3 + " should be " + (number1 + number2 + number3));
            }
        }
    }
}
