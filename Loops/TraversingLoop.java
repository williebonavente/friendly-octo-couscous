package Loops;

import java.util.Scanner;

public class TraversingLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size of the first array: ");
        int sizeFirst = scanner.nextInt();
        System.out.print("Size of the second array: ");
        int sizeSecond = scanner.nextInt();
        System.out.print("Enter the size of third: ");
        int sizeThird = scanner.nextInt();
        // Array
        int[] firstArray = new int[sizeFirst];
        int[] secondArray = new int[sizeSecond];
        int [] thirdArray = new int[sizeThird];

        System.out.print("Enter " + sizeFirst + " numbers: ");
        for (int i = 0; i < sizeFirst; i++) {
            firstArray[i] = scanner.nextInt();
        }
        System.out.print("Enter " + sizeSecond + " numbers: ");
        for (int j = 0; j < sizeSecond; j++) {
            secondArray[j] = scanner.nextInt();
        }

        System.out.print("Enter " + sizeThird + " numbers: ");
        for (int k = 0; k < sizeThird; k++) {
            thirdArray[k] = scanner.nextInt();
        }
        // Displaying the size of the array
        for (int i = 0; i < sizeFirst; i++) {
            for(int j = 0; j < sizeSecond; j++) {
                for(int k = 0; k < sizeThird; k++) {
                    System.out.print(firstArray[i] + " ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
