package Replits;

import Day26_MultiDimensional_Arrays.Frequency_Of_Char_MyPractice;
import org.w3c.dom.ls.LSOutput;

public class Replt_182_Find_BadWord {

    public static void main(String[] args) {

        String target = " rumcake";
        String removeFirst = target.substring(0, (target.length() - 1));
        System.out.println(removeFirst);


        String one = "rumcake";
        String two = "123";
        System.out.println(combineTwoStrings(one, two));
    }
       /* String text = "Rum Cake IS";
        String badWord = "Rum";

        System.out.println(clean());
    }


    public static String clean(String text, String badWord) {
        String uniques = "";
        int count = 0;
        for (int i = 0; i <= text.length() - 1; i++) {
            uniques = "" + text.charAt(i);
            for (int k = 0; k <= badWord.length() - 1; k++) {
                String bads = " " + badWord.charAt(i);

                if (uniques.contains(bads)) {
                    count++;
                }
                if (count == 1) {
                    System.out.println(uniques);
                }
            }

        }
        return uniques;*/

        int [] a = {10, 20, 100};

        double [] b = {20.0, 99.0, 100.1, 0.01};

    public static int findMax(int[] a ) {

    int max = a[0];

        for (int each : a) {
        if (each >max) {
            max = each;
        }
    }
        return max;
}

    public static double findMin (double [] b) {
        double min = b[0];
        for (double each : b) {
            if (each < min) {
                min = each;
            }
        }
        return min;

    }



    public static String removeFirst(String target) {


      String withoutFirst = target.substring(1, target.length()-1);

        return withoutFirst;
    }
// combines Two String One character at a time.
    public static String combineTwoStrings (String one, String two){
    String result = "";

            for (int i = 0; i<one.length() || i<two.length(); i++){
                if(i<one.length()) {
                    result += one.charAt(i);
                }
                    if(i<two.length()){
                        result+=two.charAt(i);
                    }
                }
                return result;
            }
}




