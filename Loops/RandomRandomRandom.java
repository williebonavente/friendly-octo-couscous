package Loops;

import java.util.Scanner;

public class RandomRandomRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of first array: ");
        final int sizeOne = scanner.nextInt();
        System.out.print("Enter the size of second array: ");
        final int sizeSecond = scanner.nextInt();
        System.out.print("Enter the size of third array: ");
        final int sizeThird = scanner.nextInt();
        int firstTotal = 0;
        int secondTotal = 0;
        int thirdTotal = 0;
        int count = 0;
        // Arrays
        int[] firstArr = new int[sizeOne];
        int[] secondArr = new int[sizeSecond];
        int[] thirdArr = new int[sizeThird];

        // Randomly Generate Sheets
        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = (int) (Math.random() * 100);
        }
        for (int j = 0; j < secondArr.length; j++) {
            secondArr[j] = (int) (Math.random() * 100);
        }
        for (int k = 0; k < thirdArr.length; k++) {
            thirdArr[k] = (int) (Math.random() * 100);
        }
        
        System.out.println();
        System.out.println("Randomly Generated Numbers: ");
        // Traversing
        for (int i = 0; i < firstArr.length; i++) {
            count++;
            firstTotal = count;
            for (int j = 0; j < secondArr.length; j++) {
                count ++;
                secondTotal = count; 
                for (int k = 0; k < thirdArr.length; k++) {
                    count++;
                    thirdTotal = count;
                    System.out.print(firstArr[i] + " " + secondArr[j] + " " + thirdArr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        int totalNumberOfElements = firstTotal + secondTotal + thirdTotal;
    
        System.out.println("Number of elements per loop");
        System.out.println("Outer Loop: " + firstTotal);
        System.out.println("Inner Loop: " + secondTotal);
        System.out.println("Nested Inner Loop: " + thirdTotal);
        System.out.println("Total Number of Elements: " + totalNumberOfElements);
        scanner.close();
    }
}
