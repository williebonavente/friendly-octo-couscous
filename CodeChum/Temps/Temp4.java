package Temps;
import java.util.Scanner;

public class Temp4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of array: ");
            int size = scanner.nextInt();
            int [] array = new int[size];
            System.out.print("Enter the numbers: ");
            for(int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
                double ave = average(size, array);
                System.out.printf("Average: %.2f", ave);
            }
        }
    }

    public static double average(int size, int[] array) {
        int sum = 0;
        for(int i = 0; i < size; i++) {
            sum += array[i];
        }
        double average = (double) sum / size;
        return average;
    }
}
