package Day24_Find_Unique_Character_FromString_Arrays;

public class Find_UniqueWords_From_Array_inA_Sentence_FOOR_Loop {

    public static void main(String[] args) {


// FIND UNIQUE ELEMENTS IN THE ARRAY STRING USING FOR LOOP

        String[] words = {"C#", "C#", "Java", "Python", "Python", "C++"};
        // we need to find frequcies of all 6 elements

        // and whichever frequecy is equal to 1 - then it means it is unique and we need to print it out


        for (int j = 0; j <= words.length - 1; j++) { // this j will represent all the elements array


            // 1. retrieve first element in the array
            String s = words[j];// now we want to find out how many times String s occurred in the word string

            int count = 0; // the purpose is to store/assign the frequency of string s.

            // 2. now calculate the frequency, compare it in a loop so it can iterate each element in the array

            for (int i = 0; i <= words.length - 1; i++) {
                String each = words[i]; // retrieve it by giving its index number, first it will retrieve all of them
                // if String s is matching to the String each

                if (s.equals(each)) { // if condition is true we can increase our count by 1
                    // if it equals that mean the element has occurred in the string and count will be increased by 1.

                    count++;

                }

            }
            if (count == 1) {// then we can print out the element from the String words to the console
                System.out.println(s);
            }

        }

    }
}