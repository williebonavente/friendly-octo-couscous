package Loops;

import java.util.Scanner;
public class NestedLoops {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the outer loops: ");
        int outerSize = scanner.nextInt();
        System.out.print("Enter the size of the inner loops: ");
        int innerSize = scanner.nextInt();
        
        // Array Declaration
        int [] outerList = new int[outerSize];
        int [] innerList = new int [innerSize];

        System.out.print("Enter " + outerSize + " numbers: ");

        for (int outerIndex = 0; outerIndex < outerList.length; outerIndex++) {
            outerList[outerIndex] = scanner.nextInt();
        }

        System.out.print("Enter " + innerSize + " numbers: ");
        for (int innerIndex = 0; innerIndex < innerList.length; innerIndex++) {
            innerList[innerIndex] = scanner.nextInt();
        }

        for (int outerIndex = 0; outerIndex < outerList.length; outerIndex++) {
            for (int innerIndex = 0; innerIndex < innerList.length; innerIndex++) {
                int product = outerList[outerIndex] * innerList[innerIndex];
                System.out.printf("%-4d", product); // Use printf with format specifier to align the numbers
            }
            System.out.println();
        }

        scanner.close();
    }
}
