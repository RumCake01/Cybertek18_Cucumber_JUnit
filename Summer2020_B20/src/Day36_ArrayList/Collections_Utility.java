package Day36_ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class Collections_Utility {

    /*
    Arrays: utility class for array
    Collections: utility for collection // import this from Collections class from java.util

    we can them for any data structure
     */

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(100);

        Collections.sort(list); // will put arraylist in ascending order
        System.out.println(list);
        System.out.println("maximum number is: " + list.get( list.size()-1));
        System.out.println("minimum number is: " + list.get(0));

    }
}
