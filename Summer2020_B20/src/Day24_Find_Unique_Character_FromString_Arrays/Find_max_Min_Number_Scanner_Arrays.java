package Day24_Find_Unique_Character_FromString_Arrays;

import java.util.Scanner;

public class Find_max_Min_Number_Scanner_Arrays {
    public static void main(String[] args) {

        /*2. write a program that asks user how many numbers he wants to enter, and get all the
         user inputs and store them into an array variable, and then write the
          program that can return maximum and minimum numbers*/

        Scanner scan = new Scanner(System.in);
        System.out.println("how many number do you want to enter?");

        int n = scan.nextInt();

        //now declare array and then initialize it to int n

        int[] array = new int[n]; // indicate the size of array here new int [n] n represents the number that user will enter
        // if user entered 10, he must enter it 1o times, or less depending what he entered first

        for(int i = 0; i<n; i++){ /* get user input and store it in the array[].  it will repeat n times depending on the users number
             entered, we can also put i<=n-1 for the loop to repeat, means last index number */
            System.out.println("enter a number");

            int num = scan.nextInt();// users number represented by int num.

            array[i] = num;// any number user enteres will be assigned to the array[i]

// to make the above two last lines shorter we can declare it without int num below:

            // array[i] = scan.nextInt();// users number represented by int num, and automatically assign it to the array[i]
        }

        //now find the max and min numbers:

        int max = array[0]; // start checking w index zero

        int min = array[0]; // whichever element is the smallest will be assigned here
        // this will compare each elements to each other and assign the max one to the max

// create for loop to print out every single character of our array, and then compare each element to the min and max. and assign them
/*these loops iterate from zero till the last index which mean every
element in the array will be iterated, will be executed as many times as the users number*/


        for(int i = 0; i<=array.length-1; i ++){

            if(array[i]>max){// comparing first element with the rest of the array, whichever is greater will be assigned to the max
                max=array[i];
            }
            if(array[i]<min){ // if any users numbers are smaller than the min num, will be assigned to the min
                min=array[i];
            }

            System.out.print(array[i] + " ");
        }
    }

}
