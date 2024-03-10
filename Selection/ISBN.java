package Selection;

import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first 9 digits of an ISBN as an integer: ");
            String input = scanner.nextLine();

            int firstDigit = Character.getNumericValue(input.charAt(0));
            int secondDigit = Character.getNumericValue(input.charAt(1));
            int thirdDigit = Character.getNumericValue(input.charAt(2));
            int fourthDigit = Character.getNumericValue(input.charAt(3));
            int fifthDigit = Character.getNumericValue(input.charAt(4));
            int sixthDigit = Character.getNumericValue(input.charAt(5));
            int seventhDigit = Character.getNumericValue(input.charAt(6));
            int eightDigit = Character.getNumericValue(input.charAt(7));
            int ninthDigit = Character.getNumericValue(input.charAt(8));

            int lastDigit = (firstDigit * 1 + secondDigit * 2 + thirdDigit * 3 + fourthDigit * 4 +
                    fifthDigit * 5 + sixthDigit * 6 + seventhDigit * 7 + eightDigit * 8 +
                    ninthDigit * 9) % 11;

            if (lastDigit == 10) {
                System.out.println("The ISBN-10 number is " + input + "X");
            } else {
                System.out.println("The ISBN-10 number is " + input + lastDigit);
            }
        }

    }
}
