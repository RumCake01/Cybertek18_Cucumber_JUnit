package Day16_String;

public class String_Practice_06_29_Check_If_words_Are_Same_OrNot {
    public static void main(String[] args) {
        /*
        Program accepts 3 words and :
            - if they are same length:      print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
         */

        String str1 = "ab";
        String str2 = "c";
        String str3 = "ac";

        // we can declare boolean here:

        boolean allSame = str1.length() == str2.length() && str1.length() == str3.length();
        boolean allDifferent = str1.length()!=str2.length()&& str2.length()!=str3.length() && str1.length()!=str3.length();


        if(allSame){
            System.out.println("all words are same");

        }else if(allDifferent){
            System.out.println("all words are different");
        }else{
            System.out.println("not same nor different length");
        }




        //1. check to see if all words are same length
        // or  we can use it this way:

        //if(str1.length() == str2.length() && str1.length() == str3.length()) {
            //System.out.println("All words are same length");

            // now lets check the third condition: if all are different
        //}else if(str1.length()!=str2.length()&& str2.length()!=str3.length() && str1.length()!=str3.length()){

        //}else{
        //System.out.println("Not same nor different lengths");
        // }









    }
}
