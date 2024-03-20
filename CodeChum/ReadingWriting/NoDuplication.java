import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NoDuplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int numNames = in.nextInt();

        Set<String> namesSet = new HashSet<>();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("people.txt"))) {
            for (int i = 1; i <= numNames; i++) {
                System.out.print("Enter name " + i + ": ");
                String name = in.next();
                if (!namesSet.contains(name)) {
                    writer.write(name);
                    writer.newLine();
                    namesSet.add(name);
                }
            }
        } catch (IOException e) {
            System.out.println("Failed to write to the file.");
            e.printStackTrace();
        }

        in.close();
    }
}