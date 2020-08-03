package Day08_LogicalOperators;

public class Practice3 {
    public static void main(String[] args) {

        int b = 2;
        boolean res = ++b == 2 || -- b == 2 && --b == 2; // or if we give it post incr then we can true resut
                    // 3  == 2 || 2 == 2
                  //     FALSE  || TRUE  &&  FALSE
                        // false    &&     FALSE
                            //    END RESULT IS FALSE
                    // as long as one condition is true it will return true.
        System.out.println(res);
        System.out.println("=========================");

        int c = 5;
        boolean r2 = c++ == 6 || c-- == 5 || c == 5;
                // 5(c=6)== 6 || 6(c=5) ==5 || 5(c=5) == 5
            // returns false  || false      ||  true
        System.out.println(r2);

        System.out.println("=========================");


        boolean A = true;
        boolean B = !A;
        boolean C = A != B   &&  A == !B && !A == B;
            //true!= false   &&  true == true  && false == false
            //   true        &&       true     &&    true
        System.out.println(C);

        System.out.println("=========================");



    }

}
