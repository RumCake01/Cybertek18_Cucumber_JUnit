package Day07_Unary_ShortHand;

public class Post_VS_Pre {

    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a); // result is 11, the value increased immediately.
        System.out.println(a);
        System.out.println("============================");


        int b = 10;
        System.out.println( b++ );// now b = 10.  it is still equal to 10, first it show the current value.
        System.out.println( b-- );// now b = 11.the value is increased, change is visible after the second operation.
        System.out.println("========================");

        int c = 25;
        int d = c++; // d = 25, and c = 26.
        System.out.println(c);
        System.out.println(d);
        System.out.println("===================");
        int e = 25;
        e++;
        System.out.println(e);
        System.out.println("======================");

        int x = 8;
        int y =  x --;// int y takes value of x, and x is still 8 because the value wll change in the next sout.
        System.out.println(y);
        System.out.println(x);// the value here is changed to 7, this is a second statement, post dicrement.
        System.out.println("=============================");

        int A = 1;
        A = -A-- + A++ / -A -- * -- A;
        // A = -1 +  0 /  -1   *  - 1;
        // A = 0 / - 1 = 0
        // A = -1 + 0 * - 1'
        // A = - 1 + 0 = -1
        System.out.println(A);
        System.out.println("============================");

        int f = 50; // F = 49, F = 49, F = 50, F = 49, F = 50.
        f = --f + f++ +f-- + f++;
        // f = 49
        // f = 50 + 50 + 50 + 50
        // f = 49 + 49 + 50 + 49
        // f= 197
        System.out.println(f);



    }
}
