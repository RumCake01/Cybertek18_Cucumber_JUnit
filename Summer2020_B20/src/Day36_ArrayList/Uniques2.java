package Day36_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Uniques2 {

    public static void main(String[] args) {

            ArrayList<Integer> list = new ArrayList<>(); // 1 1 2 3 3  // find frequency of each one of these elements

            list.add(1);
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(3);

            ArrayList<Integer> uniques = new ArrayList<>();// here we will store our expected elements

            for (int i = 0; i <= list.size() - 1; i++) {  // outer loop gets each of the elements

                // also can be done with for each loop instead (as an outer loop)
                //for (Integer element : list) // this again will be outer loop

                Integer element = list.get(i);

                for (Integer each : list) { // inner loop finds frequency of each of the elements
                    int count = Collections.frequency(list, each);
                    if (count == 1) { // if frequency is 1 then it is unique element, verifies if element is unique.
                        uniques.add(element);
                    }
                }
                System.out.println(uniques);
            }
        }
    }