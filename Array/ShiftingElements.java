package Array;

import java.util.Scanner;

public class ShiftingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of elements: ");
        int size = scanner.nextInt();
        int []myList = new int[size];
        // Retaining the first element
        System.out.print("Enter " + myList.length + " elements: ");
        for( int i =0; i < myList.length; i++) {
            myList[i] = scanner.nextInt();
        }
        
        int temp = myList[0];
        for(int i = 1; i < myList.length; i++) {
            myList[i - 1]  = myList[i];
        }
        myList[myList.length - 1] = temp;
        for(int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        scanner.close();
    }
}
