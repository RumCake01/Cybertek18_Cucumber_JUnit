package Day32_Overload_method_Practice;

import java.util.Arrays;

public class Overload_method_intro {

    // always provide different DataType in the parameters
    public static void main(int a) {

        int[] arr = {9, 8, 7};
        Arrays.sort(arr);

        String[] names = {"D", "C", "A"};
        Arrays.sort(names);

    }

    public static void method(int a) {


    }

    public static void method(double b) {
    }
}