package Temps;
import java.util.Scanner;

public class Temp5 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter first array size: ");
            int s1 = in.nextInt();
            System.out.print("Enter second array size: ");
            int s2 = in.nextInt();
            int[] arr1 = new int[s1];
            int[] arr2 = new int[s2];
            System.out.print("Enter first array values: ");
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = in.nextInt();
            }
            System.out.print("Enter second array values: ");
            for (int j = 0; j < arr2.length; j++) {
                arr2[j] = in.nextInt();
            }
            printOdd(arr1, arr2, s1, s2);
        }
    }

    public static void printOdd(int arr1[], int arr2[], int s1, int s2) {
        int[] oddNumbers = new int[s1 + s2]; // Create an array to store the odd numbers
        int index = 0; // Index to keep track of the position in the oddNumbers array

        // first arr
        for(int i = 0; i < s1; i++) {
            if(arr1[i] % 2  != 0) {
                oddNumbers[index] = arr1[i]; // Store the odd number i  n the oddNumbers array
                index++; // Increment the index
            }
        }

        // second arr
        for(int j = 0; j < s2; j++) {
            if(arr2[j] % 2  != 0) {
                oddNumbers[index] = arr2[j]; // Store the odd number in the oddNumbers array
                index++; // Increment the index
            }
        }

        // Print the odd numbers
        for(int k = 0; k < index; k++) {
            if (k != 0) {
                System.out.print(", ");
            }
            System.out.print(oddNumbers[k]);
        }
    }
}