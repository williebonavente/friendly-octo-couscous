package Array;

import java.util.Scanner;

public class Compare {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int size = scanner.nextInt();
        int []myList = new int[size];
        System.out.print("Enter " + size + " elements: ");
        int max = myList[0];
        for(int i = 0; i < size; i++) {
            myList[i] = scanner.nextInt();
            if(myList[i] > max) 
            {
                max = myList[i];
            }
        }
        System.out.println("Maximum Element " + max);
        

        for(int i = 0; i < size; i++) {
            System.out.print(myList[i] + " ");
        }


        scanner.close();

    }
}