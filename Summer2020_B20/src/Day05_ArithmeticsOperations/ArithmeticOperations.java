package Day05_ArithmeticsOperations;

import org.w3c.dom.ls.LSOutput;

public class ArithmeticOperations {

    public static void main(String[] args) {


        System.out.println( 20 + 3 - 2 + 1);
                            // 23 - 2 + 1
                            // 21 + 1
                            //final result is 22.
        System.out.println( 20 * 3 );
        System.out.println( 2 + 3 - 1 * 4 );
                            // 1 * 4 = 4 - multiplication will be first to go
                            // 2 + 3 - 4 = 5 - 4 = 1

        System.out.println( 10/3 ); // int / int will return int, result will be 3.
        System.out.println( 10.0/3 ); // double / int will return double, result will be 3.3333333
        System.out.println( 10/ 3.0 ); // int / double will return double, result will be 3.33333
        System.out.println( 10.0 / 3.0 ); // double / double will return a double number 3.33333333

        System.out.println( 10 % 4 ); // to calculate remainder start with 10/4 = 2, and then we calculate next: 10 - (4*2) = 2.
        System.out.println( 30 % 8); // 30 /  8 = 3
                                // to find the remainder: 30 - (8 * 3) = 30 - 24
                                // 30 - 24 = 6
        System.out.println( 99 % 4); // 99/4 = 24
                                //calculate the remainder: 99 - (4*24) = 96 = 99 - 96 =  3

    }


}
