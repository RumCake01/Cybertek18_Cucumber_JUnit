package Day37_ArrayList;

import Library.Util;

import java.util.ArrayList;
import java.util.Collections;

public class Frequency_of_Charac_remove_duplicates {
    public static void main(String[] args) {


        // find frequency of chars
        String str = "AAABBC";


        ArrayList<String> list = new ArrayList<>();

        for (String each : str.split("")) {
            list.add(each);

        }
        System.out.println(list);

        String nonDuplicates = Util.removeDuplicates(str); // avoid duplication
        for (String each : nonDuplicates.split("")) {
            int count = Collections.frequency(list, each);
            System.out.println(each + count);

        }

    }
}
