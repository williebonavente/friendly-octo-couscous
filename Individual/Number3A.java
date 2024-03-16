/**
 * @author: Willie M. Bonavente
 * @date March 16, 2024
 * 
 *       Problem No. 3 letter A
 *       Given the following variables and their values:
 *       Sagot = true
 *       A = 2
 *       B= 4
 *       Letter = ‘c’
 *       Pi = 3.14
 *       Requirements:
 *       a) Write a Java program that prints the values of the variables above
 *       in this manner
 *       The value of A is 2 while B is 4
 *       Letter c
 *       Initial value of Sagot is true
 *       Pi contains the value 3.14
 *       Sagot is now false
 *       for the last line of output, determine if A is greater than B
 * 
 * 
 */

public class Number3A {
    public static void main(String[] args) {

        // Declared Vars => required
        boolean Sagot = true;
        int A = 2;
        int B = 4;
        char Letter = 'c';
        double PI = 3.14;

        System.out.println("The value of A is " + A + " while B is " + 4);
        System.out.println("Letter " + Letter);
        System.out.println("Initial value of Sagot is " + Sagot);
        System.out.println("PI contains the value of " + PI);
        System.out.println("Sagot now is " + (!Sagot));
        final boolean isAgreater = (A > B) ? true : false;
        System.out.println("Is A greater than B? " + isAgreater + " A = " + A + " B = " + B);

    }
}