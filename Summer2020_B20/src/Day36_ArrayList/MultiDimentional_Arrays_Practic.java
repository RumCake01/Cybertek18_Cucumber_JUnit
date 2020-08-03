package Day36_ArrayList;

import java.util.Arrays;

public class MultiDimentional_Arrays_Practic {
    public static void main(String[] args) {



        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};
//

        for (int i = arr2D.length - 1; i >= 0; i--) {
            int[] each1D = arr2D[i];

            for (int eachNum : each1D) {
                System.out.print(eachNum + " ");
            }
            System.out.println();
        }

        System.out.println("===========================");
        for (int i = 0; i <= arr2D.length - 1; i++) {
            int[] each1D = arr2D[i];

            for (int b = each1D.length - 1; b >= 0; i--) {
                System.out.print(each1D[b] + " ");
            }

        }
    }

}
