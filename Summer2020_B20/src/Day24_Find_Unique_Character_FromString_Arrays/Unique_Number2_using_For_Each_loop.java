package Day24_Find_Unique_Character_FromString_Arrays;

public class Unique_Number2_using_For_Each_loop {
    public static void main(String[] args) {

        // Find unique numbers in the array by using FOR EACH LOOP


        int [] array = {1,2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9, 93, 8};

        for(int arr: array ){ // arr is an element here
            int count = 0;

            for(int b: array){ // only calculates the frequency of array
                if(b==arr){
                    count++;
                }

            }
        if(count ==1) {
            System.out.print(arr + " ");
        }

        }


    }
}
