package Office_Hours.Practice_07_13_2020;

public class Frequency_Of_Characters {
    public static void main(String[] args) {

        // Task find frequency of characters

        String str = "OOPQQ";// EXPECTED result here is O2P1Q2,
        // BUT after removing the duplicates we can find frequency
        // of each character from the string

        // 1 step: remove the duplicates first

        String nonDuplicates = " "; // OPQ because they appear only once

        String result = " ";

//remove duplicates from string str and store them in string nonDuplicates for that


        for(int i = 0; i<=str.length()-1; i++) {
            // length -1 gives 4 cause its the last index , and we provide iterator here
            //because we need the condition become false at some point.


            // we need to use charAt method to retrieve each character from the sString, it will return us char

            char ch1 = nonDuplicates.charAt(0);

            String s = "" + str.charAt(i);// will return us a string

            if (!nonDuplicates.contains(s)) {
                nonDuplicates += s;



            //nonDuplicated= OPQ  how many times it did occur in this sting str =  OOPQQ  ====>  O2P1Q2

        // how many times each characters of the string occurred in this string OOPQQ





            }
        }
        System.out.print(nonDuplicates);






        }

    }
