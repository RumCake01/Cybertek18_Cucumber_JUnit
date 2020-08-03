package Day06_CoparisonOperators;

public class Comparison_Operators {

    public static void main(String[] args) {

        //practice of > and <
        boolean r1 = 10>9;
        System.out.println(r1);

        boolean r2 = 100 < 9000;
        System.out.println(r2);

        //practice of >= if either one of these conditions true will return true.
        boolean r3 = 87>=85;
        System.out.println(r3);

        boolean r4 = 877 >= 878;// will get false because non of the conditions is true
        System.out.println(r4);

        //practice of  <=
        boolean r5 = 200 <= 300;// one of the conditions is true
        System.out.println(r5);

        //practice of ==  equal or not
        boolean r6 = 900 == 800;
        System.out.println(r6);

        boolean r7 = true == false;
        System.out.println(r7);

        boolean r8 = "Muhtar" == "Good Guy";// two different strings, the result is false, the characters dont match
        System.out.println(r8);

        //boolean r10 = "123" == 123; // not going to read it because i need to use relational operators.

        //practice of !=
        boolean r11 = "Muhtar" !="Bad Guy"; //this statement is true becuase it is not equa to one another.
        System.out.println(r11);

        boolean r12 = true != false; //will be true because not equal
        System.out.println(r12);

        boolean r13 = 'A' == 65;// eventhou the text doesnt match but when using aski table characters it will be true : 'A = 65' = 65
        System.out.println(r13);

        boolean r14 = 'A' == 65+1+2;// will be false
        System.out.println(r14);

        boolean r15 = 100 ==100.0;// will return true because the value is the same even if decimal present
        System.out.println(r15);

        boolean r16 = 10 == 10.9999; // false because its bigger than 10
        System.out.println(r16);

        boolean r17 = 10 == (int) 10.99999;
        System.out.println(r17);

        boolean r18 = "100" == "100.0"; //two different messages, retult will be false.
        System.out.println(r18);

        int number = 100;
        boolean even = number%2 == 0;// can be divided by 2 with remainder 0.
        boolean odd = number%2 != 0;
        System.out.println(even);
        System.out.println(odd);








    }
}
