import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int numNames = in.nextInt();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("files/data.txt"))) {
            for (int i = 1; i <= numNames; i++) {
                System.out.print("Enter name " + i + ": ");
                String name = in.next();
                writer.write(name);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Failed to write to the file.");
            e.printStackTrace();
        }

        in.close();
    }
}