package Day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Utility {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(30, 50, 80, 10, 1, 2));

        // print max number using Collections max utility

        Integer max = Collections.max(nums);

        // print max number using Collections min utility
        Integer min = Collections.min(nums);

        System.out.println("max num " + max);
        System.out.println("min num " + min);
        System.out.println("========================");

        // Collections utility  replaceAll method



        // replace Muhtar names with Fatime

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Nike", "Muhtar", "Mike", "Jack", "Muhtar"));
        Collections.replaceAll(names, "Muhtar", "Fatime");
        System.out.println(names);

    }
}
