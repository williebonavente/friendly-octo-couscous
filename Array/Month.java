package Array;

import java.util.Scanner;
public class Month {
    public static void main(String[]args) {
        String[]months = {"January", "February", "March", 
                            "April", "May", "June", "July", "August",
                            "September", "October", "November", "December"};

        // Traversing all months
        for(int i = 0; i < months.length; i++) {
            System.out.println(months[i] + " ");
        }
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a month a number (1-12): ");
        int monthNumber = scanner.nextInt();

        System.out.println("The month is " + months[monthNumber - 1]);
        scanner.close();
        
    }
}
