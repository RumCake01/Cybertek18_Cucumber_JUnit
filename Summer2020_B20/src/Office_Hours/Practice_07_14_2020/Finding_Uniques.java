package Office_Hours.Practice_07_14_2020;

public class Finding_Uniques {

    public static void main(String[] args) {

        // find unique characters in
        // first find the

        String str = "ABABC";
        // we want to find the unique character from this string

        // we need another string to store the outcome below
        String expectedResult = "";

        // we need find frequency of every single character, if its unique it has to be assigned to expected result
        // we can for loop here to find characters then use

        for (int j = 0; j <str.length(); j++) {

            char ch = str.charAt(j); // passed the index of each of the  letter from the string which are now in the for loop under J.
            int count = 0; // show frequency of the char ch variable

            for (int i = 0; i <= str.length() - 1; i++) { // helps us to calculate frequency and assign it to char each
                char each = str.charAt(i);
                System.out.println(ch);

                if (each == ch) {
                    count++;
                }
            }
            // now check if the frequency is equal to 1 (meaning it was used only one time in the entire string)
            if (count == 1) {
                expectedResult += ch; // then that letter will be assigned to the expectedResult
            }
        }
            System.out.println(expectedResult);

    }
}
