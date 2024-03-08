package escapeSqnce;

public class Bitwise {
    public static void main(String[] args) {
        int num1 = 10; // Binary: 0000 1010
        int num2 = 6; // Binary: 0000 0110

        int result;
        result = num1 & num2; // Bitwise AND
        System.out.println("AND Result: " + result);
        result = num1 | num2; // Bitwise OR
        System.out.println("OR Result: " + result);
        result = num1 ^ num2; // BITWISE XOR
        System.out.println("XOR Result: " + result);
        result = ~num1; // Complement
        System.out.println("Complement Result: " + result);
        result = num1 << 2; // Left shift by 2: 0010 1000 (40 in decimal)
        System.out.println("Left Shift Result: " + result);
        result = num2 >> 1; // Right shift by 1: 0000 0011 (3 in decimal)
        System.out.println("Right Shift Result: " + result);

    }
}
