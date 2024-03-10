package Selection;

import java.util.Scanner;

public class RockNPaper {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("scissor(0), rock(1), paper(2): ");
            int usersPick = input.nextInt();
            int computerPick = (int) (Math.random() * 3);

            // Who wins? Condition
            if (usersPick == 0 && computerPick == 0) {
                System.out.println("The computer is scissor." + " You are scissor too. It is a draw");
            } else if (usersPick == 1 && computerPick == 1) {
                System.out.println("The computer is rock." + " You are rock too. It is a draw");
            } else if (usersPick == 2 && computerPick == 2) {
                System.out.println("The computer is paper." + " You are paper too. It is a draw");
            }
            else if (computerPick == 0 && usersPick == 1) {
                System.out.println("The computer is scissor." + " You are rock. You win!");
            } else if (computerPick == 1 && usersPick == 2) {
                System.out.println("The computer is rock." + " You are paper. You win!");
            } else if (computerPick == 2 && usersPick == 0) {
                System.out.println("The computer is paper." + " You are scissor. You win!");
            } else if (usersPick == 0 && computerPick == 1) {
                System.out.println("The computer is rock." + " You are scissor. You lose!");
            } else if (usersPick == 1 && computerPick == 2) {
                System.out.println("The computer is paper." + " You are rock. You lose!");
            } else if (usersPick == 2 && computerPick == 0) {
                System.out.println("The computer is scissor." + " You are paper. You lose!");
            }
        }
    }
}
