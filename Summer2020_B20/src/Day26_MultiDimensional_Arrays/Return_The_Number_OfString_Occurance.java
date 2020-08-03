package Day26_MultiDimensional_Arrays;

import java.util.Arrays;

public class Return_The_Number_OfString_Occurance {
    public static void main(String[] args) {


        // write a program that can return the number of appearances of "java" and "python" anywhere in the sentence

        //count how many times java occurred and how many times python occurred
        String sentence = "java Java Python python  Java python java Python Java python Java Python ";

        // create array from the string sentence by using char array creates
        // each of the characters as char, and we can use split method as well

        String[] words = sentence.split(" "); // will return sting array, this will return string array and we can assign it to string words array
        // in order to print out array, we need to use aArrays.toString method

        System.out.println(Arrays.toString(words));
        
        // using contains methid find frequency of the words now

        int countJava = 0;
        int countPython = 0;

        // create for each loop to iterate array words

        for(String each : words){
            if(each.toLowerCase().contains("java")) { // if it contains the word then it should change the count
                // we use toLowerCase so it can match words no matter their appearance
                countJava++;

            }else if(each.toLowerCase().contains("python")) {
                countPython++;
            }
        }
        System.out.println("Java: " + countJava);
        System.out.println("Pyhton: " + countPython);

        // for the replt - sout (countJava==countPython);






    }
}
