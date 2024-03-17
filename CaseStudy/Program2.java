
/** Program Name: Non-vertical Straight Lines. 
 * @author Willie M. Bonavente
 * @date: March 17, 2023 
 * @version: 1
 * @remarks: Implement Procedural Programming.
 * 
 * Creating the stub function first.
 * Use the sentinel loop
 * 
 */

import java.util.Scanner;

public class Program2 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        char charN = 'Y';

        do {
            int selectProblem;
            selectProblem = get_problem();
            switch (selectProblem) {
                case 1:
                    double[] coordinates = get2_pt();
                    double x1 = coordinates[0];
                    double y1 = coordinates[1];
                    double x2 = coordinates[2];
                    double y2 = coordinates[3];

                    double[] equation = slope_intcpt_from2_pt(x1, y1, x2, y2);
                    double slope = equation[0];
                    double y_intercept_b = equation[1];

                    // Display
                    display2_pt(x1, y1, x2, y2);
                    display_slope_intcpt(slope, y_intercept_b);
                    break;
                case 2:
                    double[] points = get_pt_slope();
                    double coordinate_slope = points[0];
                    double coordinate_x = points[1];
                    double coordinate_y = points[2];

                    double y_Intercept_B = intcpt_from_pt_slope(coordinate_slope, coordinate_x, coordinate_y);
                    display2_pt_slope(coordinate_slope, coordinate_x, coordinate_x);
                    display_slope_intcpt(coordinate_slope, y_Intercept_B);

                    break;

                default:
                    System.out.printf("%50s", "Please Enter a valid number (1-2)\n");
                    break;
            }

            System.out.print("\nDo another conversion (Y or N)=> ");

            while (true) {
                charN = in.nextLine().charAt(0);
                if (charN == 'Y' || charN == 'N') {
                    break;
                } else {
                    System.out.printf("%50s", "\nInvalid choice. Please enter y or n.\n");
                    System.out.println();
                    System.out.print("Do you want to decode another resistor: ");
                }
            }

        } while (charN != 'N' && charN != 'n');

    }

    // prompt the menu
    /**
     * Prompts the user to select the form they would like to convert to slope-intercept form.
     * 
     * @return The user's selection as an integer.
     */
    static int get_problem() {
        System.out.println("\nSelect the form that you would like to convert to slope-intercept form: ");
        System.out.println("1) Two-point form (you know the points on the line)");
        System.out.println("2) Point-slope form (you know the line's slope and one point)");
        System.out.print("=> ");
        int selectProblem = in.nextInt();
        return selectProblem;
    }

    /**
     * Prompts the user to enter the x-y coordinates of two points and returns an array containing the coordinates.
     *
     * @return an array of doubles containing the x-y coordinates of the two points
     */
    static double[] get2_pt() {
        System.out.print("\nEnter the x-y coordinates of the first point separated by a space=> ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        System.out.print("Enter the x-y coordinates of the second point separated by a space=> ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        return new double[] { x1, y1, x2, y2 };
    }

    /**
     * Retrieves the slope and coordinates of a point from user input.
     * 
     * @return an array containing the slope, x-coordinate, and y-coordinate of the point
     */
    static double[] get_pt_slope() {
        System.out.print("\nEnter the slope=> ");
        double slope = in.nextDouble();
        System.out.print("Enter the x-y coordinates of the point separated by a space=> ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();

        return new double[] { slope, x1, y1 };

    }

    /**
     * Calculates the slope and y-intercept of a line given two points.
     *
     * @param x1 The x-coordinate of the first point.
     * @param y1 The y-coordinate of the first point.
     * @param x2 The x-coordinate of the second point.
     * @param y2 The y-coordinate of the second point.
     * @return An array containing the slope and y-intercept of the line in the format [slope, y-intercept].
     */
    static double[] slope_intcpt_from2_pt(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double y_intercept_b = y1 - (slope * x1);

        return new double[] { slope, y_intercept_b };
    }

    /**
     * Calculates the y-intercept of a line given its slope and a point on the line.
     *
     * @param slope the slope of the line
     * @param x1 the x-coordinate of the point on the line
     * @param y1 the y-coordinate of the point on the line
     * @return the y-intercept of the line
     */
    static double intcpt_from_pt_slope(double slope, double x1, double y1) {
        double y_intercept = y1 - (slope * x1);
        return y_intercept;
    }

    /**
     * Displays the two-point form of a line equation.
     * 
     * @param x1 the x-coordinate of the first point
     * @param y1 the y-coordinate of the first point
     * @param x2 the x-coordinate of the second point
     * @param y2 the y-coordinate of the second point
     */
    static void display2_pt(double x1, double y1, double x2, double y2) {
        System.out.println("\nTwo-point form");
        System.out.println("      (" + String.format("%.2f", y2) + " - " + String.format("%.2f", y1) + ")");
        System.out.println("m = ------------------");
        System.out.println("      (" + String.format("%.2f", x2) + " - " + String.format("%.2f", x1) + ")");
        System.out.println();
    }

    /**
     * Displays the equation of a line in point-slope form.
     * 
     * @param slope the slope of the line
     * @param x1 the x-coordinate of a point on the line
     * @param y1 the y-coordinate of a point on the line
     */
    static void display2_pt_slope(double slope, double x1, double y1) {
        System.out.println("\nPoint-slope form");
        System.out.println(
                "y - " + String.format("%.2f", y1) + " = " + String.format("%.2f", slope) + "(x - "
                        + String.format("%.2f", x1) + ")");
    }

    /**
     * Displays the equation of a line in slope-intercept form.
     * 
     * @param slope          the slope of the line
     * @param y_intercept_b  the y-intercept of the line
     */
    static void display_slope_intcpt(double slope, double y_intercept_b) {
        System.out.println("\nSlope-intercept form");
        if (y_intercept_b > -1) {
            System.out.println("y = " + String.format("%.2f", slope) + "x + " + String.format("%.2f", y_intercept_b));
        } else {
            System.out.println(
                    "y = " + String.format("%.2f", slope) + "x - " + String.format("%.2f", Math.abs(y_intercept_b)));

        }
    }

    /**
     * Closes the scanner used for input.
     */
    public void closeScanner() {
        in.close();
    }

}
