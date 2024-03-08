import java.util.Scanner;

public class EvaluateExpression{

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the value  of (r): ");
            double r = input.nextDouble();
            System.out.print("Enter the value  of (a): ");
            double a = input.nextDouble();
            System.out.print("Enter the value  of (b and c): ");
            double b = input.nextDouble();
            double c = input.nextDouble();
            System.out.print("Enter the value of t: ");
            double t = input.nextDouble();
            System.out.print("Enter the value of d: ");
            double d = input.nextDouble();
            // Evaluated Expression
            // a.
            System.out.println( ( 4 / (3 * (r + 34) )) - (9 * (a + b * c )) + ((3 + d * (2 + a)) / (a + b*d)) );
            System.out.println((5.5 * Math.pow(r + 2.5, 2.5 + t)));
        }

        
    }
}