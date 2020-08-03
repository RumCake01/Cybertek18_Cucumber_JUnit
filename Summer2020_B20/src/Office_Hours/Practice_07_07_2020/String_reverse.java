package Office_Hours.Practice_07_07_2020;

public class String_reverse {
    public static void main(String[] args) {
        String str = "Batch20";// there are 7 characters, 6 is the last index number

        //using loop:

        String result = "";
        for (int i = 6; i >= 0; i -= 1) {  // values of i here are : 6, 5, 4, 3, 2, 1, 0
            str.charAt(i);  // place charAt method here because we are repeating it
            // the value of i here will be decreasing starting from 6 last character
            result += str.charAt(i);  // this operation does addition +=

        }
        System.out.println(result);


        // using str.length() method


        // the same thing using while loop

        String result3 = "";

        int index = str.length() - 1;

        while (index >= 0) {
            result += str.charAt(index);
            index -= 1;
        }
        System.out.println(result3);
    }
}