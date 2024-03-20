package AnotherTemps;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = in.nextInt();
        double [][] matrix = new double[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = in.nextDouble();
            }
        }
        average(matrix, rows, cols);
        in.close();
    }

    public static void average(double[][] matrix, int rows, int cols) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
        }
        double ave = sum / (rows * cols);
        System.out.printf("Average: %.2f", ave);
    }
}