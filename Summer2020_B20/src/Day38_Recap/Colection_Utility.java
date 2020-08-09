package Day38_Recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Colection_Utility {

    public static void main(String[] args) {

        /*
        Collections.sort(ColectionType): sorts it in ascending order
        Collections.swap(ColectionType, index1, index2): swap the elements

        Collections.frequency(ColectionType, Element): returns the frequency of element


        Collections.max(ColectionType): returns the maximum
        Collections.min(ColectionType): return the minimum
        Collections.replaceAll(ColectionType, old value first, then new value);

         */

        // sort method
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList( 'R', 'C', 'D', 'A', 'B', 'E', 'K') );

        System.out.println(chars);
        Collections.sort(chars);
        System.out.println(chars);

        // swap method
        ArrayList<String>names = new ArrayList<>();
        names.addAll(Arrays.asList("Alan", "Jemal", "Rumcake", "Brian", "Debra"));
        Collections.swap(names, 1, 4);// switches name under ind 1 to index 4
        Collections.swap(names, 1, 4);// returns names to their original order
        Collections.swap(names, 0, names.size()-1);// switching index zero with the last word in the arraylist
        System.out.println(names);


        //frequency method
        ArrayList<String> homeItems = new ArrayList<>();
        homeItems.addAll(Arrays.asList("Coffe", "Banana", "Table", "Chari", "Doorbell"));
        int count= Collections.frequency(homeItems, "Banana");
        System.out.println(count);

        ArrayList<String> unique = new ArrayList<>();
        for(String each : unique){
            int i = Collections.frequency(homeItems, each);
            if(i==1){
                unique.add(each);
            }
        }
        System.out.println(unique);

        // another way to find uniques by using frequency method

        ArrayList<String> unique2 = new ArrayList<>();
        unique2.addAll(homeItems);
        unique2.removeIf(p-> Collections.frequency(unique2, p) >1);
        System.out.println(unique2);

        // min and max methods

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(10, 90, 100, 76, 54, 87, 23, 24, 19, 30, 44, 65));

       Integer min = Collections.min(nums);
       Integer max = Collections.max(nums);

        System.out.println("min numbers: "  + min);
        System.out.println("max numbers: " + max);

        //replace method:

        Collections.replaceAll(nums, 100, 30);
        System.out.println(nums);


    }
}
