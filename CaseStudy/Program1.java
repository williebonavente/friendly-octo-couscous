
/** Program Name: Intravenous Rate Assistant 
 * @author Willie M. Bonavente
 * @date: March 16, 2023 
 * @version: 1
 * @remarks: Implement Procedural Programming.
 * 
 * Creating the stub function first.
 * Use the sentinel loop
 * 
 */

import java.util.Scanner;

public class Program1 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // title banner
        System.out.println("INTRAVENOUS RATE ASSISTANT");
        System.out.println();

        get_problem();

        System.out.print("Problem => ");
        int selectProblem = in.nextInt();

        // implement the do while here

        switch (selectProblem) {
            case 1:
                double[] results = get_rate_drop_factor();
                double rate_ml_hr = results[0];
                double dropFactor = results[1];
                System.out.println( "The drop rate per minute is "+ fig_drops_min(rate_ml_hr, dropFactor) + ".");
                break;
            case 2:
                break;
            case 3:
                get_kg_rate_conc();
                break;
            case 4:
                get_units_conc();
                break; // Add a break statement here
            case 5:
            default:
                break;
        }

        // insert do while here
        
        closeScanner();

    }

    // prompting menu
    static void get_problem() {
        System.out.println("Enter the  number of problem you wish to solve.");
        System.out.printf("%30s %8s %19s", "GIVEN A MEDICAL ORDER IN", " ", "CALCULATE RATE IN\n");
        System.out.printf("%3s %28s %26s", "(1)", "ml/hr & tubing drop factor", "drops / min\n");
        System.out.printf("%3s %14s %36s", "(2)", "1 L for n hr", "ml / hr\n");
        System.out.printf("%3s %35s %15s", "(3)", "mg/kg/hr & concentration in mg/ml", "ml / hr\n");
        System.out.printf("%3s %38s %12s", "(4)", "units/hr & concentration in units/ml", "ml / hr\n");
        System.out.printf("%3s %7s", "(5)", "QUIT\n");
        System.out.println();
    }

    // for problem 1
    // for problem 1
    static double[] get_rate_drop_factor() {
        System.out.print("Enter rate in ml/hr=> ");
        double rate_ml_hr = in.nextDouble();
        System.out.print("Enter tubing's drop factor (drops/ml)=> ");
        double dropFactor = in.nextDouble();

        return new double[] { rate_ml_hr, dropFactor };
    }

    // for problem 3
    static double get_kg_rate_conc() {
        return 0;
    }

    // for problem 4
    static double get_units_conc() {
        return 0;
    }

    /**
     * Conversion Functions
     * 
     * 
     * Takes rate and drop factor as input parameters and returns drops/min (rounded
     * to nearest whole drop) as function value.
     */
    static int fig_drops_min(double rate_ml_hr, double dropFactor) {
        double dropRate = (rate_ml_hr / 60) * dropFactor;
        return (int) Math.ceil(dropRate);
    }

    /*
     * Takes as an input parameter the number of hours over which one liter is to be
     * delivered and returns ml/hr (rounded) as function value.
     */
    static double fig_ml_hr() {
        return 0;
    }

    /*
     * Takes as input parameters rate in mg/kg/hr, patient weight in kg, and
     * concentration
     * of drug in mg/ml and returns ml/hr (rounded) as function value.
     */
    static double by_weight() {
        return 0;
    }

    /*
     * Takes as input parameters rate in units/hr and concentration in units/ml, and
     * returns
     * ml/hr (rounded) as function value.
     */
    static double by_units() {
        return 0;
    }

    public static void closeScanner() {

        in.close();
    }

}