package TwoDArr;

import java.util.Scanner;

public class PassTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] matrix = getArray();

        // Display sum of elements
        System.out.println("Sum of all elements is " + sum(matrix));
    }

    public static int[][] getArray() {

        // Creating a scanner
        try (Scanner input = new Scanner(System.in)) {
            // Enter array values
            int[][] matrix = new int[3][4];
            System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns ");
            for (int row = 0; row < matrix.length; row++) {
                for (int column = 0; column < matrix[0].length; column++) {
                    matrix[row][column] = input.nextInt();
                }
            }
            return matrix;
        }
    }

    public static int sum(int[][] matrix) {
        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                total += matrix[row][column];
            }
        }
        return total;
    }

}