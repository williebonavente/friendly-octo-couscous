import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reading {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("files/example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch(IOException e) {
            System.out.println("Failed to read from the file.");
            e.printStackTrace();
        }
        
    }
}
