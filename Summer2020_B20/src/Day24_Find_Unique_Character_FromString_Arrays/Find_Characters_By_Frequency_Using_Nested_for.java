package Day24_Find_Unique_Character_FromString_Arrays;

public class Find_Characters_By_Frequency_Using_Nested_for {

    public static void main(String[] args) {

        // we can also use scanner here, we can just change the following string below to the new string:
        //String str = "aabcc" change this to String str = scan.next();
        String str = "aabcc";
        String expectedResult = "";


        // WE CAN USE THIS APPROACH TO ANY UNIQUE TASK

        // how to retrieve first character of the string? - -by using charAt method
        // we can assign it to char variable

        // this j represents from zero till the last index,
        for(int j = 0; j<=str.length()-1; j++) {// we need the frequency of every single character

            char ch1 = str.charAt(j); // change this to j
            // now we want to know how many times a (index 0) occured in the string, count frequency
            // by comparing a charac with every single character in the string
            int count = 0;
            // contains doesnt work  here
            //in order to compare we need to use charAt method at least 5 times, instead of repeating it 5 times
            //we can create a loop that will iterate every singles indexes in the string

            for (int i = 0; i <= str.length() - 1; i++) {
                // now to get every single character use charAt method and it will repeated
                // as many times as there are chacrters in the string,
                // for example 5 in this case since there are 5 letters in the string

                // ch1 will be compared to the char each and if it matched that means it already occured already in the string
                char each = str.charAt(i);
                if (ch1 == each) { // first time it will take letter, and then it will compare, since there are 2 letters a, that means it will change the count to = 1 + 1
                    // then it will do the same thing w letter b. and it only one letter so it will not count it.
                    // everytme it is matching, that means it occurred, so if it occurd it counts as 1, and then increases the count by 1.
                    count += 1;

                    // now create a condition if its unique assign it to the String expected result,
                    // unique means frequesncy of occurrency is 1, only one time in the entire  string
                    // create if condition and then multiple

                }
            }
            if (count == 1) {// if occured only once, then it is unique and will be assigned to the String expectedResult
                expectedResult += ch1;

            }
        }
            System.out.println(expectedResult);// will print out how many each charac appeared in the string
        }
    }



