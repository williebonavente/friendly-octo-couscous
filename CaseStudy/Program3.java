
/**
 * Program Name: ΩMG.
 * 
 * @author Willie M. Bonavente
 * @date: March 17, 2023
 * @version: 1
 * @remarks: Implement Procedural Programming.
 * 
 *           Creating the stub function first.
 *           Use the sentinel loop
 * 
 */

import java.util.Scanner;

public class Program3 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // fix list of colors in the resistor
        final String COLOR_CODES[] = { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "gray",
                "white" };

        char choice = 'Y';

        do {
            System.out.println("Enter the colors of the resistor's three bands, beginning with the\r\n" + //
                    "band nearest the end. Type the colors in lowercase letters only,\r\n" + //
                    "NO CAPS.");
            System.out.print("Band 1 => ");
            String color1 = in.nextLine();
            System.out.print("Band 2 => ");
            String color2 = in.nextLine();
            System.out.print("Band 3 => ");
            String color3 = in.nextLine();

            int digit = -1; // Initialize digit to -1 to indicate no match found
            int digit1 = -1; // Initialize digit1 to -1 to indicate no match found
            int digit2 = -1; // Initialize digit2 to -1 to indicate no match found

            for (int i = 0; i < COLOR_CODES.length; i++) { // Start the loop from index 1
                if (color1.equals(COLOR_CODES[i])) {
                    digit = i;
                }
                if (color2.equals(COLOR_CODES[i])) {
                    digit1 = i;
                }

                if (color3.equals(COLOR_CODES[i])) {
                    digit2 = i;
                }
            }

            if (digit == -1) {
                System.out.println("Invalid color: " + color1);
            }
            if (digit1 == -1) {
                System.out.println("Invalid color: " + color2);
            }
            if (digit2 == -1) {
                System.out.println("Invalid color: " + color3);
            }

            if (digit != -1 && digit1 != -1 && digit2 != -1) {

                long combinedDigit = digit * 10 + digit1;
                long multiplier = (int) Math.pow(10, digit2);
                long ohms = multiplier * combinedDigit; // Fix: Remove 'int' keyword
                long kilo_ohms = (long) (ohms / 1000); // Optional: Cast to int if desired
                System.out.println("Resistance values: " + kilo_ohms + " kilo-ohms");
            }

            System.out.println("\nDo you want to decode another resistor?");
            System.out.print("=> ");
            while (true) {
                choice = Character.toUpperCase(in.nextLine().charAt(0));
                if (choice == 'Y' || choice == 'N') {
                    break;
                } else {
                    System.out.printf("%50s", "\nInvalid choice. Please enter y or n.\n");
                    System.out.println();
                    System.out.print("Do you want to decode another resistor: ");
                    System.out.println("=> ");
                }
            }
            System.out.println();
        } while (Character.toUpperCase(choice) != 'N');

        closeScanner();
    }

    public static void closeScanner() {
        in.close();
    }

}
