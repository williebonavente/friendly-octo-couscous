package AnotherTemps;
import java.util.Scanner;

public class Temp7 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int rows = in.nextInt();
            System.out.print("Enter number of columns: ");
            int cols = in.nextInt();
            int[][] array = new int[rows][cols];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    array[i][j] = in.nextInt();
                }
            }
            System.out.print("Sum starts at: ");
            int start = in.nextInt();
            System.out.print("Sum ends at: ");
            int end = in.nextInt();
            sumAtRange(array, start, end);
        }
    }

    public static void sumAtRange(int arr[][], int start, int end) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] >= start && arr[i][j] <= end) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Sum: " + sum);
    }
}