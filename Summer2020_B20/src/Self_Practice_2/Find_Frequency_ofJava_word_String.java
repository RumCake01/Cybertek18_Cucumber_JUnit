package Self_Practice_2;

import java.util.Scanner;

public class Find_Frequency_ofJava_word_String {

    public static void main(String[] args) {

        // find frequency of word
        //Scanner scan = new Scanner(System.in);
       // System.out.println("enter a string");
       // String[] str = scan.nextLine().toLowerCase();

        String [] arr = {"MAMA", "mama","maMA","PAPA", "BROTHER", "SISTER"};

        //int a = str.length(); // gets the length of the string entered by the user
        int count = 0;

        //String str = "javaJavajavaJAVAJAvA".toLowerCase();

        /*one nemthod using sustring and count
        // since we our string here and we know each word has 4 characters we can use it as main count of each word
// wheneever it is matching we can count frequency.


        for (int i = 0; i <= str.length() - 4; i++) {
            String a = str.substring(i, i+4);
            if (a.equalsIgnoreCase("java")) { // substring returns us string
                count++;
            }
        }
        System.out.println("java" + count); */

        // using contain and replace

       /* while(str.contains("java")){
            str = str.replaceFirst("java", "");
            count++;

        }
        System.out.println("java" + count);*/


        /* for(int i =0; i<=str.length()-a; a++) {
            if (str.contains("java")) {
                count++;
            }
        }
        System.out.println(count+"java"); */

        // frequency of word in arrays using for each loop

        for(String each : arr){
            if(each.toLowerCase().contains("mama")) {
                count++;
            }

        }
        System.out.println("mama " + count);
    }
}