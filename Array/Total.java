package Array;

import java.util.Scanner;

public class Total {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in) ;
        double total = 0;
        int []myList = new int[5];
        System.out.print("Enter " + myList.length + " elements: ");
        for(int i = 0; i < myList.length; i++) {
            myList[i] = scanner.nextInt();
            total += myList[i];
        }
        System.out.print((int)total);
        scanner.close();
    }
}
