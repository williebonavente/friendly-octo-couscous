package Enumss;
import java.util.Scanner;

public class Enums5 {
    enum Currency {
        PHP("Philippines"),
        USD("USA"),
        CAD("CANADA"),
        GBP("BRITAIN");

        private final String value;

        Currency(String value) {
            this.value = value;
        }

        public String getCurrency() {
            return value;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter currency: ");
        String select = in.nextLine();

        Currency currency = Currency.valueOf(select);

        switch (currency) {
            case PHP:
            case USD:
            case CAD:
            case GBP:
                System.out.println(currency.getCurrency());
                break;
            default:
                System.out.println("Invalid currency");
        }

        in.close();
    }
}