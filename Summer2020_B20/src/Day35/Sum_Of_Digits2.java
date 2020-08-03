package Day35;

public class Sum_Of_Digits2 {

    public static void main(String[] args) {

/*
 2. write a program that can return the sum of all the digits from a string
        ex:
        input: "a1b2c3"
        output: 6
        (1+2+3= 6)
        input: "Today's date is 04/27/2020"
        output: 17
        (0+4+2+7+2+0+2+0=17)
        HINT: on ascii table, the characters between #48 ~ #57 are digits
 */
        String input = "a1b2c3";
        int sum = 0;
        for( char ch : input.toCharArray()){
            if(Character.isDigit(ch)){
                // now convert it to Integer
                sum+=Integer.parseInt("" + ch);

            }
        }

        System.out.println(sum);
    }
}
