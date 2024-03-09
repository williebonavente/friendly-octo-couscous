package Loops;

import java.util.Random;

public class TestBoolean {
    public static void main(String[]args) {
        Random rand =  new Random();
        System.out.print("Enter an integer: ");
        int number = rand.nextInt(100);
        System.out.print(number);
        System.out.println();
        if(number % 2 == 0 && number % 3 == 0) {
            System.out.println(number + " is divisible by 2 and 3.");
        } else if (number % 2 == 0 || number % 3 ==0) {
            System.out.println(number + " is divisible by 2 or 3.");
        } else if (number % 2 == 0 ^ number % 2 ==0) {
            System.out.println(number + " is divisible by either 2 or 3 but not both.");
        } else {
            System.out.println(number + " is not divisible by 2 and 3.");
        }
    } 
}
