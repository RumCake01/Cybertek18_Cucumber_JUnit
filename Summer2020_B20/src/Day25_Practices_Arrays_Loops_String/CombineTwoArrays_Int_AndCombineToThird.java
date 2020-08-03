package Day25_Practices_Arrays_Loops_String;

import java.util.Arrays;

public class CombineTwoArrays_Int_AndCombineToThird {
    public static void main(String[] args) {

        /*
        write a program that can combine two arrays of integers and then print out the maximum number
    Ex:
        arr1 = { 1,2,3,4}
        arr2 = {5,6,7,8}
        output:
            arr3 = {1,2,3,4,5,6,7,8}
            max: 8
         */


        int []arr1 = {1, 2, 3};

        int []arr2 = {4, 5};

        int size = arr1.length + arr2.length;

        // we need a thirds array to store all the size and elements

        int [] arr3 = new int[size];

        // we can do it this way but DO NOT USE THIS WAY, IT WILL NOT ALWAYS WORK
        /*arr3[0] = arr1[0];
        arr3[1] = arr1[1];
        arr3[2] = arr1[2];

        arr3[3] = arr1[0];
        arr3[4] = arr1[1];*/


        // here is another way to do the above task by using for each loop

        int index = 0;

        for(int each : arr1){
            arr3[index] = each;
            index ++; // increase iteration by 1 so that it can iterate the indexes of the 3rd array
        }
        // now we need a second for each loop to iterate our second array arr2.

        for(int each : arr2) {
            arr3[index] = each;
            index++;

        }
        System.out.println(Arrays.toString(arr3) );



        // now we can find a max number

        // first we need to sort it:

        Arrays.sort(arr3);

        System.out.println(Arrays.toString(arr3));
        System.out.println("Maximum: " + arr3[arr3.length-1] );

    }
}
