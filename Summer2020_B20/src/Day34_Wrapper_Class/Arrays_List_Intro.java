package Day34_Wrapper_Class;
import java.util.ArrayList;

public class Arrays_List_Intro {

    public static void main(String[] args) {


        // Arrays List METHODS

        // =================ADD METHOD ===============

        ArrayList<Integer> scores = new ArrayList<>();
        // in Arrays List we don't initialize the size, its dynamic, automatically adjusted
            scores.add(95);// any primitive given here will be assigned to the Wrapper class, autoBoxing
          // the size here is 1, because we added only 1 element (), index zero for 95.

            scores.add(100); // index will be 1 here

            scores.add(85); // index is 2 for 85
            scores.add(75); // index is 3 for 75
            scores.add(4, 77);// this will change our original number under index 1 to number 65
        // and it will push the existing number to the one before that number.

        // we cant skip elements when adding new elements, make sure to fill all the indexes with their elements.


        System.out.println(scores);

        // ============ GET METHOD ====================


        // IF WE want to get 100 from the array list above, we can use GET method and indicate the index number

        // 100:
        System.out.println(scores.get(1));// get method will return the same data Type as Array List







    }
}
