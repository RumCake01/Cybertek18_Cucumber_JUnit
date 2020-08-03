package Day26_MultiDimensional_Arrays;

import java.util.Arrays;
public class Reverse_Number_Descending_order_Arrays {
    public static void main(String[] args) {

        // sort arrays  in descending order/ backwards


        int[] arr = {2, 1, 3, 8, 10, 29, 37, 100, 47259}; // we need to have 3, 2, 1

        // the size of the current array is 3
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int[] desc = new int[arr.length];// to get all the numbers from the array
        // we need to sort the arrays now

        // we ca do it this way or we can use loop
/*
        desc[0] = arr[arr.length-1]; // this will get us number in the reverse order
        desc[1] = arr[arr.length-1];
        desc[2] = arr[0];// or just put it this way
        System.out.println(Arrays.toString(desc));   */



// using loop
        int k = (arr.length-1);// we put 2 here so it start from the end , which means int k = (arr.length-1);

        for(int i = 0; i <=desc.length-1; i++){
            desc[i] = arr[k]; // i - repsesent the for loop, and k represents our number from the int arr.

            k--;

        }

        System.out.println(Arrays.toString(desc));


    }
}
