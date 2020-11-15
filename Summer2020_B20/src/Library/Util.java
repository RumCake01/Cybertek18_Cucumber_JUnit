package Library;

import java.util.Arrays;

public class Util {


    // removes duplicates and returns the value of string
    public static String removeDuplicates(String word) {
        String nonDup = "";
        for (String each : word.split("")) { // we are getting array from the string by using SPLIT method

            if (!nonDup.contains(each)) {
                nonDup += each;

            }
        }
        return nonDup;
    }


    // reverses the string and returns the value
    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);

        }
        return result;
    }


    // returns the frequency of every single characters from a string
// need to get frequency in here


    // uniques are missing





    // frequency of chars is missing



    // for formatting the full name (user enter first name andlast name in upper or lower case, this willmake is Rumcake Hasnu standard)
    public static String formatFullName(String first, String last) {
        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();
        String result = first + " " + last;
        return result;
    }



    public static int MaxNumber(int[] arr) {
        int max = arr[0];

        for (int each : arr) {

            if (each > max) {
                max = each;
            }
        }
        return max;
    }


    // returns MaxNumber from Integer (Wrapper Class) Array
    public static Integer MaxNumber(Integer[] arr) {
        Integer max = arr[0];

        for (Integer each : arr) {

            if (each > max) {
                max = each;
            }
        }
        return max;
    }


    // returns MaxNumber from double primitive Array
    public static double MaxNumber(double[] arr) {
        double max = arr[0];

        for (double each : arr) {

            if (each > max) {
                max = each;
            }
        }
        return max;
    }


    // returns MaxNumber from Double (Wrapper Class Double) Array
    public static Double MaxNumber(Double[] arr) {

        Double max = arr[0];

        for (Double each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }



// returns MinNumber int primitive
    public static int MinNumber(int[] arr) {
        int min = arr[0];
        for (int each : arr) {
            if (each < min) {
                min = each;
            }

        }
        return min;
    }


    // returns MinNumber from Integer (Wrapper Class Integer) Array
    public static Integer MinNumber (Integer[] arr) {
        Integer min = arr[0];
        for (Integer each : arr) {
            if (each < min) {
                min = each;
            }

        }
        return min;
    }


    // returns MinNumber double primitive
    public static double MinNumber(double[] arr) {
        double min = arr[0];
        for (double each : arr) {
            if (each < min) {
                min = each;
            }

        }
        return min;
    }



    // returns MinNumber from Double (Wrapper Class Double) Array
    public static Double MinNumber(Double[] arr) {
        Double min = arr[0];
        for (Double each : arr) {
            if (each < min) {
                min = each;
            }

        }
        return min;
    }




    // this one inserts element in 2 array ad returns it(append one exrtra number to another array)
    public static int[] addElement(int[] arr, int num) {
        int[] arr2 = new int[arr.length + 1];
        arr2[arr2.length - 1] = num;

        int i = 0;
        for (int each : arr2) {
            arr2[i] = each;
            i++;
        }
        return arr2;
    }



    // this one inserts element in 2 array Integer (Wrapper Class) and returns Integer Wrappper Arrays(append one extra number to another array)
    public static Integer[] addElement(Integer[] arr, Integer num) {
        Integer[] arr2 = new Integer[arr.length + 1];
        arr2[arr2.length - 1] = num;

        Integer i = 0;
        for (Integer each : arr2) {
            arr2[i] = each;
            i++;
        }
        return arr2;
    }



    // this one inserts element in 2 array double primitive
    public static double[] addElement(double[] arr, double num) {
        double[] arr2 = new double[arr.length + 1];
        arr2[arr2.length - 1] = num;

        int i = 0;
        for (double each : arr2) {
            arr2[i] = each;
            i++;
        }
        return arr2;
    }


    // this one inserts element in 2 array Double (Wrapper Class)
    public static Double[] addElement(Double[] arr, Double num) {
        Double[] arr2 = new Double[arr.length + 1];
        arr2[arr2.length - 1] = num;

        int i = 0;
        for (Double each : arr2) {
            arr2[i] = each;
            i++;
        }
        return arr2;
    }




    // this one inserts element in 2 array char primitive and returns it(append one exrtra number to another array)
    public static char [] addElement(char[] arr, char num) {
        char[] arr2 = new char[arr.length + 1];
        arr2[arr2.length - 1] = num;

        int i = 0;
        for (char each : arr2) {
            arr2[i] = each;
            i++;
        }
        return arr2;
    }



    // this one inserts element in 2 array Character (Wrapper Class) ad returns it(append one exrtra number to another array)
    public static Character[] addElement(Character[] arr, Character num) {
        Character[] arr2 = new Character[arr.length + 1];
        arr2[arr2.length - 1] = num;

        int i = 0;
        for (Character each : arr2) {
            arr2[i] = each;
            i++;
        }
        return arr2;
    }



    // this one inserts element in 2 array String ad returns it(append one exrtra number to another array)
    public static String [] addElement(String [] arr, String num) {
        String [] arr2 = new String [arr.length + 1];
        arr2[arr2.length - 1] = num;

        int i = 0;
        for (String  each : arr2) {
            arr2[i] = each;
            i++;
        }
        return arr2;
    }



    // sorts int [] in discending order
    public static int[] sortDiscending(int[] arr) {

        Arrays.sort(arr); // first arr gets sorted

        int[] arr1 = new int[arr.length];
        // now the loop will get each of the arrays sorted to assign them in a discendign order
        int k = arr.length - 1;
        for (int i = 0; i <= arr1.length - 1; i++) {
            arr1[i] = arr[k];
            k--;
        }
        return arr1;


    }



    // sorts double [] in discending order and returns double arr
    public static double[] sortDiscending(double[] arr) {


        Arrays.sort(arr); // first arr gets sorted

        double[] arr1 = new double[arr.length];
        // now the loop will get each of the arrays sorted to assign them in a discendign order
        int k = arr.length - 1;
        for (int i = 0; i <= arr1.length - 1; i++) {
            arr1[i] = arr[k];
            k--;
        }
        return arr1;
    }



    // sorts char [] in discending order
    public static char[] sortDiscending(char[] arr) {


        Arrays.sort(arr); // first arr gets sorted

        char[] arr1 = new char[arr.length];
        // now the loop will get each of the arrays sorted to assign them in a discendign order
        int k = arr.length - 1;
        for (int i = 0; i <= arr1.length - 1; i++) {
            arr1[i] = arr[k];
            k--;
        }
        return arr1;
    }


    // sorts String [] in discending order, and returns String arr
    public static String[] sortDiscending(String[] arr) {


        Arrays.sort(arr); // first arr gets sorted

        String[] arr1 = new String[arr.length];
        // now the loop will get each of the arrays sorted to assign them in a discending order
        int k = arr.length - 1;
        for (int i = 0; i <= arr1.length - 1; i++) {
            arr1[i] = arr[k];
            k--;
        }
        return arr1;
    }



    // array sorts Wrapper Array Integer to Wrapper Class Array in desceding order
    public static Integer[] sortDescending(Integer[] arr) {
        Arrays.sort(arr);

        Integer[] arr1 = new Integer[arr.length];
        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr1[k] = arr[i];
            k++;
        }
        return arr1;
    }


    // sorts Double Array (Wrapper class Double ) in descending order
    public static Double [] sortDescending(Double [] arr) {
        Arrays.sort(arr);

        Double[] arr1 = new Double[arr.length];
        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr1[k] = arr[i];
            k++;
        }
        return arr1;
    }


    // sorts Character Array (Wrapper class Charactert) in descending order
    public static Character [] sortDescending(Character [] arr) {
        Arrays.sort(arr);

        Character[] arr1 = new Character[arr.length];
        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr1[k] = arr[i];
            k++;
        }
        return arr1;
    }


    // use to combine 2 int arrays in one new int array
    public static int[] combine2Arrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        // by indicating arr1.length + arr2. length we initialize the sise for arr3

        int i = 0;

        for (int each : arr1) {
            arr3[i] = each;// by using each elements index number we assing it to arr3
            i++;
        }
        for (int each : arr2) {
            arr3[i] = each;
            i++;
        }
        return (arr3);
    }


    // Combine two double array and return Double Array
    public static double[] combine2Arrays(double[] arr1, double [] arr2) {
        double[] arr3 = new double[arr1.length + arr2.length];
        // by indicating arr1.length + arr2. length we initialize the sise for arr3

        int i = 0;

        for (double each : arr1) {
            arr3[i] = each;// by using each elements index number we assing it to arr3
            i++;
        }
        for (double each : arr2) {
            arr3[i] = each;
            i++;
        }
        return (arr3);
    }



    // Combine two char array and return Character Array
    public static char[] combine2Arrays(char [] arr1, char [] arr2) {

        char [] arr3 = new char [arr1.length + arr2.length];
        // by indicating arr1.length + arr2. length we initialize the sise for arr3

        int i = 0;

        for (char each : arr1) {
            arr3[i] = each;// by using each elements index number we assing it to arr3
            i++;
        }
        for (char each : arr2) {
            arr3[i] = each;
            i++;
        }
        return (arr3);
    }



    // sorts String Array  in descending order
    public static String[] combine2Arrays(String[] arr1, String [] arr2) {
        String[] arr3 = new String[arr1.length + arr2.length];
        // by indicating arr1.length + arr2. length we initialize the sise for arr3

        int i = 0;

        for (String each : arr1) {
            arr3[i] = each;// by using each elements index number we assing it to arr3
            i++;
        }
        for (String each : arr2) {
            arr3[i] = each;
            i++;
        }
        return (arr3);
    }


    // Combine two Integer array (Wrapper Class) and return Integer Array
    public static Integer[] combine2Arrays(Integer[] arr1, Integer [] arr2) {

        Integer [] arr3 = new Integer [arr1.length + arr2.length];
        // by indicating arr1.length + arr2. length we initialize the sise for arr3

        int i = 0;

        for (Integer each : arr1) {
            arr3[i] = each;// by using each elements index number we assing it to arr3
            i++;
        }
        for (Integer each : arr2) {
            arr3[i] = each;
            i++;
        }
        return (arr3);
    }




    // Combine two Double array and return Double Array
    public static Double[] combine2Arrays(Double[] arr1, Double [] arr2) {
        Double[] arr3 = new Double[arr1.length + arr2.length];
        // by indicating arr1.length + arr2. length we initialize the size for arr3

        int i = 0;

        for (Double each : arr1) {
            arr3[i] = each;// by using each elements index number we assing it to arr3
            i++;
        }
        for (Double each : arr2) {
            arr3[i] = each;
            i++;
        }
        return (arr3);
    }



    // Combine two Character array (Wrapper Class) and return Character Array
    public static Character[] combine2Arrays(Character [] arr1, Character [] arr2) {

        Character [] arr3 = new Character [arr1.length + arr2.length];
        // by indicating arr1.length + arr2. length we initialize the size for arr3

        int i = 0;

        for (Character each : arr1) {
            arr3[i] = each;// by using each elements index number we assign it to arr3
            i++;
        }
        for (Character each : arr2) {
            arr3[i] = each;
            i++;
        }
        return (arr3);
    }


    // combines Two String One character at a time.
    public static String combineTwoStrings (String one, String two){
        String result = "";

        for (int i = 0; i<one.length() || i<two.length(); i++){
            if(i<one.length()) {
                result += one.charAt(i);
            }
            if(i<two.length()){
                result+=two.charAt(i);
            }
        }
        return result;
    }


    // cause the current execution thread to sleep for given seconds

    public static void sleep( int seconds){ // this is our custom method
        // this above is my custom method, the benefit of having it is that our codes become much more
        // reusable and becomes much more shorter
        try {
            Thread.sleep(seconds * 1000);
        }catch(InterruptedException e){

        }
    }
}
