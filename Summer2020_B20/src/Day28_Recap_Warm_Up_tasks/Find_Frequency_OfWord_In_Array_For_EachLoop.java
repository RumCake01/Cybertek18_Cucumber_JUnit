package Day28_Recap_Warm_Up_tasks;

public class Find_Frequency_OfWord_In_Array_For_EachLoop {
    public static void main(String[] args) {
       /* 2. write a program that can count the frequency of a word from an array of string
        Ex:
        arr: {"Java", "C#", "Python", "Java"};
        word: "java"
        output:
        2
        MUST USE for each loop */

        // for Each loop represents each element in the array

        String arr[] = {"Java", "C#", "Python", "Java", "JAVA", "java"};
        String word = "java";

        // how many times java occurred in the string, so we need a variable to compare a frequency

        int count = 0;

        for( String each : arr) {

            // now compare java with each elements in the array

            if(word.equalsIgnoreCase(each)){
                count++;
            }
        }
        System.out.println(count);







    }
}
