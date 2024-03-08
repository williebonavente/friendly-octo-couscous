package Array;

import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        if (size % 2 != 0) {
            int medianIndex = (int) size / 2;
            System.out.println("Median: " + arr[medianIndex]);
        } else {
            int medianIndex1 = size / 2;
            int medianIndex2 = medianIndex1 - 1;
            System.out.println("Medians " + arr[medianIndex2] + " and " + arr[medianIndex1]);

        }
        scanner.close();
    }
}
