import java.util.Scanner;

public class QuadraticEquation {
    
    public static void main(String[]args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the value of b: ");
            double b = input.nextDouble();
            System.out.print("Enter the value of a: ");
            double a = input.nextDouble();
            System.out.print("Enter the value of c: ");
            double c = input.nextDouble();

            // Calculating qe
            double x = (-b + Math.sqrt(b * b - (4 * a * c))) / (2 * a);

            System.out.println("a: " + a + " b: " + b + " c: "+ c + " x: " + x);
        }
        
    }
}
