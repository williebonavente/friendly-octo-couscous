package Selection;

import java.util.Random;

public class RandomPoint {
    public static void main(String[] args) {
        Random random = new Random();
        int point1 = random.nextInt(201) - 100; // Generate random number between -100 and 100
        int point2 = random.nextInt(201) - 100; // Generate random number between -100 and 100
        int width = 100; // for center
        int height = 200;
        if (point1 == 0 && point2 == 0) {
            System.out.println("width = " + width + " height = " + height);
        } else if (point1 > 0 && point2 > 0) {
            System.out.println("width = " + (width + point1) + " height = " + (height + point2));
        } else if (point1 > 0 || point2 < 0) {
            System.out.println("width = " + (width + point1) + " height = " + (height - point2));
        } else if (point1 < 0 || point2 > 0) {
            System.out.println("width = " + (width - point1) + " height = " + (height + point2));
        }

        else {
            System.out.println("width = " + (width - point1) + " height = " + (height - point2));
        }

    }
}
