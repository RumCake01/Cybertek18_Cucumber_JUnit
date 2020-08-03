package Day24_Find_Unique_Character_FromString_Arrays;
import java.util.Arrays;

public class Day24_Arrays_Utility_Intro {

    public static void main(String[] args) {


        // METHOD 1:  ARRAYS.toString

        // first we need to import the Arrays class from the java.util package.

        // arrays class provides methods we can apply to Arrays only

        int[] arrays = {1, 2, 3};

            System.out.println(arrays);
            System.out.println( Arrays.toString(arrays) );  // () assign it to the array we need to convert
        // its better to put it in the sout, less steps: but we can also do it this way by assigning to a string variable:
        // String s1 = Arrays.toString(arrays) , and then do a separate sout with arrays.

        String studenNames []= {"RumCake", "Adam", "John", "Muha"};

        System.out.println(studenNames); // this is incorrect way to do it, it doesnt print out the statement correctly
        // we want to print out all the names that are contained in the string above
        // first we need to convert it to a String
        // we need to use Arrays utility class here:

        System.out.println( Arrays.toString(studenNames) ); // this statement will convert arrays to string

        System.out.println("==================================================================================");



        // METHOD 2:  ARRAYS.SORT - THIS METHOD IS NOT ALLOWED IN THE INTERVIEWS

        int[] arrays1 = {5, 4,7, 1, 3, 2, 6 };

        System.out.println( Arrays.toString(arrays1) ); // this is the statement to print out arrays the way they are

        // We will be able to pass the array we want to sort:

        Arrays.sort(arrays1); // result is if will be orginized in order: without this we will not get number in the ascending order.
        // 3, 4, 5, 6, 7

        System.out.println( Arrays.toString(arrays1) );
        // this is the statement to print out arrays in the ascending order, organized from  smallest to the biggest.

        System.out.println("maximum number: " + arrays1[arrays1.length-1]); // we need to last index of the the arrays1

// in order to find the minimum number we can the index of zero
        System.out.println("minimum number: " + arrays1[0]);

        // another example:

        String students[] = {"Mehdi", "Elkem", "RumCake", "Trump"};

        Arrays.sort(students);
        System.out.println( Arrays.toString(students) );
        // will print out the first letters of the name in the aplhabetical order// from A to Z

        System.out.println("==================================================================================");



        // Method 3.  Arrays.equals (array, array);

        int[] arr1 = {1, 2, 3};// the same index order
        int[]arr2 = {1, 2, 3};// the same index order

        // now we can pass two arrays to compare it
        boolean r1 = Arrays.equals(arr1, arr2);

        System.out.println(r1); // to print the result true or false

        int [] arr3 = {2, 1, 3};// a different index order

        // if we want to compare the elements only , we need to sort array arr2 and arr3 in the Arrays.sort method
        Arrays.sort(arr2);//  each has 3 elements
        Arrays.sort(arr3);//each has 3 elements

        // now when we  print out it will be true

        boolean r2 =Arrays.equals(arr2, arr3); // this will compare the oder of the array
        System.out.println(r2);

        // if one array has 3 elements and another array has 4 elements they will never be true.

        /*example  */

        int[] arr4 = {1, 2, 3};// arrays sizes are fixed, they must have the same number of elements
        int[]arr5 = {1, 2, 3};
        boolean r3 =Arrays.equals(arr4, arr5); // this will compare the amount of elements to each of the array
        System.out.println(r3);






        }




    }
