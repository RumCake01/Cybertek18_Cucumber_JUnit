package Day33_LocalDateName;

import java.util.Arrays;

public class Combine_Two_Arrays {
    public static void main(String[] args) {

        int[] a1 = {10, 30, 20};
        int[] a2 = {60, 40, 50};
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(Arrays.toString(combine2Arrays(a1, a2 )));
    }

    public static int[] combine2Arrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        // by indicating arr1.length + arr2. length we initialize the sise for arr3

        int i = 0;

        for (int each : arr1) {
            arr3[i] = each;// by using each elements index number we assing it to arr3
            i++;
        }
        for (int each : arr2) {
            arr3[i] = each;
            i++;
        }
        return arr3;
    }
}

