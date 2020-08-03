package Day31_Recap_Methods_Parameters;

import java.util.Arrays;

public class Add_Element_Methods {

    public static void main(String[] args) {
        /*   3. write a method that can add element to an array,
      the method accepts an array and and a number,
       then returns the new array by appending the number
       to the last index of the given array

        Ex:
        int[] arr = {1,2,3};
        int num = 4;
        addElement(arr, num); ===> {1,2,3,4}  */

        int[] arr = {1, 2, 3};
        int num = 4;

        int[] arr2 = new int[arr.length + 1];
        arr2[arr2.length - 1] = num;

        int i = 0;
        for (int each : arr) {
            arr2[i] = each;
            i++;
        }
        System.out.println(Arrays.toString((arr2)));
    }

    public static int[] addElement (int [] arr, int num) {
        int[] arr2 = new int[arr.length + 1];
        arr2[arr2.length - 1] = num;

        int i = 0;
        for (int each : arr2) {
            arr2[i] = each;
            i++;
        }
            return arr2;
        }
    }