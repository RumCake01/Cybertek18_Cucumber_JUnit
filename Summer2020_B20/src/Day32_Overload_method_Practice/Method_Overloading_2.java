package Day32_Overload_method_Practice;

public class Method_Overloading_2 {

    public static void main(String[] args) {


        addition(10, 20);
        addition(30, 40, 50);
        addition(60, 70, 80);

    }


    // create a method tha can find the addition of two numbers = additionOf2Numbers

    public static void additionOf2Numbers(double a, double b) {

        System.out.println(a + b);
    }

    public static void additionOf3Numbers(double a, double b, double c) {

        System.out.println(a + b + c);
    }

    public static void additionOf4Numbers(double a, double b, double c, double d) {

        System.out.println(a + b + c + d);
    }

    public static void addition(double a, double b) {

        System.out.println(a + b);
    }

    public static void addition(double a, double b, double c) {

        System.out.println(a + b + c);
    }

    public static void addition(double a, double b, double c, double d) {

        System.out.println(a + b + c + d);

    }


    public static void arraysOfInt(int arr1[], int arr2[]) {

    }

    public static void arraysOfDouble(double arr1[], double arr2[] ) {
    }

    public static void arraysOfString (String arr1[], String arr2[] ) {
    }
    public static void arraysOfChar(char arr1[], char arr2[] ) {
    }
}


// create a method that can combine 2 arrays of integers
// create a method that can combine 2 arrays of double
//create a mthod that can combine 2 arrays of string
// combie two arrays of char


