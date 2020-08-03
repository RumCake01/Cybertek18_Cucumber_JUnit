package Day24_Find_Unique_Character_FromString_Arrays;

public class Find_Uniques_from_Integers_Using_arrays {
    public static void main(String[] args) {


        // FIND UNIQUE NUMBERS FROM INTEGER ARRAY


        int [] array = {1, 1, 2, 3, 3};

        // this is not a string, in order to retrieve each character we use array index

        // we create a loop here

        for(int j=0; j<=array.length-1; j++) {

            int num1 = array[j]; // if we want to know a specific index whether it is unique or not, we need to change it to the following:
            // int num1 = array[1];  and keep changing the number in the [] to the index of the element we wanted to know the uniqueness


            // create a variable to store frequency of the number in array
            int count = 0;

            // by using loop we can iterate numbers in the array

            for (int i = 0; i <= array.length - 1; i++) { // this will calculate only frequency of num
                // this loop will be executed 5 times cause we have 5 elements in the array
                int eachNumber = array[i];

                // to find the frequency we need to know many times each element is matching in the array

                if (eachNumber == num1) {  // this means that specific number did occur in the array
                    count++;

                    // if its unique we need to print, otherwise not print it
                }
            }
            if (count == 1) {// this condition to check whether it is unique or not
                System.out.println(num1);
            }


        }




    }
}
