package Day06_CoparisonOperators;

public class Swap1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        int c = b; // c = 15 - a third variable to hold the value
        b = a; // b = 10
        a = b; // a = 10


        System.out.println(a);
        System.out.println(b);

    }
}
