package Enumss;
import java.util.Scanner;

public class Enums6 {
    enum Season {
        SPRING(1),
        SUMMER(2),
        AUTUMN(3),
        WINTER(4);

        private int value;

        Season(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static void main(String[] args) {
        int selected;
        try (Scanner in = new Scanner(System.in)) {
            do {
                System.out.print("Enter an integer: ");
                selected = in.nextInt();

                if (selected == 0) {
                    break;
                }

                Season season = null;
                if (selected >= 1 && selected <= Season.values().length) {
                    season = Season.values()[selected - 1];
                } else {
                    System.exit(0);
                }

                if (season != null) {
                    switch (season) {
                        case SPRING:
                        case SUMMER:
                        case AUTUMN:
                        case WINTER:
                            System.out.println(season);
                            break;
                        default:
                            break;
                    }
                }
            } while (true);

        }
    }
}
