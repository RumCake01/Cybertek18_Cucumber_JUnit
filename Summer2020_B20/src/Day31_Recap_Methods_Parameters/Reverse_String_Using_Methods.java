package Day31_Recap_Methods_Parameters;

public class Reverse_String_Using_Methods {

    // reverse a string and Identify if the string is a palindrome

    // first find a reversed value, then compare

    public static void main(String[] args) {

        String name = "level";
        String a = reverseString (name);
        System.out.println(reverseString(name));
        System.out.println(name.equalsIgnoreCase(reverseString(name)));

    }

    public static String reverseString(String word) {
        String expectedResult = "";

        // first get the length of the string

        for (int i = word.length() - 1; i >= 0; i--) { // once it runs here then we can get eac character one by one
            expectedResult += word.charAt(i); // will get us each character and assign it to expectedResult. \


        }
        return expectedResult;
    }
}