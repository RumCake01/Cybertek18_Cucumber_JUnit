package Day24_Find_Unique_Character_FromString_Arrays;

public class Find_Characters_From_String_Using_arrays {
    public static void main(String[] args) {

        // write a prgram that can find the unique characters from a string
        // input: aabccd     output: bd


        String str = "rumiya"; // with this string we can use first indexOf
        // and lastIndexOf which means will find only letters that appeared only once which will make them unique

        String uniques = "";

        // this action will be repeated, so we can use a loop here

        for(int i = 0; i<=str.length()-1; i++){ // i<=str.length()-1 means everything
            // single character will be assigned to the int char and it will be checked for the first and last time occurance
        // we can remove the -1 at the end and remove the = operator that will make it stop right on point.

        //now get each character from the string by using the charAt method

        char ch = str.charAt(i); //
        int firstChar =str.indexOf(ch);// returns the index of first occured undex number
        int lastChar = str.lastIndexOf(ch);//it  returns the index of character that occurred last time
            // what is the index number of that letter in the string? for example: a - first index is 0;
            // then we have another a - which is the indexcis 1, so that the last time it occurred in the string
            // if letter only occured one in the string, that means that character is unique and thats what we want to be printed out
            // so the letter b will be concated to the String uniques below.


            // if the character only occured once in the indexOf(first index) and the lastIndexOf(last index) = this character is unique
            if(firstChar==lastChar){
            uniques +=ch;
            }

        }
        System.out.println(uniques);









    }
}
