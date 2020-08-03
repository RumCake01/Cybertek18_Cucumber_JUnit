package Day29_Custom_Methods;

public class Palindrome_task {

    /*
    kayak ==> kayak - true
    Java ==> avaj - false
     */
    public static void main(String[] args) {


        palindrome("redivider");

    }






    public static void palindrome(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }


        System.out.println(reversed.equalsIgnoreCase(word));
    }
}
