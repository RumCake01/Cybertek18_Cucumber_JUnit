package Day35;

public class Warm_UP_return_All_Digits {

    public static void main(String[] args) {


       /* 2. write a program that can return the sum of all the digits from a string
        ex:
        input: "a1b2c3"
        output: 6
        (1+2+3= 6)
        input: "Today's date is 04/27/2020"
        output: 17
        (0+4+2+7+2+0+2+0=17)
        HINT: on ascii table, the characters between #48 ~ #57 are digits   */

        String input = "a1b2c3";
        String digit = "";
        int sum = 0;
        for(int i =0; i<=input.length()-1; i++){ // a1b2c3
            char each= input.charAt(i);

            if(each>=48 && each<=57){ // if the is between 48-57 on ascii table then it is a digit.
                sum += Integer.parseInt("" + each); // here we are converting String to Integer and then add it to the sum.



            }

        }

        System.out.println(sum);
    }
}


