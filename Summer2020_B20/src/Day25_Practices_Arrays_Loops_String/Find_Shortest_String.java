package Day25_Practices_Arrays_Loops_String;

import org.w3c.dom.ls.LSOutput;

public class Find_Shortest_String {
    public static void main(String[] args) {

        /* Write a program that can return the shortest string of text from a String array*/

        String[] str = {"Anam", "Nickolas", "Amir", "Nurmamet"};

        // 1. we need to find the minimum length from the string str

        int minimumLength = str[0].length();//  below:
        // we assign the index of the first element and compare it to the rest of the string by calling the length method

        // 2. next step iterate every single element by using loop:
        // firt we willdo w a regular for loop:

        for (int i = 0; i <= str.length - 1; i++) { //  to find out the minimum lenth of the string in the str.
            // since its a string  - it has a length
            int l = str[i].length();// these are length that came up by their number of letters:
            // 4 for word Anam, 8 for Nickolas 4 for Amir,  8 for Nurmamet

            if (l < minimumLength) {
                minimumLength = l;
            }
        }
        // now print out the string that has the least amout of characters, length 4 is the smallest

        for (int i = 0; i <= str.length - 1; i++) { // check how many string's lengthe are matching with the minimum
            if (str[i].length() == minimumLength)
                ; // if this string length is equal to the min number, then we can assume it is the shortest strings in the str
            System.out.println(str[i]);

            // we used two for loops here

            // the first for loop one is used to find out the min length of the string and then assign it to the int minimimlength variable
            // then we used a second loop to find out how many strings are matching the minimumLength variables
        }

        }

    }
