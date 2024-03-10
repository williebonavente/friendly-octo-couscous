package TwoDArr;

import java.util.Scanner;

public class RandomShuffling {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the size of row: ");
            int sizeOfRow = input.nextInt();
            System.out.print("Enter the size of column: ");
            int sizeOfColumn = input.nextInt();
            // array
            int[][] matrix = new int[sizeOfRow][sizeOfColumn];
            System.out.println("The Elements of 2d Array Before Shifting");
            for (int row = 0; row < matrix.length; row++) {
                for (int column = 0; column < matrix[0].length; column++) {
                    matrix[row][column] = (int) (Math.random() * 100);
                    System.out.printf("%-4d", matrix[row][column]);
                }
                System.out.println();
            }
            
            System.out.println("The Elements of 2d Array After Shifting");
            // Shuffling elements
            for (int row = 0; row < matrix.length; row++) {
                for (int column = 0; column < matrix[0].length; column++) {
                    int i1 = (int) (Math.random() * matrix.length);
                    int j2 = (int) (Math.random() * matrix[row].length);

                    // Swapping elements
                    int temp = matrix[row][column];
                    matrix[row][column] = matrix[i1][j2];
                    matrix[i1][j2] = temp;

                    System.out.printf("%-4d", matrix[row][column]);

                }
                System.out.println();

            }
        }
    }
}
