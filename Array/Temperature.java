package Array;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many temperatures do you have?: ");
        int size = scanner.nextInt();
        double [] temperatures = new double[7];
        double sum = 0;
        System.out.println("Enter " + size + " temperatures: ");
        for(int index = 0; index < size; index++) {
            temperatures[index] = scanner.nextDouble();
            sum += temperatures[index];
        }
        double average = sum / size;
        System.out.println("The average temperature is " + average);

        // Display each temperature and its relation to the average:
        System.out.println("The temperatures are");
        for(int index = 0; index <  size; index++) {
            if(temperatures[index] < average) {
                System.out.println(temperatures[index] + " below average");
            }
            else if (temperatures[index] > average) {
                System.out.println(temperatures[index] + " above average");
            }
            else {
                System.out.println(temperatures[index] + " equals average");
            }
        } 
        scanner.close();
    }
}
