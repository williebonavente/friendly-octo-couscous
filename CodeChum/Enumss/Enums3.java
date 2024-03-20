package Enumss;
import java.util.Scanner;

public class Enums3 {
    
    enum DesignFlags {
        BOLD(53),
        ITALICS(73),
        UNDERLINE(15);

        private int value;
        DesignFlags(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

        public static DesignFlags fromValue(int value) {
            for(DesignFlags flag: DesignFlags.values()) {
                if(flag.getValue() == value) {
                    return flag;
                }
            }
            return null;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter design flag: ");
        int number = in.nextInt();
        if (DesignFlags.fromValue(number) != null) {
            System.out.println(DesignFlags.fromValue(number).name());
        } else {
            System.out.println("Not a valid design flag");
        }
        in.close();
    }
}
