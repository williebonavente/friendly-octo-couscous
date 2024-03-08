package Array;

import java.util.Scanner;

public class Temp1 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner (System.in);
        int [] numbers = new int[5];
        System.out.print("Enter the elements: ");
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            System.out.print(numbers[i] + " ");
        }
        
        scanner.close();
    }
}
