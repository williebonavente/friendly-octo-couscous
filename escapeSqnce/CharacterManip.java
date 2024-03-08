package escapeSqnce;

public class CharacterManip {
    public static void main(String[] args) {
        
        char ch = 'a';
        
        // isLetter
        System.out.println(Character.isLetter('a'));

        // isDigit 
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isDigit('4'));

        // toUpperCase and toLowerCase
        System.out.println("Original Character: " + ch);
        System.out.println("Uppercase: " +  Character.toUpperCase(ch));
        System.out.println("Uppercase: " +  Character.toLowerCase(ch));

        // for alphanumeric -> isLetterOrDigit
        System.out.println(Character.isLetterOrDigit('9'));

        // for white spacing -> isWhiteSpace
        System.out.println(Character.isWhitespace('\n'));

        //  boolean for case sensitivity of the characters = isLowerCase, isUpperCase
        System.out.println(Character.isLowerCase(ch));
        System.out.println(Character.isUpperCase(ch));
        
        // boolean for SpaceChar 
        System.out.println(Character.isSpaceChar(' '));

        // isISOControl -> ISO  characters are non-printable characters
        System.out.println(Character.isISOControl('\t'));
        System.out.println(Character.isISOControl('A'));
        
        //  isPunctuation -> punctuation checker
        System.out.println(Character.isISOControl('!'));
        
        // isDigit and digit
        System.out.println(Character.isISOControl('f'));
        System.out.println(Character.isISOControl('9'));

        int value = Character.digit('f', 16);
        System.out.println("Integer value of 'f' in hexadecimal: " + value);
    }
}
