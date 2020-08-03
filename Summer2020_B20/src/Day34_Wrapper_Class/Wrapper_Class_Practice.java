package Day34_Wrapper_Class;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Wrapper_Class_Practice {

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4};

        Integer [] arr2 = {1, 2, 3, 4};

        for(Integer each : arr2){ // give wrapper class if we dont want unboxing or autoboxing
            System.out.println(each);

        }

        double [] d1 = {1.2, 2.5, 7.7}; // we can assign int to primitive double, it will printout w decimal
        // Double[] d2 = {1, 2, 7}; // in wrapper class must have a decimal, otherwise compile error,
        //wrapper class does not accept anything other than its primitive values.

        for(double each: d1){
            System.out.println(each);

        }

        char [] arr5 = {65, 66, 67};
        System.out.println(Arrays.toString(arr5));

        char ch = 79;
        Character ch2 = 79;// it is still a character, and this Character accepts only characters

        System.out.println(ch2);



        String [] nums1 = {"12.5", "13.5", "14.2", "15.7"};
        double [] nums2 = new double[nums1.length];// we initialized each of the array nums 1 to be the size of nums2

        for(int i = 0; i<=nums1.length-1; i++){
            nums2[i] = Double.parseDouble(nums1 [i]);
        }
        System.out.println(Arrays.toString(nums2));

        }

}
