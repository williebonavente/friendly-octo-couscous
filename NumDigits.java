public class NumDigits {
    public static void main(String[] args) {
        int number = 12345;
        int numDigits = 0;
        
        do {
            number /= 10;
            numDigits++;
        } while (number != 0);
        
        System.out.println("Number of digits: " + numDigits);
    }
}