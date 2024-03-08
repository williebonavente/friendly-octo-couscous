package Array;

import java.util.Scanner;

public class Temppp {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of the first array: ");
        int sizeOfFirstArr = scanner.nextInt();
        int[]firstArr = new int[sizeOfFirstArr];
        
        System.out.println("Enter element of the first array: ");
        for(int i =0; i < sizeOfFirstArr; i++) {
            firstArr[i] = scanner.nextInt();
   
        }
        System.out.print("Enter size of the second array: ");
        int sizeOfSecondArr = scanner.nextInt();
        System.out.println("Enter element of the second array: ");
        int[]secondArr = new int[sizeOfSecondArr];
          for(int j =0; j < sizeOfSecondArr; j++) {
            secondArr[j] = scanner.nextInt();
              
            }
        int sum = firstArr[0] + secondArr[sizeOfSecondArr - 1];
        int product = firstArr[1] * secondArr[sizeOfSecondArr - 2];
        
        System.out.println("Sum of first and last: " + sum);
        System.out.println("Product of second and second to the last: " + product);
        scanner.close();
        
    }
}
