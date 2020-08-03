package Office_Hours.Practice_06_17_2020;

public class Post_VS_Pre {
    public static void main(String[] args) {
        int a = 300;
        System.out.println(++a); // a = 301
        System.out.println(++a); // a == 302

        int b = 50;
        System.out.println(--b); // b== 49
        System.out.println(--b); // b == 48

        System.out.println("============================");

        int x = 40;
        System.out.println(x --);// the print result is 40
        System.out.println(x); // value will now be equal to 39
        System.out.println(x--);// passes current value - 39
        System.out.println(x);// now the value is 38.
        System.out.println("=======================");

        int y = 60;
        System.out.println(y++); // value is still 60
        System.out.println(y);// now the value is 61
        System.out.println(y++);// first is 61
        System.out.println(y);// now the value is 62






    }
}
