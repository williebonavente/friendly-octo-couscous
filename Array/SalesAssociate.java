package Array;

/*
    Class for sale associate records.
 */
import java.util.Scanner;

public class SalesAssociate {
    private String name;
    private double sales;

    public SalesAssociate() {
        name = "No record";
        sales = 0;
    }

    public SalesAssociate(String initialName, double initialSales) {
        set(initialName, initialSales);
    }
    public void set(String newName, double newSales) {
        name = newName;
        sales = newSales;
    }

    public void readInput() {
        System.out.print("Enter name of sales associate: ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.print("Enter associate's sales: $");
        sales = scanner.nextDouble();
    }

    public void writeOutput() {
        System.out.println("Name: " + name);
        System.out.println("Sales: " + sales);
    }
    
    public String getName() {
        return name;
    }

    public double getSales() {
        return sales;
    }
}
