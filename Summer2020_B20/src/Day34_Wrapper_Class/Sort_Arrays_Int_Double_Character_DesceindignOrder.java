package Day34_Wrapper_Class;

import java.util.Arrays;

public class Sort_Arrays_Int_Double_Character_DesceindignOrder {
    public static void main(String[] args) {

        Integer [] a1 = {90, 75, 88, 101};
        System.out.println(Arrays.toString(sortDescending(a1)) );
    }


// array sorts Wrapper Array Integer to Wrapper Class Array in desceding order
    public static Integer[] sortDescending(Integer[] arr) {
        Arrays.sort(arr);

        Integer[] arr1 = new Integer[arr.length];
        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr1[k] = arr[i];
            k++;
        }
        return arr1;
    }

    // sorts Double Array (Wrapper class Double ) in descending order
    public static Double [] sortDescending(Double [] arr) {
        Arrays.sort(arr);

        Double[] arr1 = new Double[arr.length];
        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr1[k] = arr[i];
            k++;
        }
        return arr1;
    }

    // sorts Character Array (Wrapper class Charactert) in descending order
    public static Character [] sortDescending(Character [] arr) {
        Arrays.sort(arr);

        Character[] arr1 = new Character[arr.length];
        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr1[k] = arr[i];
            k++;
        }
        return arr1;
    }


    // sorts String Array  in descending order

    public static String[] combine2Arrays(String[] arr1, String [] arr2) {
        String[] arr3 = new String[arr1.length + arr2.length];
        // by indicating arr1.length + arr2. length we initialize the sise for arr3

        int i = 0;

        for (String each : arr1) {
            arr3[i] = each;// by using each elements index number we assing it to arr3
            i++;
        }
        for (String each : arr2) {
            arr3[i] = each;
            i++;
        }
        return (arr3);
    }

// Combine two Double array (Wrapper Class) and return Double Array
    public static Double[] combine2Arrays(Double[] arr1, Double [] arr2) {
        Double[] arr3 = new Double[arr1.length + arr2.length];
        // by indicating arr1.length + arr2. length we initialize the sise for arr3

        int i = 0;

        for (Double each : arr1) {
            arr3[i] = each;// by using each elements index number we assing it to arr3
            i++;
        }
        for (Double each : arr2) {
            arr3[i] = each;
            i++;
        }
        return (arr3);
    }


    // Combine two Character array (Wrapper Class) and return Character Array
    public static Character[] combine2Arrays(Character[] arr1, Character [] arr2) {

        Character[] arr3 = new Character [arr1.length + arr2.length];
        // by indicating arr1.length + arr2. length we initialize the sise for arr3

        int i = 0;

        for (Character each : arr1) {
            arr3[i] = each;// by using each elements index number we assing it to arr3
            i++;
        }
        for (Character each : arr2) {
            arr3[i] = each;
            i++;
        }
        return (arr3);
    }
}
