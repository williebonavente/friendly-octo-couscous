package Temps;
import java.util.Scanner;

public class Recursive {
    public static void printRecursively(int current, int n) {
        if (current > n) {
            return; // base case to stop recursion
        } else {
            System.out.print(current + " ");
            printRecursively(current + 1, n); // recursive call to increment current
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        n = scanner.nextInt();

        printRecursively(1, n);

        scanner.close(); // Close the Scanner object

    }
}