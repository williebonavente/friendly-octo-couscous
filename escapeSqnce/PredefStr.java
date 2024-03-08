package escapeSqnce;

public class PredefStr {
    public static void main(String[]args) {
        
        // length() method
        String str = "Hello, World!";
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // concat() method
        String str1 = "Willie ";
        String str2 = "Bonavente";
        String concatenated = str1.concat(str2);
        System.out.println(concatenated);

        // equals() and equalsIgnoreCase()
        String str3 = "Password";
        String str4 = "PassWord";

        boolean isEqual = str3.equals(str4);
        boolean isEqualIgnoreCase = str3.equalsIgnoreCase(str4);
        System.out.println("isEqual: " + isEqual);
        System.out.println("isEqualIgnoreCase: " + isEqualIgnoreCase);

        // charAt()
        String str5 = "Hello, World";
        char ch  = str5.charAt(4);
        System.out.println("Character at index 4: " + ch);

        // indexOf()
        String str6 = "Willie M. Bonavente";
        int index1 = str6.indexOf('W');
        int index2 = str6.indexOf('.');
        int index3 = str6.indexOf(' ');
        System.out.println(index1 + " " +  index2 + " " + index3);
        
        // startsWith() and endsWith() // boolean
        String str10 = "Through the years";
        boolean startWithThrough = str10.startsWith("Through");
        boolean endsWithYears = str10.endsWith("years");

        System.out.println("Start with 'Through' is " + startWithThrough);
        System.out.println("End with the 'Years' is " + endsWithYears);

        // substring()
        String str11 = str10.substring(8);
        String str12 = str10.substring(0, 7);
        
		System.out.println("Substring 2: " + str12);
        System.out.println("Substring 1: " + str11);

        // replace()
        String tinyDancer = "Ballerina";
        System.out.println("Before Replacement: " + tinyDancer);
        String replacedMe = tinyDancer.replace('B', 'V');
        System.out.println("After Replacement: " + replacedMe );
    }
}