package Array;

import java.util.Scanner;
public class Initialize {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int [] myList = new int[5];
        
        System.out.print("Enter " + myList.length + " values : ");
        for(int i = 0; i < myList.length; i++) {
            myList[i] = scanner.nextInt();
            System.out.print(myList[i] + " ");
        }

        scanner.close();
    }
}
