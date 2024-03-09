package Loops;

public class BMI {
    public static void main(String[]args) {
        System.out.print("Enter weight in pounds: ");
        double weight = Math.random() * 200;
        System.err.print(weight);
        System.out.println();
        System.out.print("Enter height in inches: ");
        double height = Math.random() * 100; 
        System.err.print(height);
        System.out.println();
        
        final double KILOGRAMS_PER_POUND = 0.45359237; // constant
        final double METERS_PER_INCH = 0.0254; // constant

        // Compute BMI
        double weightInKilograms = weight *  KILOGRAMS_PER_POUND;
        double heightInMeters = height *  METERS_PER_INCH;
        double bmi = weightInKilograms / (Math.pow(heightInMeters, 2));
        
        // Display Result

        System.out.println("BMI is " + bmi);
        if(bmi < 18.5 ) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
        
    }
}
