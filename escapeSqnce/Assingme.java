package escapeSqnce;

import java.util.Scanner;


public class Assingme {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int num1 = 10;
        int num2 = 5;

        num1 += num2; // Equivalent to num1 = num1 + num2
        System.out.println("num1 += num2: " + num1);

        num1 *= num2; // Equivalent to num1 = num1 * num2
        System.out.println("num1 -= num2: " + num1);

        num1 %= num2; // Equivalent to num1 = num1 % num2
        System.out.println("num1 /= num2: " + num1);

        scanner.close();

    }
}
