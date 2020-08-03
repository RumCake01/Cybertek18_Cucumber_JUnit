package Day16_String;

public class String_Method_Contains {

    public static void main(String[] args) {


        String str = "I like to learn Java programming language";
        // we dont need to check where it is located, we just if the entire sentence
        // has the specific whatever word we need

        System.out.println(str.contains("python"));// returns falls because the sentence doesnt have the word python.
        System.out.println("==============================================================");
        System.out.println(!str.contains("python"));// retunrs true because the sentence doesnt have phython.

        System.out.println("==============================================================");
        System.out.println(str.contains("java"));
        System.out.println("==============================================================");
        System.out.println(!str.contains("JAVA"));// cares about case sensitivity.
        System.out.println("==============================================================");
    }
}
