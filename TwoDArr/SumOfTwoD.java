package TwoDArr;

import java.util.Scanner;

public class SumOfTwoD {
    public static void main(String[]args){
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter the size of the row: ");
            int rowSize= input.nextInt();
            System.out.print("Enter the size of the column: ");
            int colSize = input.nextInt();
            int total = 0;
            // Creating an array
            int [][] matrix = new int[rowSize][colSize];
            System.out.println("The elements of 2d Matrix");
            for(int row = 0; row < matrix.length; row++) {
                for(int col = 0; col < matrix[row].length; col++) {
                    matrix[row][col] = (int)(Math.random() * 100);
                    total += matrix[row][col];
                    System.out.printf("%-3d", matrix[row][col]);
                }
                System.out.println();
            }
            System.out.print("\nTotal = " + total);
        }
    }
}
