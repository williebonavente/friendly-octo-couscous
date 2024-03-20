package Enumss;
import java.util.Scanner;

public class DeckOfCard {
    enum Suit {
        CLUB(1),
        DIAMOND(2),
        HEART(3),
        SPADE(4);

        private int value;

        Suit(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = in.nextInt();
            Suit[] suits = new Suit[n];
            for (int i = 0; i < n; i++) {
                while (true) {
                    System.out.printf("Enter number %d: ", i + 1);
                    int num = in.nextInt();
                    if (num >= 1 && num <= 4) {
                        suits[i] = Suit.values()[num - 1];
                        break;
                    } else {
                        System.out.println("Invalid suit!");
                    }
                }
            }
        }
    }
}
