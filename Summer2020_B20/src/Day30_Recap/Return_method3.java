package Day30_Recap;

import java.util.Arrays;

public class Return_method3 {

    public static void main(String[] args) {

        int [] arr = {100, 200, 50, 40, 60};

        int number = max(arr);

        System.out.println(number);
        System.out.println(number>300);
    }



    public static int max (int [] arr){
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        return max;
    }
}
