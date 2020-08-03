package Day26_MultiDimensional_Arrays;

public class Frequency_Of_Char_MyPractice {
    public static void main(String[] args) {


        String str = "OOPQQ";

        String nondDuplicates = ""; // to store the non duplicate characters
        String result = "";

        // in order to find duplicates, first run it through the loop

        // now we will add each of the charcters ti the nonDuplicate
        // under the condition if its not contained yet, we want to avoid duplication string using loop
        for (int i = 0; i<=str.length()-1; i++){

            // user charAt method here to verify if the character is already contained or not:

          String s =  ""+ str.charAt(i); //this will return each character of string str, assigns it to the string s.

            // now check if it contains the same character or not


            // if the nonduplictes DO NOT contain String S (that representns each character), then assign it to result

            if( !nondDuplicates.contains(s)){
                    nondDuplicates+=s; // if the condition is true, the it will be assigned to the string nonDuplicates
            }

        }
    }
}
