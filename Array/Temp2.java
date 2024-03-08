package Array;

import java.util.Scanner;

public class Temp2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
// Creating an array
        int []myList = new int[size];
        System.out.print("Enter " + myList.length + " elements: ");
        for(int i = 0; i < myList.length; i++) {
            myList[i] = scanner.nextInt();
        }

        // for each loop -> looping without using the indices
        for (int i: myList) {
            System.out.println(i);
        }
        scanner.close();
    }    
}
