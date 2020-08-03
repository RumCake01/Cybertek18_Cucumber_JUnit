package Day23_Arrays;

public class Arrays_return_MinAnd_maxNum {
    public static void main(String[] args) {

        //write a program that can return the min and max number from the array

        int[] numbers = {100, 300, 200, 5, -1, 22, 55, 77};

        int max = numbers[0];
        int min = numbers[0];
// no need for int max and int min with arrays, we can just declare

        for (int i = 1; i <= numbers.length-1; i++) { // i++ because we are getting the max number

            // the if statement below compares the numbers, and assign the max number to the variable max

            if (numbers[i] < max) { // if any of the numbers is grater will be stored to the max variable
                // so the numbers here are // i: 1, 2, 3, 4, 5
                max = numbers[i];

            }
            if (numbers[i] > max) {
                max = numbers[i];
            }



        }
        System.out.println("min:" + min);
        System.out.println("max:" + max);
    }
}