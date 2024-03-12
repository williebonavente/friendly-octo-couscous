package TwoDArr;

import java.util.Scanner;

public class GreatestSum {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the size of the row: ");
            int sizeOfRow = input.nextInt();
            System.out.print("Enter the size of the column: ");
            int sizeOfCol = input.nextInt();

            // array
            int[][] matrix = new int[sizeOfRow][sizeOfCol];
            System.out.println("The elements ");
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    // init elements randomly
                    matrix[row][col] = (int) (Math.random() * 100);
                    System.out.printf("%-3d", matrix[row][col]);
                }
                System.out.println();
            }

            int maxRow = 0;
            int indexOfRow = 0;

            for (int column = 0; column < matrix[0].length; column++) {
                maxRow += matrix[0][column];
            }
            
            for (int row = 1; row < matrix.length; row++) {
                int totalOfThisRow = 0;
                for (int column = 0; column < matrix[row].length; column++) {
                    totalOfThisRow += matrix[row][column];
                }
                System.out.println("Row " + row + " sum = " + totalOfThisRow);
                if (totalOfThisRow > maxRow) {
                    maxRow = totalOfThisRow;
                    indexOfRow = row;
                }
            }


            System.out.println("Row " + indexOfRow + " has the maximum sum of " + maxRow);
        }
    }
}
