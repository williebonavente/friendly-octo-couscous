package AnotherTemps;
import java.util.Scanner;

public class Temp1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = in.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.print("Enter value to find: ");
        int x = in.nextInt();
        exists(matrix, rows, cols, x);
        in.close();
    }

    public static void exists(int arr[][], int rows, int cols, int x) {
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == x) {
                    isFound = true;
                    break; // Exit the loop if element is found
                }
            }
            if (isFound) {
                break; // Exit the outer loop if element is found
            }
        }
        if(isFound) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
}