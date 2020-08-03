package Day24_Find_Unique_Character_FromString_Arrays;

public class For_Each_Loop_Intro {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, -1, -2, -3};

        for (int i = 0; i <= array.length - 1; i++) { // i represents the index number

            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("===========================================================");


        // we can do the same task Using FOR EACH LOOP BELOW


        for (int each : array) { // data type then word each : then the name of of data collection which int array
            // each represent the elements (each number) in the collection of data we gave (the numbers)


            System.out.print(each + " ");
        }
        System.out.println();
    }
}
