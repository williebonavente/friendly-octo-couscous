package RandomNumbers;

import java.util.Scanner;
public class Subtraction {
    public static void main(String[]args){

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        if(number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        int answer = scanner.nextInt();

        if(number1 - number2 == answer) {
            System.out.println("You are correct!");
        }
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
        }
        scanner.close();
    }
}
