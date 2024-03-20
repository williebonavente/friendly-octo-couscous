import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingAndReading {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("files/example.txt"))) {
            writer.write("This text is written to the file.");
            writer.newLine();
            System.out.println("Text written successfully.");
        } catch (IOException e) {
            System.out.println("Failed to write to the file.");
            e.printStackTrace();
        }
    }
}
