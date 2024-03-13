package TwoDArr;

import java.util.Random;

public class GradeExam {
    public static void main(String[] args) {
        Random random = new Random();

        char[][] answers = new char[8][10];
        // Generating random char from A to D;
        for(int i = 0; i < answers.length; i++){
            for(int j = 0; j < answers[i].length; j++){
                answers[i][j] = (char)(random.nextInt(4) + 'A');
            }
        }
        System.out.println();
        System.out.printf("%25s \n","Student's Answer ");
        for(int i = 0; i < answers.length; i++){
            boolean isFirst = true; // Reset isFirst for each row
            System.out.print("Student " + (i + 1) + "'s answers: ");
            for(int j = 0; j < answers[i].length; j++){
                if(!isFirst) {
                    System.out.print(", ");
                }
                System.out.print(answers[i][j]);
                isFirst = false;
            }
            System.out.println();
        }
        System.out.println();
        // Answer key
        char key[] = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };
        int highestScore = 0;
        int[] highestScoringStudents = new int[answers.length];
        int highestScoringStudentsCount = 0;
        // Grade all answers
        for (int i = 0; i < answers.length; i++) {
            // Grade per student
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == key[j]) {
                    ++correctCount;
                }
            }
            if (highestScore < correctCount) {
                highestScore = correctCount;
                highestScoringStudentsCount = 0;
                highestScoringStudents[highestScoringStudentsCount++] = i;
            } else if (highestScore == correctCount) {
                highestScoringStudents[highestScoringStudentsCount++] = i;
            }
            System.out.println("Student " + (i + 1) + "'s correct is " + correctCount);
        }
        System.out.println();
        System.out.printf("%25s \n","Lowest and Highest ");
        // Get the highest score
        for (int i = 0; i < highestScoringStudentsCount; i++) {
            System.out.println("Student " + (highestScoringStudents[i] + 1) + " has the highest score with a score of: " + highestScore);
        }
    }
}