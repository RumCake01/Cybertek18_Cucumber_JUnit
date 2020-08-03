package Day33_LocalDateName;

import java.util.Arrays;

public class Sort_Discending {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2};

        // first sort arr in ascending order

        Arrays.sort(arr);

        // now reverse it by using length method and make sure the value is reusable

        int[] arr1 = new int[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr1.length - 1; i++) {
            arr1[i] = arr[k];
            k--;
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println("=================");

        // sort double array

        double [] n1 = {5.5, 8.9, 1.2};
        n1 = sortDiscending(n1);
        System.out.println(sortDiscending(n1));



    }

    public static int[] sortDiscending(int[] arr) {

        Arrays.sort(arr); // first arr gets sorted

        int[] arr1 = new int[arr.length];
        // now the loop will get each of the arrays sorted to assign them in a discendign order
        int k = arr.length - 1;
        for (int i = 0; i <= arr1.length - 1; i++) {
            arr1[i] = arr[k];
            k--;
        }
        return arr1;


    }

    public static double[] sortDiscending(double[] arr) {


        Arrays.sort(arr); // first arr gets sorted

        double[] arr1 = new double[arr.length];
        // now the loop will get each of the arrays sorted to assign them in a discendign order
        int k = arr.length - 1;
        for (int i = 0; i <= arr1.length - 1; i++) {
            arr1[i] = arr[k];
            k--;
        }
        return arr1;
    }



    public static char [] sortDiscending(char [] arr) {


        Arrays.sort(arr); // first arr gets sorted

        char[] arr1 = new char [arr.length];
        // now the loop will get each of the arrays sorted to assign them in a discendign order
        int k = arr.length - 1;
        for (int i = 0; i <= arr1.length - 1; i++) {
            arr1[i] = arr[k];
            k--;
        }
        return arr1;
    }



    public static String[] sortDiscending(String[] arr) {


        Arrays.sort(arr); // first arr gets sorted

        String[] arr1 = new String [arr.length];
        // now the loop will get each of the arrays sorted to assign them in a discendign order
        int k = arr.length - 1;
        for (int i = 0; i <= arr1.length - 1; i++) {
            arr1[i] = arr[k];
            k--;
        }
        return arr1;
    }
}
