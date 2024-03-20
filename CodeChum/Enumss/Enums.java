package Enumss;
public class Enums {
    public static void main(String[] args) {
        enum Colors {
            RED,
            BLUE,
            GREEN
        }

        Colors color = Colors.RED;

        switch (color) {
            case RED:
                System.out.println("The color is red.");
                break;
            case BLUE:
                System.out.println("The color is blue.");
                break;
            case GREEN:
                System.out.println("The color is green.");
                break;
            default:
                System.out.println("Unknown color.");
                break;
        }

    }
}