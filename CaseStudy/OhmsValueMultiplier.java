
/**
 * Program Name: ΩMG.
 * 
 *  @author Willie M. Bonavente, Kevin Joshua Delos Reyes, and Harry Asence
 * @date: March 17, 2024
 * @date-latest version: March 18, 2024
 * @version: 2.5
 * @remarks: Implement Procedural Programming.
 * 
 *           Creating the stub function first.
 *           Use the sentinel loop
 * 
 */

import java.util.Scanner;

public class OhmsValueMultiplier {
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

                int digit = search(COLOR_CODES, COLOR_CODES.length, color1);
                int digit1 = search(COLOR_CODES, COLOR_CODES.length, color2);
                int digit2 = search(COLOR_CODES, COLOR_CODES.length, color3);

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

        }

        public static int search(String[] list, int size, String target) {
            for (int i = 0; i < size; i++) {
                if (list[i].equals(target)) {
                    return i;
                }
            }
            return -1;
        }

        public static void closeScanner() {
            in.close();
        }

}
