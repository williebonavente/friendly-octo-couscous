import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class OpenClose {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("files/example.txt"))) {
            String line;
            int vowelCount = 0;
            while((line = reader.readLine()) != null) {
                line = line.toLowerCase();
                for(int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);
                    if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u') {
                        vowelCount++;
                    }
                }
            }
            System.out.println("Number of vowels in the file: " + vowelCount);
        } catch(IOException e) {
            System.out.println("Failed to open or read from the file.");
            e.printStackTrace();
        }
    }
}
