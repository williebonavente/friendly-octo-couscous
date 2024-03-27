import java.util.Scanner;

public class OhmsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String COLOR_CODES[] = {
                "black", "brown", "red", "orange",
                "yellow", "green", "blue", "violet",
                "gray", "white"
        };

        char answer = 'Y';

        do {
            System.out.print("Enter the colors of the resistor's three bands, beginning with the");
            System.out.println(" band nearest the end. Type the colors in lowercase letters only,");
            System.out.println("NO CAPS.");

            // get the color of the bands
            System.out.print("Band 1 => ");
            String band1 = scanner.nextLine();

            System.out.print("Band 2 => ");
            String band2 = scanner.nextLine();

            System.out.print("Band 3 => ");
            String band3 = scanner.nextLine();

            // initializing the digits
            int d1 = search(COLOR_CODES, COLOR_CODES.length, band1);
            int d2 = search(COLOR_CODES, COLOR_CODES.length, band2);
            int d3 = search(COLOR_CODES, COLOR_CODES.length, band3);

            // get the digit of the band1 and band2
            long combD = d1 * 10 + d2;
            //calculate the value multiplier
            long power = (long) Math.pow(10, d3);

            //calculate the ohms
            long ohms = combD * power;
            
            //converting the ohms to kilo ohms
            long ohmsK = ohms / 1000;

            System.out.println("Resistance value: " + ohmsK);
            System.out.println("Do you want to decode another resistor?");
            System.out.print("=> ");
            answer = scanner.nextLine().charAt(0);
        } while (Character.toUpperCase(answer) != 'N');
        scanner.close();
    }

    // search function
    public static int search(String[] arrColors, int size, String target) {
        for (int i = 0; i < size; i++) {
            if (arrColors[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}