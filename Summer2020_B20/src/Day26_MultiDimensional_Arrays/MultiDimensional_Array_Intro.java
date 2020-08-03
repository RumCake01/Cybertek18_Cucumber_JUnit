package Day26_MultiDimensional_Arrays;

import java.util.Arrays;

public class MultiDimensional_Array_Intro {
    public static void main(String[] args) {

        char[] ch1 = {'A', 'B'};
        char[] ch2 = {'C', 'D' , 'E'};
        char[] ch3 = {'F', 'G', 'H'};


        // char [][] = represents                       0    1         0    1     2        0    1    2
        char [][] ch2D = {                            {'A', 'B'} ,   {'C', 'D' , 'E'},   {'F', 'G', 'H'}   };
        //indexes of dimensional arrays here              0                 1                   2
        // we can also just use the ch1, ch2, ch3

        System.out.println(Arrays.toString(ch2D[1] ) ); // to
        System.out.println(Arrays.toString(ch2D[1] ) );

        // if want to print H from the secong index
        // we give the index in brackets below, but then also get the index for that letter/character specifically

        System.out.println(ch2D[2] [2]);

        // now print letter C

        System.out.println(ch2D[1] [0]);


        // now print out G and B we are printing elements here so we dont need to use toString method

        System.out.println( ch2D[2] [1] + "   " + ch2D[0] [1]);
        System.out.println("================================================");


// store arrays into 1 variable
        // {1, 2, 3}, {4}, {5, 6}, {7, 8, 9, 10}
        int nums [][] = {    {1, 2, 3},     {4},     {5, 6},         {7, 8, 9, 10} };

        System.out.println(Arrays.toString(nums [3]) ); // this will print out the array itself in brackes
        //System.out.println[0], [1] + "  " +  nums [2] + " "  + nums[3]);



        // printed with for each loop

        for(int [] each : nums){
            System.out.println(Arrays.toString(each));

        }

        // printed with for loop

        for(int i = 0; i<=nums.length-1; i++){
            System.out.println(Arrays.toString(nums[i]));
        }

        // if want to print

        System.out.println(Arrays.deepToString(nums));





    }
}
