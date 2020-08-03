package Day24_Find_Unique_Character_FromString_Arrays;

import java.util.Arrays;

public class String_Methods_Using_Arrays {
    public static void main(String[] args) {


        // toCharArray Method to create an array from the String



        String str = "ABCD";
        char[] ch = str.toCharArray();

        System.out.println( Arrays.toString(ch) );

        // the outcome here will be [A, B, C, D]

        System.out.println("======================================================================");

        String str1 = "DCEBA";
        String str2 = "ADCBE";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        //now we need to use sort method

        Arrays.sort(ch1); // this will be sorted into ascending order, alpahbetical order
        Arrays.sort(ch2);// this will be sorted into ascending order

        // now we need compare these two sorted arrays

        boolean r1 = Arrays.equals(ch1, ch2);
        System.out.println(r1);

        System.out.println("======================================================================");





        // String Method 2. SPLIT


        String sentence = "I Love Programming Language";

        // we want to get Language Programming Love I by reversing it
        // we need to get each words out of that String and put them into data structure

        // we can split the string by space method

        // we have 3 spaces in that sentence

        String [] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        // we have 4 elements in the sentence above, and we have indexes from zero to 3.

        // we need to print array in the reverse order now, staring from last index to the first

        for(int i =words.length-1; i>=0; i--) {
// we start here with the end word first, and then keep moving the left end of the sentence until we reach index zero,
            // and provide decrement operator

            System.out.print(words[i] + " "); // we add "" for space between the elements
        }
        System.out.println();

        System.out.println("======================================================================");

        String s = "JAVA";
        String[] array = s.split(""); // this will return String Array, thats why we can assign it to String array
        // if we dont give anything "" it will be separated by the space
        // every signle element here is a String


        // to get the array we need to use toString method
        System.out.println(Arrays.toString(array));

        char [] c = s.toCharArray();// every single elements are char data type
        System.out.println(Arrays.toString(c));// will print out char because we declare char c
        // print array variable itself that's why need toString method


    }
}
