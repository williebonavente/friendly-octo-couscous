package Array;

import java.util.Scanner;

public class AverageAnalyze {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = scanner.nextInt();
        double [] numbers = new double[n];
        int sum = 0;
        int counter = 0;
        System.out.print("Enter " + n + " numbers: ");
        for(int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }

        double average = sum / n;
        
        System.out.print("The numbers above average: ");
        for(int i = 0; i < n; i++) {
            if(average < numbers [i]) {
                counter++;
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Average of the array: " + average);
        System.out.println(counter + " numbers above average array");
        
        scanner.close();
    }
}
