import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class Updating {
    public static void main(String[] args) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("files/example.txt", true))) {
            writer.write("This text is append to the file.");
            writer.newLine();
            System.out.println("Text appended successfully.");
        } catch(IOException e) {
            System.out.println("Failed to update the file");
            e.printStackTrace();
        }
    }
}
