package Warm_Ups_Day25;

import java.util.Arrays;

public class First_Wamr_UP {
    public static void main(String[] args) {
        /*
        Write a program that can return the longest string of text from a String array
    2. Write a program that can return the shortest string of text from a String array
    3. Create an int array called numbers that has length of 100 and Assign 1-100 to each index of the array.  then print out all the even numbers. MUST use continue statement
    4. Write a program that can count the even and odd number from an array of integers
    5. Write a program that will take five Strings and save them into an array called arr. and  Use for loop to print out the first three letter of each element of arr, one per line.
            You can assume that every element of arr is at least 3 letters long.
                Example: arr -> ["apple", "banana"]
                        prints:  appban
    6. write a program that can combine two arrays of integers and then print out the maximum number
    Ex:
        arr1 = { 1,2,3,4}
        arr2 = {5,6,7,8}
        output:
            arr3 = {1,2,3,4,5,6,7,8}
            max: 8
    7. write a program that can sort the array in descending order
        ex:
            arr1: { 10, 11, 8, 9, 12, 5, 15};
            output:
                arr2: {15, 12, 11, 10, 9, 8, 5}
            NOTE: at the end, you must have have an array that contains the desending order of the original array
         */

        int[] array = {10, 11, 8, 9, 12, 5, 15};

        Arrays.sort(array);
        for (int i = array.length-1; i >=0; i--) {

            System.out.println(array[i] + " " ); // will print out an array first
        }
    }
}

