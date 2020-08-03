package Day05_ArithmeticsOperations;

import java.sql.SQLOutput;

public class Practice {

    public static void main(String[] args) {
        int a = 5 + 2 * 4; // 2*4= 8
                            // 5 + 8 = 13

        System.out.println(a);

        int b = 10 / 2 - 3; // 10 / 2 = 5 - 3 = 2.

        System.out.println(b);

        int c = 8 + 12 * 2 - 4;
                // 8 + 24 - 4 = 20
        System.out.println(c);

        int d = 4 + 17 % 2 - 1; // the remainder goes first: 17/2 =
                                // 4 + 1 - 1 = 4
        System.out.println( 5 + 5 /5 ); // = 6
        System.out.println( (5+5) / 5);// 10 / 5  = 2
        System.out.println( (5+5) / 5.0); // 10 /5.0 = 2.0

        double y = 5 * 2 / 3.0 + (4 * 3); // (4*3) = 12; 5*2 = 10; 10/3 = 3; 3 + 12 = 15.
        System.out.println(y);

        double t = 10/3.0;
        System.out.println(t);


    }
}
