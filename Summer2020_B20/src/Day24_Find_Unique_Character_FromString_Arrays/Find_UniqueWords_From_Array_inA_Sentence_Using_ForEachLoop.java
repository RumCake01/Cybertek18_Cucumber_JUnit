package Day24_Find_Unique_Character_FromString_Arrays;

public class Find_UniqueWords_From_Array_inA_Sentence_Using_ForEachLoop {
    public static void main(String[] args) {

        // FIND UNIQUE ELEMENTS IN THE ARRAY STRING USING FOR EACH LOOP


        String[] words = {"C#", "C#", "Java", "Python", "Python", "C++"};
        // we need to find frequency of all 6 elements


        for (String each : words) { // each here represents every single string in the string s
            String s = each;
            int count = 0; // this variable count the frequency of the string words

            for (String b : words) {
                if (each.equals(b)) {
                    count++;
                }
            }
            if (count == 1) { // this means it is unique, so the word will be printed out
                System.out.println(s);
            }

        }
    }
}