package Temps;
import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = in.nextInt();

        System.out.print("Factorial of " + x + ": " + factorial(x));
        factorial(x);

        in.close();

    }

    public static int factorial(int x) {
        if (x == 0) {
            return 1;
        } else {
            return (x * factorial(x - 1));
        }
    }
}
