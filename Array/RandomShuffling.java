package Array;

import java.util.Scanner;

public class RandomShuffling {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        int size = scanner.nextInt();
        int[]myList = new int[size];
        System.out.print("Enter " + size + " elements: ");
        for(int i = 0; i < myList.length; i++) {
            myList[i] = scanner.nextInt();
        }

        for(int i = myList.length - 1; i >= 0; i--) {
            int j = (int)(Math.random() * (i + 1));

            // Swap the elements
            int temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
            System.out.print(myList[i] + " ");
        }

        scanner.close();
    }
}
