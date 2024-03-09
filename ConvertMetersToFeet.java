import java.util.Scanner;


public class ConvertMetersToFeet {

   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a value of feet: ");
    double feet = input.nextDouble();
    double meters = feet * 0.305;
    
    System.out.println(feet + " feet is " + meters + " meters.");
    input.close();
   }
}