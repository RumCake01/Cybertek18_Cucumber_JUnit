package Day29_Custom_Methods;

public class Find_max_min {

    // write a program that can print out the max number from any integer array


    public static void main(String[] args) {
        int [] numbers = {10, 90, 86, 55362};
        MaxNumber(numbers);

    }


    public static void MaxNumber(int[] arr) {
        int max = arr[0];

        for (int each : arr){

            if(each>max){
                max=each;
            }
        }
        System.out.println("max: " + max);
    }


    public static void MinNumber (int[] arr) {
        int min = arr[0];
        for (int each : arr) {
            if (each < min) {
                min = each;
            }

        }
        System.out.println("min: " + min);
    }
}