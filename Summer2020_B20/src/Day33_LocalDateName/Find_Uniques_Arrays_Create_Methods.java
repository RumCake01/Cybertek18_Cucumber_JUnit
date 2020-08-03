package Day33_LocalDateName;

import java.util.Arrays;

public class Find_Uniques_Arrays_Create_Methods {

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 3, 3};

        for (int element : arr) {
            int count = 0;

            for (int each : arr) {
                if (element == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element);
            }

        }
        System.out.println();

        System.out.println("========================");


        int [] n1 = {10, 20, 30, 40, 40, 50, 60, 60, 77};
        uniqueElements(n1); // we call our method here and then indicate the arr in().
        System.out.print(Arrays.toString(n1));
    }


    public static void uniqueElements(int[] arr){
        for (int element : arr) {
            int count = 0;

            for (int each : arr) {
                if (element == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(element + " ");
            }
        }

        System.out.println();
    }
}
