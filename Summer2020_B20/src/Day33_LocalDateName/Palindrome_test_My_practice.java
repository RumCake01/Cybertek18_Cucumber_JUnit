package Day33_LocalDateName;

public class Palindrome_test_My_practice {

    public static void main(String[] args) {


        palindrome("kayak");
    }


    public static void palindrome(String word){
        String reversed = "";

        for (int i = word.length()-1; i>=0; i--){
            reversed+=word.charAt(i);
        }
        System.out.println(reversed.equalsIgnoreCase(word));
    }
}
