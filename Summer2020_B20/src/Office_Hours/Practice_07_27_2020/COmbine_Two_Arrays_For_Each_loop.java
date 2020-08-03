package Office_Hours.Practice_07_27_2020;

import java.util.Arrays;

public class COmbine_Two_Arrays_For_Each_loop {

    public static void main(String[] args) {

        char[] a1 = {'A', 'B', 'C' };
        char[] a2 = {'D', 'E', 'F'};

        // before we combine them, we need to make sure that our new third array will be initialized, the size will be initialized

        char[] a3 = new char [a1.length + a2.length]; // this way we initialized our new array so it can hold both a1 and a2 values

        // first we do it without using the loop we are assigning the each element
        // f the a1 array we assign to the same index of our new array.

        // this is the manual away:
       /*
       a3[0]=a1[0]; // A
       a3[1]=a1[1]; // B
       a3[2]=a1[2]; // C
       a3[3]=a2[0]; // D
       a3[4]=a2[1]; // E
       a3[5]=a2[2]; // F  */



        // now we can create  for each loop to iterate each of the array in For Each loop
        int index = 0;
        for (char each :a1){
           a3[index] = each; // so each will be assigned to the beginning index of a3,
            index++;
            // that's why we give index here , so it can keep increasing by 1.
        }

        // this is our second array for the second array a2
        for(char each : a2){
            a3[index] = each; // again assign each to each element of the third array, wherever it is left of.
            index++;
        }
        System.out.println(Arrays.toString(a3));
    }
}
