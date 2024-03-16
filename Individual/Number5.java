
/**
 * @author: Willie M. Bonavente
 * @date March 16, 2024
 * 
 *       Problem No. 5
 *       Write a program that declares a variable that represents the minutes
 *       worked on a job
 *       and assign a value. Display the value in hours and minutes. For
 *       example, 125
 *       minutes becomes 2 hours and 5 minutes
 *       Sample output: Given : 125 minutes
 * 
 *       Converted hours: 2 hours and 5 minute/s
 */

public class Number5 {
    public static void main(String[] args) {
        // Declared Variable in minutes, to be converted.
        int minutesJob = 125; // variable that represents the minutes worked on a job
        // converting to hours and its excess min
        int hours = minutesJob / 60;
        int excessMin = minutesJob % 60;

        // Output
        System.out.println("Given: " + minutesJob);
        System.out.println("Converted hours: " + hours + " hours and " + excessMin + " minute/s");

    }
}
