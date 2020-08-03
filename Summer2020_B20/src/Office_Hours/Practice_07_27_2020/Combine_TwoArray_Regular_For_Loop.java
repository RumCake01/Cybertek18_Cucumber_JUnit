package Office_Hours.Practice_07_27_2020;

import java.util.Arrays;

public class Combine_TwoArray_Regular_For_Loop {

    public static void main(String[] args) {

        char[] a1 = {'A', 'B', 'C'};
        char[] a2 = {'D', 'E', 'F', 'G', 'H', 'I'};

        // before we combine them, we need to make sure that our new third array will be initialized, the size will be initialized

        char[] a3 = new char[a1.length + a2.length]; // this way we initialized our new array so it can hold both a1 and a2 values

        // first we do it without using the loop we are assigning the each element
        // f the a1 array we assign to the same index of our new array.


        // this is the manual away:
        /*
        a3[0] = a1[0]; // A
        a3[1] = a1[1]; // B
        a3[2] = a1[2]; // C
        a3[3] = a2[0]; // D
        a3[4] = a2[1]; // E
        a3[5] = a2[2]; // F */

        // now we can create regular loop to iterate each of the array in For loop.
        // For loop is usefull when we knw the end and the beginning indexes.

        int index = 0;  // index numbers of new third array., and the length of a3 depends on the combo of a1 & a2.

        for (int i = 0; i<=a1.length-1; i++) {
            a3[index] = a1[i]; // so each will be assigned to the beginning index of a3,
            index++;
            // that's why we give index here , so it can keep increasing by 1.
        }

        // this is our second array for the second array a2
        for (int i = 0; i<=a2.length-1; i++) {
            a3[index] = a2[i]; // again assign each to each element of the third array, wherever it is left of.
            index++;
        }

        // same third with the while loop:

       /*
       int j = 0;

       while (j<=a2.length-1){
       a3[index] = a2[j];
      j++;

        */

        System.out.println(Arrays.toString(a3));

    }
}