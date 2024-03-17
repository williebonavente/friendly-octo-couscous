
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

                default:
                    System.out.printf("%50s", "Please Enter a valid number (1-2)\n");
                    break;
            }

            System.out.print("\nDo another conversion (Y or N)=> ");
            charN = in.next().charAt(0);

        } while (charN != 'N' && charN != 'n' );

    }

    // prompt the menu
    static int get_problem() {
        System.out.println("\nSelect the form that you would like to convert to slope-intercept form: ");
        System.out.println("1) Two-point form (you know the points on the line)");
        System.out.println("2) Point-slope form (you know the line's slope and one point)");
        System.out.print("=> ");
        int selectProblem = in.nextInt();
        return selectProblem;
    }

    static double[] get2_pt() {
        System.out.print("\nEnter the x-y coordinates of the first point separated by a space=> ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        System.out.print("Enter the x-y coordinates of the second point separated by a space=> ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        return new double[] { x1, y1, x2, y2 };
    }

    static double[] get_pt_slope() {
        System.out.print("\nEnter the slope=> ");
        double slope = in.nextDouble();
        System.out.print("Enter the x-y coordinates of the point separated by a space=> ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();

        return new double[] { slope, x1, y1 };

    }

    static double[] slope_intcpt_from2_pt(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double y_intercept_b = y1 - (slope * x1);

        return new double[] { slope, y_intercept_b };
    }

    static double intcpt_from_pt_slope(double slope, double x1, double y1) {
        double y_intercept = y1 - (slope * x1);
        return y_intercept;
    }

    static void display2_pt(double x1, double y1, double x2, double y2) {
        System.out.println("\nTwo-point form");
        System.out.println("      (" + String.format("%.2f",y2) + " - " + String.format("%.2f",y1) + ")");
        System.out.println("m = ------------------");
        System.out.println("      (" + String.format("%.2f",x2) + " - " + String.format("%.2f",x1) + ")");
        System.out.println();
    }

    static void display2_pt_slope(double slope, double x1, double y1) {
        System.out.println("\nPoint-slope form");
        System.out.println("y - " + String.format( "%.2f", y1) + " = " + slope + "(x - " + String.format("%.2f",x1) + ")");
    }

    static void display_slope_intcpt(double slope, double y_intercept_b) {
        System.out.println("\nSlope-intercept form");
        if (y_intercept_b > -1) {
            System.out.println("y = " + String.format("%.2f", slope) + "x + " + String.format("%.2f", y_intercept_b));
        } else {
            System.out.println(
                    "y = " + String.format("%.2f", slope) + "x - " + String.format("%.2f", Math.abs(y_intercept_b)));

        }
    }

    public void closeScanner() {
        in.close();
    }

}
