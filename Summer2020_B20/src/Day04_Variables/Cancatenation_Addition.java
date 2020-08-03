package Day04_Variables;

public class Cancatenation_Addition {
    public static void main(String[] args) {

        //addition examples: number + number
        System.out.println(12 + 13); // = 25
        System.out.println('A' + 2);// = 67, A value is taken from aski table
        System.out.println('A' + 'B'); // = 132 is addtion again from aski table

        //concatenation examples: append (using plus as add function)
        System.out.println("12" + 13); // return value here is 1213, "A" is a string,not aski table characer in this exmample ""
        System.out.println("A" + 2); // will return A2
        System.out.println("Tax:" + 3.5);// comcatenated result will be return with a
        System.out.println("Tax:" + 3.5 + '%');
        System.out.println(3.5 + 'A' + " Tax"); // "%" equals to 37 on aski tale, so 3.5 +37 + "Tax"
                                                // so the result will be 40.5 Tax

        /* anything in double quotes is a String = "3" + 4 = 34 string

        "3" + 4 + 9 = 349 - result is a String

         */
    }

}
