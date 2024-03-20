package FucntionparamNoReturn;
import java.util.Scanner;

public class Temp4{

    public static float computeSumOfNumbers() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            float a = scanner.nextFloat();
            System.out.print("Enter second number: ");
            float b = scanner.nextFloat();
            System.out.print("Enter third number: ");
            float c = scanner.nextFloat();

            return a + b + c;
        }
    }
    
    public static void main(String[] args) {
        System.out.print(String.format("%.2f",computeSumOfNumbers()));
    }
}