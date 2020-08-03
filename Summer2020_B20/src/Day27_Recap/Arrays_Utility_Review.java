package Day27_Recap;
import java.util.Arrays;

public class Arrays_Utility_Review {
    public static void main(String[] args) {

        /*

        sort():
       toString():
       equals():

         */

        // ascending order, solve a String array put array in discending order by using sort method

        String[] names = {"Odina", "Liliia", "Berk", "Emine"};

        Arrays.sort(names);// will print them sorted by ASCII table

        System.out.println(Arrays.toString(names));

        int [] score = {80, 75, 65, 110, 90, 45, 56, 78};

        // sort them that the small number will be at index zero and the biggest one will be last number

        Arrays.sort(score);

        System.out.println(Arrays.toString(score));
        System.out.println("Maximum" + score [ score.length-1 ] );// will get us max num
        System.out.println("minumim" + score [ 0] );// will get us min num

        System.out.println("========================");
        // equals method: verify if arrays are equal or not


        String[] s1 = {"A", "B", "C"};
        String [] s2 = {"A", "B","C"};

        System.out.println(Arrays.equals(s1, s2)); // equals method checks index by index, will give us boolean result

        String[] s3 = {"C", "A","B"};
        System.out.println(Arrays.equals(s1, s3));

        // we can use sort method to organize elements and them use equals method to compare them
        /// will give us boolean result

        String [] a1 = {"B", "C", "A"};
        String[] a2 = {"B", "A", "C"};


        // we can get true results without worrying about their order by using SORT method, will give us boolean result
        Arrays.sort(a2);
        Arrays.sort(a1);

        System.out.println(Arrays.equals(a2, a1));

        // convert the string to arrays now

        String w1 = Arrays.toString(a1);
        System.out.println(w1);

    }
}
