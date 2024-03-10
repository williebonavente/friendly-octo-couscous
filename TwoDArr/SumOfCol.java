package TwoDArr;

import java.util.Scanner;

public class SumOfCol {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter size of the row: ");
            int rowSize = input.nextInt();
            System.out.print("Enter size of the column: ");
            int colSize = input.nextInt();
            // array
            int[][] matrix = new int[rowSize][colSize];
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    matrix[row][col] = (int) (Math.random() * 100);
                }
            }
            for(int row = 0; row < matrix.length; row++) {
                for(int col = 0; col < matrix[row].length; col++) {
                    System.out.printf("%-3d", matrix[row][col]);
                }
                System.out.println();
            }
            System.out.println();
            for (int col = 0; col < matrix[0].length; col++) {
                int total = 0;
                for (int row = 0; row < matrix.length; row++) {
                    total += matrix[row][col];
                }
                System.out.println("Sum for column " + col + " is " + total);
            }
        }
    }
}
