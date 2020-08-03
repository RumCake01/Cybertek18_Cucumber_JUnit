package Day25_Practices_Arrays_Loops_String;

public class Remove_Duplicates {
    public static void main(String[] args) {

// reverse the string, to get single character we can use charAt method here

        String str = "nalan"; // we have two - As, and two -Ns
        // so our expected result is nal

        String result = "";
        // in order to find out if chacraters
        // are duplicated, we need to compare each charaster to each other

        // we declare a loop here with starting and ending expression

        for (int i = 0; i <= str.length() - 1; i++) {// we need to include our last character

            String characters = "" + str.charAt(i); // we converted this chart by assigning it to an empty string "" +

            // now we have all characters retrieved, now we need to compare them to each other



            // check if result contains each of the charaters, if it does, then skip, else, it will assigned to the string result
            if (result.contains(characters)) {  // check if each character is already present in the string
                // we can also give the above expression this way:
                /* if( ! result.contains(characters) ){
                result += characters;
                and skip all the rest, just print out the sout(result)
                 */


                continue;// skips the iteration and jumps to the next iteration if the above condition is true.
            } else {
                result += characters;
            }

        }

        System.out.println(result);

        System.out.println("==================================");

        // the same task performed with the while loop:


        String result2 = ""; //presents the final result

        String resultA = ""; // assigns each char from the string, so we can compare it later

        int i = 0; // this will find the length of the string

        while (i <= str.length() - 1) { // as long as this condition is true, it will print out each character and assig it result2
            resultA = "" + str.charAt(i);
            i++;

            if ( ! result2.contains(resultA)) {

                result2 += resultA;
            }
            }
            System.out.println(result2);
        }
    }
