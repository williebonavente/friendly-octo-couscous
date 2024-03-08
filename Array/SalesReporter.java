package Array;

import java.util.Scanner;

public class SalesReporter {

    private double highestSales;
    private double averageSales;
    private SalesAssociate[] team;
    private int numbersOfAssociates; // Sames as team.length

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of sales associates: ");
        numbersOfAssociates = scanner.nextInt();
        team = new SalesAssociate[numbersOfAssociates + 1];

        for (int i = 1; i <= numbersOfAssociates; i++) {
            team[i] = new SalesAssociate();
            System.out.println("Enter data for associate " + i);
            team[i].readInput();
            System.out.println();
        }
        scanner.close();
    }

    // Compute the average and highest sales figures.
    // Precondition: There is at least one salesAssociate
    public void computeStats() {
        double nextSales = team[1].getSales();
        highestSales = nextSales;
        double sum = nextSales;
        for (int i = 2; i <= numbersOfAssociates; i++) {
            nextSales = team[i].getSales();
            sum += nextSales;
            if (nextSales > highestSales) {
                highestSales = nextSales; // highest sales so far
            }
        }
        averageSales = sum / numbersOfAssociates;
    }

    // Displays sales report on the screen.
    public void displayResults() {
        System.out.println("Average sales per associate is $" + averageSales);
        System.out.println("The highest sales figure is $" + highestSales);
        System.out.println();
        System.out.println("The following had the highest sales: ");
        for (int i = 1; i <= numbersOfAssociates; i++) {
            double nextSales = team[i].getSales();
            if (nextSales == highestSales) {
                team[i].writeOutput();
                System.out.println("$" + (nextSales - averageSales) + " above the average. ");
                System.out.println();
            }
        }

        System.out.println("The rest of performed as  follows: ");
        for(int i = 1; i<=numbersOfAssociates; i++) {
            double nextSales = team[i].getSales();
            if(team[i].getSales() != highestSales) {
                team[i].writeOutput();
                if(nextSales >= averageSales) {

                    System.out.println("$" + (nextSales - averageSales) + " above average. ");
                }
                else {
                    System.out.println("$" + (nextSales - averageSales) + " below average. ");
                    System.out.println();
            } 
            }
        }
    }

    public static void main(String[] args) {
        SalesReporter clerk = new SalesReporter();
        clerk.getData();
        clerk.computeStats();
        clerk.displayResults();
    }
}
