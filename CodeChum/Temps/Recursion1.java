package Temps;
import java.util.Scanner;

public class Recursion1 {
    public static void printRecursively(int n) {
        if (n == 0) {
            return; // Base case to stop recursion
        } else if (n == 1) {
            System.out.print(n); // Print number 1 without a comma
        } else {
            System.out.print(n + ", "); // Print other numbers with a comma

            printRecursively(n - 1); // Recursive call with decremented value of n
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        n = scanner.nextInt();

        printRecursively(n);

        scanner.close();
    }
}