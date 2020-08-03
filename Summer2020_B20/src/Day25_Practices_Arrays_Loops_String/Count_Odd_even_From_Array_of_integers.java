package Day25_Practices_Arrays_Loops_String;

public class Count_Odd_even_From_Array_of_integers {
    public static void main(String[] args) {

        /*
        Write a program that can count the even and odd number from an array of integers
         */


        // this is one to do this task:


        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int countEven = 0;
        int countOdd = 0;
        String even = "";
        String odd = "";

        // in order to find if the elements of the array are even or odd, we need to use for each loop

        for(int each : nums) {

            // now we need to find out our even numbers

            if(each%2==0){
                countEven+=1;
                even +=each+ " ";
            }else{
                countOdd++;
                odd += each+ " ";
            }

        }

        System.out.println("\nEven Numbers: " + even);
        System.out.println(countEven);
        System.out.println("Odd Numbers: " + odd);
        System.out.println(countOdd);

        // this is another way to do this task:

        // we can use continue statement:

        /*
        if(each%2==0){
                countEven+=1;
           continue;
                countOdd++;
            }


         */
    }
}
