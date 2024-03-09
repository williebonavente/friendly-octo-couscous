package Loops;

public class LeapYear {
    public static void main(String[]args) {
        System.out.print("Enter a year: ");
        
        int maximum = 2025;
        
        int year = (int) (Math.random() * maximum);
        System.out.println(year);
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + " is a leap year? " + isLeapYear);
    }
}
