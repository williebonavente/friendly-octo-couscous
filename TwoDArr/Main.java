package TwoDArr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter start: ");
        double start = in.nextDouble();
       
         while(start < 0) {
            System.out.printf("Start current value: %.2f\n", start);
            System.out.print("Enter a decimal number: ");
            double nextVal = in.nextDouble();
            start += nextVal;
        } 
        System.out.printf("Start current value: %.2f\n", start);
        in.close();
    }
}

/*
 * Iterative structures, also known as loops, are fundamental programming
 * constructs in Java that allow you to repeat a code block multiple times based
 * on specified conditions. They are essential for automating repetitive tasks
 * and controlling program flow. This guide provides an introduction to
 * iterative structures in Java, explains their syntax and usage, demonstrates
 * code snippets illustrating their placement, discusses different types of
 * loops, and highlights the importance of loops in programming.
 * 
 */

/*
 * 
 * while()
 * 
 * 
 * do {
 * 
 * }while()
 * 
 * for loop()
 * 
 * for-each()
 * 
 */

/*
 * Iterative structures are fundamental building blocks in programming. They
 * allow you to repeat code blocks based on conditions, which helps automate
 * repetitive tasks and control program flow. Loops enable you to process
 * arrays, traverse data structures, validate input, implement algorithms, and
 * perform various other tasks efficiently. Understanding and mastering loop
 * structures is essential for writing efficient and maintainable code.
 */

/*
 * Iterative structures, such as while, do...while, for, and the enhanced
 * for-each loop in Java, are powerful constructs that enable you to repeat code
 * blocks based on specified conditions. They provide flexibility and control
 * over program flow, allowing you to automate repetitive tasks and handle
 * various scenarios. By using loops effectively, you can improve the
 * efficiency, readability, and maintainability of your code.
 * 
 * Understanding the syntax, usage, and differences between loop types is
 * crucial for writing effective code. With practice and experience, you can
 * leverage iterative structures to write robust and efficient programs.
 */