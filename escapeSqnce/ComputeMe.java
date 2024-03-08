package escapeSqnce;

public class ComputeMe {
	public static void main(String[] args) {
		int a = 10, b = 5;
		int sum = a + b;		  // Addition
		int difference = a - b;   // Subtraction
		int product = a * b;	  // Multiplication
		int quotient = a / b;	 // Division
		int remainder = a % b;	// Modulus
		int increment = ++a;	  // Increment
		int decrement = --b;	  // Decrement

		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);
		System.out.println("Quotient: " + quotient);
		System.out.println("Remainder: " + remainder);
		System.out.println("Increment: " + increment);
		System.out.println("Decrement: " + decrement);
	}
}

/*
 Unary operators (e.g., ++, --)
Multiplication (*), Division (/), Modulus (%)
Addition (+), Subtraction (-)


 */