/**
 * @author: Willie M. Bonavente
 * @date March 16, 2024
 * 
 *       Problem No. 4
 *       Write a program that inputs the hourly rate and number of hours worked.
 *       Compute
 *       and display the gross pay (hourly rate * hours worked), your
 *       withholding tax, which is
 *       15% of your gross pay and your net pay (gross pay – withholding tax).
 *       Sample output: Hourly rate: 104.65
 *       Hours worked: 22
 */

import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // input/output => input vars
        System.out.print("Hourly Rate: ");
        double hourlyRate = in.nextDouble();
        System.out.print("Hours worked: ");
        double hours = in.nextDouble();
        // Compute grossPay => output
        double grossPay = (hourlyRate * hours);
        // Compute with holding tax which is 15% of gross pay
        double withHoldingTax = 0.15 * grossPay;
        // Compute for  net pay (grossPay - withholding tax)
        double netPay = grossPay - withHoldingTax;
        // Display
        System.out.println("Gross pay: " + grossPay);
        System.out.println("Withholding tax: " + withHoldingTax);
        System.out.println("Net Pay: " + String.format("%.3f",netPay));
        
        in.close();
    }
}
