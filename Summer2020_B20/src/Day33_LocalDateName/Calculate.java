package Day33_LocalDateName;

import java.util.Arrays;

public class Calculate {

    //create a method that can calculate the addition of two integers
    //create a method that can calculate the addition of two decimals

    //create a method that can calculate the multiplication of two integers
    //create a method that can calculate the multiplication of two decimals


    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // these two above can also be combined as int a and double a = but the outcome will be printed with decimal

        System.out.println(addition(a, b)); // whatever argument u pass here as a method will be executed,
        // only the matching ones will execute the exact same parameters that are in that method

        System.out.println(addition(0.5, 90)); // will execute the last combo method, outcome is a decim num

        int [] arr1 = {4, 7,3, 6, 1}; // sort this one
        Arrays.sort(arr1);
        char [] arr2 = {'A', 'D', 'W', 'B'}; // sort this one
        Arrays.sort(arr2);

// can be printed like this below
        System.out.println("Cybertek");
        System.out.println('A');
        System.out.println(123);
        System.out.println(12.5);
        // but  instead we can just call method's name

        long l1 = 100;
        long l2 = 200;
        System.out.println(multiplication( (int)l1, l2)); // giving int we cast it to l1 and l2 to integers

    }

    public static int addition(int a, int b){
        return a+b; // to print out the addition
    }
    public static double addition(double a, double b){ // overload method names can be the same,
        // but give different parameters in () as long it is different we can overload it.
        return a +b;

    }
    public static double addition(double a, int b){ // will return us double
        return a+b;
    }
    public static double multiplication (int a, int b){
        return a*b;
    }
    public static double multiplication (double a, double b){
        return a*b;
    }
}
