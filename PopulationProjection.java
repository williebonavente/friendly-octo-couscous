import java.util.Scanner;

public class PopulationProjection {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        long currentPopulation = 312_032_486;
        int daysPerYear = 365;

        int birthPerSecond = 7;
        int deathPerSecond = 13;
        int immigrantPerSecond = 45;

        long secondsPerYear = daysPerYear * 24 * 60 * 60;

        long birthsPerYear = birthPerSecond * secondsPerYear;
        long deathsPerYear = deathPerSecond * secondsPerYear;
        long immigrantsPerYear = immigrantPerSecond * secondsPerYear;

        long populationChangePerYear = birthsPerYear + immigrantsPerYear - deathsPerYear;

        long totalPopulationChange = populationChangePerYear * years;

        long projectedPopulation = currentPopulation + totalPopulationChange;

        System.out.println("The projected population in " + years + " years is " + projectedPopulation);
    }
}