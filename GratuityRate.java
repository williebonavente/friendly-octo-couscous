import java.util.Scanner;

public class GratuityRate {

    public static void main(String[] args)

    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter subtotal and gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        double gratuity = gratuityRate * 0.10;
        double total = subtotal + gratuity;

        System.out.println("The gratuity rate is " + "$" +gratuity + " and total is " + "$" + total);
        input.close();
    }

}

