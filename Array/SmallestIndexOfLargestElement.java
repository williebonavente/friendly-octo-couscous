package Array;

import java.util.Scanner;

public class SmallestIndexOfLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int size = scanner.nextInt();
        int [] myList = new int[size];
        System.out.print("Enter " + size + " elements: ");
        int max = myList[0];
        int maxIndexOf = 0;
        
        for(int i = 1; i < size; i++) {
            myList[i] = scanner.nextInt();
            if(myList[i] > max) {
                max = myList[i];
                maxIndexOf = i;
            }
        }
        
        System.out.println("Maximum Number: " + max);
        System.out.println("Maximum Index: " + maxIndexOf);
        scanner.close();
    }    
}
