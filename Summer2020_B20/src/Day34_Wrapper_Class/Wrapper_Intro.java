package Day34_Wrapper_Class;

import java.util.Arrays;

public class Wrapper_Intro {


    public static void main(String[] args) {

        // to wrapper classes we can only assign it own primitive, Integer to int, Short to short, Byte to byte.

        Integer num = 100; // declaring it this way makes it a class dedicated to primitive int
        int a = 100;

        Byte b1 = 50;
        int n1 = b1;

         byte b2 = 40;
        // Integer b3 = b2; // doesnt compile here because Integer wrapper/class only accepts its own primitives. ints.


        Integer n3 = new Integer(123);
        Double [] arr = new Double [3];
        System.out.println(Arrays.toString(arr));

        int p1 = 300;
        Integer p2 = p1; // whenever we are converting primitive type to its wrapper its  called autoboxing


        Integer q1 = 500;
        int q2 = q1;  //whenever we are converting wrapper class  to its primitive type its called unboxing. It is implicit.


        //double d1 = 300; // wrapper class only dedicated for its primitive, will require to include dec in order to avoid a compile error

        Double d2 = 300.0;
        double d3 = d2; // unboxing, explicit


        long l1 = 400;
        Long l2 = l1; // autoboxing, implicit


        Float f1= 100.5f;
        Float f2 = f1;

        char ch1 = 'A';
        Character ch2 = ch1;


        Double [] arr1 = {10.0, 40.0, 77.7};
        Integer  [] arr2 = {10, 40, 77};
        Character [] a1 = {'A', 'A', 'B'};
        boolean [] b = {true};

        for (Double each: arr1){
            System.out.println(each + " ");
        }

        for (Integer each: arr2){
            System.out.println(each + " ");
        }
        for (Character each: a1){
            System.out.println(each);
        }
        for (Boolean each: b){
            System.out.println(each);
        }


    }
}
