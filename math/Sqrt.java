package math;

public class Sqrt {
    public static void main(String[] args) {
        double angle = 0.5;
        double sinResult = Math.sin(angle);
        double cosinResult = Math.cos(angle);
        @SuppressWarnings("unused")
        double tanResult = Math.tan(angle);

        System.out.printf("Sine of %.2f is %.2f%n", angle, sinResult);
        System.out.printf("Sine of %.2f is %.2f%n", angle, cosinResult);
    }
}
