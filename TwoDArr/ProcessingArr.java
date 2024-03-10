package TwoDArr;

import java.util.Scanner;

public class ProcessingArr {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter Row Length: ");
            int rowLen = input.nextInt();
            System.out.print("Enter Column Length: ");
            int colLen = input.nextInt();

            int[][] matrix = new int[rowLen][colLen];

            System.out.println("Enter " + rowLen + " rows and " + colLen + " columns: ");
            for (int i = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = (int) (Math.random() * 101);
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix[i].length; j++) {
                    System.out.printf("%-3d", matrix[i][j]);
                }
                System.out.println();
            }
        }

    }
}