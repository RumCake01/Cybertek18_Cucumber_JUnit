package Day28_Recap_Warm_Up_tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Multi_Dimensional_Practice2 {
    public static void main(String[] args) {

        // using regular for loop , reverse the following array, first in ascending order, then in discending order

        int arr2D[][] = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};

        for (int i = arr2D.length - 1; i >= 0; i--) { //will print them out in starting from index zero
            int[] each1DArray = arr2D[i];
            System.out.println(Arrays.toString(each1DArray));

            System.out.println("=====================================");
        }

        for (int i = 0; i <= arr2D.length-1; i++) {
            int [] arr1D = arr2D[i];

            for (int j = arr1D.length-1; j>=0; j--){
                int eachBracket = arr1D[j];
                System.out.print(eachBracket + "   " );
            }

            System.out.println();

            System.out.println("=====================");
        }

        for (int i = arr2D.length-1; i >=0; i--){
            int [] arr1D = arr2D[i];

            for (int a = arr1D.length-1; a >=0; a--){
                System.out.print(arr1D[a] + "   ");
            }

        }
        System.out.println();

    }
}
