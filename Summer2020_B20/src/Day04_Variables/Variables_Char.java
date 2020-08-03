package Day04_Variables;

public class Variables_Char {

    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = 65;

        System.out.println(ch1);
        System.out.println(ch2); // char has max range, check aski table.


        char ch3 = 17828;
        System.out.println(ch3);

        char c1 = 'A'; //65 represent number in aski table
        char c2 = 'B';//66 represent number in aski table
        System.out.println(c1 + c2);
        int result = c1 + c2 ;
        System.out.println(result); // result is the number 131

        double d = c1+c2; // result is with decimal
        System.out.println(d);

        int num1 = 'A';
        System.out.println(num1);

        char c4 = 65+45; // first it will do the calculation
        System.out.println(c4);// then return the matching letter from aski table

        char c5 = 'z'; // it will be only used with characters and numbers
        char c6 = 237;
        System.out.println(c6);

        char c7 = '1';
        System.out.println(c7 + 1);// will return 50 becase char 1 equals 49 in the aski table, plus additonal 1 = 50
        System.out.println(c7);// will print only 1 result because thats the value we gave to c7

        int w1 = 200;
        int w2 = 300;
        boolean w3 = w1 > w2;
        System.out.println(w3);
    }



}
