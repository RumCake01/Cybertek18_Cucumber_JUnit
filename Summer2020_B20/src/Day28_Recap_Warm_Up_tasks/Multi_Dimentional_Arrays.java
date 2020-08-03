package Day28_Recap_Warm_Up_tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Multi_Dimentional_Arrays {

    public static void main(String[] args) {


        int[] arr1D = {1, 2, 3};

        int[][] arr2D = {{1, 2, 3, 4}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13, 14, 15}};
// indexes                      0               1                   2

        System.out.println(Arrays.toString(arr1D)); // to print out single dimensional array

        System.out.println(Arrays.deepToString(arr2D)); // to print  multi dimensional array

        System.out.println(arr2D[1] [3]); // first bracket is for the index of the element of the array,
        // the second bracket is the index number for the items in the element

        for(int i = 0; i<=arr2D.length-1; i++){
            // using this i get the specific array

            int each1DArray [] = arr2D[i]; // index numbers for the element in the array, to get each 1D arrays from arr2D
            System.out.print(Arrays.toString(each1DArray));
            System.out.println();
            System.out.println("=========================");

            // this prning elements of each signle dimensional array
            for (int j = 0; j<=each1DArray.length-1; j++){
                int eachNum  = each1DArray[j]; // this will print out every single index of j
                if(eachNum%2==0){
                    System.out.print(eachNum + " ");
                }

            }
            System.out.println();
        }

        // same task using FOR EACH LOOP

        for (int [] each1D : arr2D) {
            // now iterate each1D to get each of its elements by creating another loop, created in this loop
            for(int eachElement : each1D){
                if(eachElement %2 !=0){
                    System.out.println(eachElement+ " ");
                }
            }
            System.out.println();
        }








    }
}