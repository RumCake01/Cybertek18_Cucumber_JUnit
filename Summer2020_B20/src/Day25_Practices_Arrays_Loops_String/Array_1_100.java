package Day25_Practices_Arrays_Loops_String;
import java.util.Arrays;

public class Array_1_100 {

    /*Create an int array called numbers that has length of 100 and Assign 1-100
    to each index of the array.  then print out all the even numbers.
     MUST use continue statement/*
     */
     // Default values:
    // String: null
    //Integer: 0
    // Decimal: 0.0
    //Boolean : false

    public static void main(String[] args) {

        int [] numbers = new int[100]; // array sizes is fixed, means we cant store more than 100

        // instead of doing it this way below we can use loop
       /* numbers [0] = 1; // at  the index zero we can assign one
        numbers[1] = 2;// at the index zero we can assign 2
        System.out.println(Arrays.toString(numbers));*/

        for(int i = 0; i<=numbers.length-1; i++){
            numbers[i] = i+1;

        }
        System.out.print(Arrays.toString(numbers) );
        System.out.println();

        for(int each : numbers ) { // the execution here depends on the length of the array.

            if(each%2!=0){
                // if we want to print out odd numbers we can use this instead: if(each%2==0)
                continue;
            }

            System.out.print(each + " ");
        }

    }
}
