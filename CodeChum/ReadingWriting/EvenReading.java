import java.io.*;

public class EvenReading {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
        String line;
        while((line = reader.readLine()) != null) {
            int number = Integer.parseInt(line);
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
        reader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"));
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                writer.write(i + "\n");
            }
        }
        writer.close();
    }
}