package Selection;

import java.util.Scanner;

public class SortingInt {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter three integers: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int num3 = input.nextInt();

            if (num2 > num1) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
                System.out.println(num1 + " " + num2 + " " + num3);
                if (num3 > num2) {
                    temp = num2;
                    num2 = num3;
                    num3 = temp;
                    System.out.println(num1 + " " + num2 + " " + num3);
                    if (num2 > num1) {
                        int innerTemp = num1;
                        num1 = num2;
                        num2 = innerTemp;
                        System.out.println(num1 + " " + num2 + " " + num3);
                    }
                }

            } else if (num3 > num2) {
                int temp = num2;
                num2 = num3;
                num3 = temp;
                System.out.println(num1 + " " + num2 + " " + num3);
                if (num2 > num1) {
                    temp = num1;
                    num1 = num2;
                    num2 = temp;
                    System.out.println(num1 + " " + num2 + " " + num3);
                }

            } else {
                System.out.println(num1 + " " + num2 + " " + num3);
            }
        }
    }
}
