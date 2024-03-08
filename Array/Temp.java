package Array;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = scanner.nextInt();
        double[] numbers = new double[n];
        double sum = 0;

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }
        double average = sum / n;

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }
        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " + count);
        scanner.close();

        /*
         * Importance of Arrays
         * Arrays are fundamental to programming in Java and offer the following
         * benefits:
         * 
         * Efficient storage and access: Java arrays provide efficient storage and
         * retrieval of elements. They enable direct access to elements using their
         * indices, allowing for fast and efficient data manipulation.
         * 
         * Data organization: Arrays allow you to organize related data elements into a
         * single entity, making it easier to work with collections of data.
         * 
         * Iteration and processing: Arrays are commonly used in loops to iterate over
         * elements and perform operations on them. They enable you to process large
         * amounts of data efficiently.
         * 
         * Versatility: Arrays can store elements of any data type, including integers,
         * characters, floating-point numbers, and even user-defined types.
         * 
         * Flexibility: In Java, arrays have a fixed size after initialization, but you
         * can use other data structures like ArrayLists to handle varying amounts of
         * data dynamically.
         * 
         * Widely used: Arrays are a foundational concept used in many algorithms, data
         * structures, and programming techniques. Understanding arrays is essential for
         * becoming proficient in Java programming.
         * 
         */
    }
}
