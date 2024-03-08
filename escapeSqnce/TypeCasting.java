package escapeSqnce;

public class TypeCasting {
    public static void main(String[] args) {
        char ch = 'A'; // A character A
        int asciiValue = (int) ch; // Explicitly casting  chart to int to get ASCII value

        System.out.println("Character: " + ch);
        System.out.println("ASCII Value: " + asciiValue);

        // Now, let's do the reverse: casting  from int  (ASCII value ) back to char
        int anotherAsciiValue = 98;
        char anotherChar = (char) anotherAsciiValue; // Explicitly casting int to char

        System.out.println("Character: " + anotherChar);
        System.out.println("ASCII Value: " + anotherAsciiValue);


    }
}