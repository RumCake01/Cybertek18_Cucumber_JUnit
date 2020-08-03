package Replits;

public class Repl_179_Find_Uniques_methods {
    public static void main(String[] args) {

        //test your code

        System.out.println(uniqueChars("wooden-spoon"));
    }

    public static String uniqueChars(String str) {
        //TODO: write your below
        String result = "";
        int count = 0;
        for (int each = 0; each <= str.length() - 1; each++) {
            String ch = " " + str.charAt(each);
            if (result.contains(ch)) {
                count++;
            } else {
                result += ch;
            }
        }
        return result;
    }
}