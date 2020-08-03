package Day23_Arrays;


public class Freqeuncy_OF_Chars {
    public static void main(String[] args) {

        /*
        write a prgram that can return the frequency of every single characters from the string:
            ex:
                str1 = "aabbccaa";
                output: a4b2c2
                HINT:
                    easier approach:
                            1. remove duplicates ==> str2 = "abc"
                            2. then find each of str2' character' frequency in str1 ==> 4, 2, 2
                            3. result: a4b2c2
                        previous section we leaned how to find the frequency of one character. you will need to repeat the same steps
         */


        String str = "ABAB"; // original given string
        String nonDup = ""; // string we will have after removing the duplicates
        String result = "";// string for expected result

        for (int i = 0; i <= str.length() - 1; i++){
            ;// i<= means should stop when it reaches the last character in the entire word
// now we need to get each character from the string using charAt method//
        String ch = "" + str.charAt(i); // will check every character A, B, A, B

        // if the string doesnt contain the char:

        if (!nonDup.contains(ch)) {
            nonDup += ch;

        }
    }
        System.out.println(nonDup);
        //str = "ABAB"  nonDup = "AB"


        char ch  = nonDup.charAt(0);
        int count = 0;


        // after we know the frequency of A we can concate the result and then we can concat the frequency which is the result"
        result +="" + nonDup.charAt(0) + count; // we concat to an empty "" so that it retunrs us a string

        // now we repeat the same steps one more time using for loop:

        for (int j = 0; j<=nonDup.length()-1; j++){ // we used for loop here to remove duplicates from Str
                for (int i = 0; i <=str.length()-1; i++) {
                if (str.charAt(i) == ch) { // will return each char in the string and if it is matching then
                count += 1;
                }
            }
            result +="";
        }




    }
}
