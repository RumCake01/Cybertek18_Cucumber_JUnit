package Day33_LocalDateName;

public class Overloading {

// METHOD OVERLOADING
// same method NAME,  multiple methods,  sharing the same mame but all have different parameters

    // this one is the only main method we have and it will be executed
    // the methods below that will only be executed if we call them here in the main


    // these methods below will only run if u call them in the main method
    public static void main(int[] kfc) { // same methods  diff parameters in ()
        System.out.println("int array");
    }

    public static void main(double[] mCdonalds) { // same methods  diff parameters in ()
        System.out.println("double array");
    }

    public static void main(String[] mcdonalds) { // this will be executed because it has main method (String args)
        System.out.println("String array");
        int [] arr = {1, 2, 3};
    }
}
