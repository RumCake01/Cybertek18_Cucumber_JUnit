package Day28_Recap_Warm_Up_tasks;

import java.util.Arrays;

public class Multi_Dimensional_Array_practice3 {

    public static void main(String[] args) {

        int [] [] arr2D = {  {1, 2, 3}, {4, 5} };

        int [] [] []  arr3D = {  { {1, 2, 3}, {4, 5}  }, {  {6, 7, 8}, {9, 10} }};

        System.out.println(Arrays.deepToString(arr3D));

        System.out.println(Arrays.deepToString(arr3D[1]));

        System.out.println(Arrays.toString(arr3D[0] [1] ));

        System.out.println(arr3D[1] [0] [2]); // prints out elements

        System.out.println("=============================");


        for(int i = 0; i<=arr3D.length-1; i++ ) { // index of 2D arrays
            int[][] each2D = arr3D[i]; // in 2D arrays we have 1D arrays

            for (int j = 0; j <= arr2D.length - 1; j++) { // j is index of 1D arrays
                int[] each1D = arr2D[j];
                for (int k = 0; k <= each1D.length - 1; k++) {
                    System.out.print(each1D[k] + " ");

                }

                System.out.println();


            }
        }

        System.out.println("=========================================");




        for ( int [][] each2D : arr3D){
            for (  int [] each1d: arr2D){
                for(int eachElement  : each1d){

                    System.out.print(eachElement + "  ");

                }


            }
        }
    }
}
