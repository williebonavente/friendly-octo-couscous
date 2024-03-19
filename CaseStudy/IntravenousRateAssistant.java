
/** Program Name: Intravenous Rate Assistant 
 * @author Willie M. Bonavente, Kevin Joshua Delos Reyes, and Harry Asence
 * @date-started: March 16, 2024
 * @date-latest version - March 19, 2024 
 * @version: 3
 * @remarks: Implement Procedural Programming.
 * Fix the get_problem() function
 * Creating the stub function first.
 * Use the sentinel loop
 * 
 */

import java.util.Scanner;

public class IntravenousRateAssistant {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("INTRAVENOUS RATE ASSISTANT");
        System.out.println();
        // getting the return value of get_problem()
        int selectProblem;
            do {
                selectProblem = get_problem();
                switch (selectProblem) {
                    case 1:
                        double[] rate = get_rate_drop_factor();
                        double rate_ml_hr = rate[0];
                        double dropFactor = rate[1];
                        System.out.println("The drop rate per minute is " + fig_drops_min(rate_ml_hr, dropFactor) + ".\n");
                        break;
                    case 2:
                        double[] hour = get_fig_ml();
                        double get_hour = hour[0];
                        System.out.println("The rate in milliliters per hour is " + fig_ml_hr(get_hour) + ".\n");
                        break;
                    case 3:
                        double[] weight = get_kg_rate_conc();
                        double rate_ml_kg_hr = weight[0];
                        double weight_kg = weight[1];
                        double concentration = weight[2];
                        System.out.println(
                                "The drop rate per minute is " + by_weight(rate_ml_kg_hr, weight_kg, concentration) + ".\n");
                        break;
                    case 4:
                        double[] unit = get_units_conc();
                        double units_hr = unit[0];
                        double units_ml = unit[1];
                        System.out.println("The rate in milliliters is per hour  is " + by_units(units_ml, units_hr) + ".\n");
                        break; // Add a break statement here
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println();
                        System.out.printf("%50s","Please input a valid number (1-5)");
                        System.out.println();
                        break;
                }
            } while (selectProblem != 5);
        closeScanner();
    }
    /**
     * Displays a menu of problem options for the user to choose from.
     */
    static int get_problem() {
        System.out.println("Enter the  number of problem you wish to solve.");
        System.out.printf("%30s %8s %19s", "GIVEN A MEDICAL ORDER IN", " ", "CALCULATE RATE IN\n");
        System.out.printf("%3s %28s %26s", "(1)", "ml/hr & tubing drop factor", "drops / min\n");
        System.out.printf("%3s %14s %36s", "(2)", "1 L for n hr", "ml / hr\n");
        System.out.printf("%3s %35s %15s", "(3)", "mg/kg/hr & concentration in mg/ml", "ml / hr\n");
        System.out.printf("%3s %38s %12s", "(4)", "units/hr & concentration in units/ml", "ml / hr\n");
        System.out.printf("%3s %7s", "(5)", "QUIT\n");

        System.out.print("Problem => ");
        int selectProblem = in.nextInt();
        return selectProblem;
    }

    // for problem 1
    /**
     * Gets the rate and drop factor from the user.
     * 
     * @return an array containing the rate in ml/hr and the tubing's drop factor (drops/ml)
     */
    static double[] get_rate_drop_factor() {
        System.out.print("Enter rate in ml/hr=> ");
        double rate_ml_hr = in.nextDouble();
        System.out.print("Enter tubing's drop factor (drops/ml)=> ");
        double dropFactor = in.nextDouble();

        return new double[] { rate_ml_hr, dropFactor };
    }

    // for problem 2
    /**
     * Retrieves the number of hours from the user.
     * 
     * @return an array containing the number of hours entered by the user
     */
    static double[] get_fig_ml() {
        System.out.print("Enter number of hours=> ");
        double hour = in.nextDouble();

        return new double[] { hour };
    }

    // for problem 3
    /**
     * Retrieves the rate, weight, and concentration values from the user and returns them as an array.
     * 
     * @return An array containing the rate (in ml/kg/hr), weight (in kg), and concentration (in mg/ml).
     */
    static double[] get_kg_rate_conc() {
        System.out.print("Enter rate in mg/kg/hr=> ");
        double rate_ml_kg_hr = in.nextDouble();
        System.out.print("Enter patient weight in kg=> ");
        double weight = in.nextDouble();
        System.out.print("Enter concentration in mg/ml=> ");
        double concentration = in.nextDouble();

        return new double[] { rate_ml_kg_hr, weight, concentration };
    }

    // for problem 4
    /**
     * This method prompts the user to enter the rate in units per hour and the concentration in units per milliliter.
     * It then returns an array containing the entered rate and concentration.
     *
     * @return an array of type double containing the rate in units per hour and the concentration in units per milliliter
     */
    static double[] get_units_conc() {

        System.out.print("Enter rate in units/hr=> ");
        double rate_unit_hr = in.nextDouble();
        System.out.print("Enter concentration in units/ml=> ");
        double units_ml = in.nextDouble();

        return new double[] { rate_unit_hr, units_ml };

    }

    /**
     * Calculation Functions
     * 
     * 
     * Takes rate and drop factor as input parameters and returns drops/min (rounded
     * to nearest whole drop) as function value.
     */
    /**
     * Calculates the minimum number of drops required for a given infusion rate.
     *
     * @param rate_ml_hr the infusion rate in milliliters per hour
     * @param dropFactor the drop factor in drops per milliliter
     * @return the minimum number of drops required
     */
    static int fig_drops_min(double rate_ml_hr, double dropFactor) {
        double dropRate = (rate_ml_hr / 60) * dropFactor;
        return (int) Math.ceil(dropRate);
    }

    /*
     * Takes as an input parameter the number of hours over which one liter is to be
     * delivered and returns ml/hr (rounded) as function value.
     */
    /**
     * Calculates the rate of milliliters per hour based on the given number of hours.
     *
     * @param hours the number of hours
     * @return the rate of milliliters per hour
     */
    static int fig_ml_hr(double hours) {

        double rate_ml_ph = 1000 / hours;
        return (int) rate_ml_ph;

    }

    /*
     * Takes as input parameters rate in mg/kg/hr, patient weight in kg, and
     * concentration
     * of drug in mg/ml and returns ml/hr (rounded) as function value.
     */
    /**
     * Calculates the rate in milliliters per hour based on the weight, concentration, and rate per milliliter per kilogram per hour.
     *
     * @param rate_ml_kg_hr the rate per milliliter per kilogram per hour
     * @param weight the weight in kilograms
     * @param concentration the concentration
     * @return the rate in milliliters per hour
     */
    static int by_weight(double rate_ml_kg_hr, double weight, double concentration) {
        double rate_ml_hr = rate_ml_kg_hr * weight * concentration;
        return (int) rate_ml_hr;
    }

    /*
     * Takes as input parameters rate in units/hr and concentration in units/ml, and
     * returns
     * ml/hr (rounded) as function value.
     */
    /**
     * Calculates the milliliters per hour based on the given units of milliliters and hours.
     *
     * @param units_ml the number of units in milliliters
     * @param units_hr the number of units in hours
     * @return the milliliters per hour as an integer
     */
    static int by_units(double units_ml, double units_hr) {
        double ml_hr = units_hr / units_ml;
        return (int) ml_hr;
    }

    /**
     * Closes the scanner used for input.
     */
    public static void closeScanner() {

        in.close();
    }

}