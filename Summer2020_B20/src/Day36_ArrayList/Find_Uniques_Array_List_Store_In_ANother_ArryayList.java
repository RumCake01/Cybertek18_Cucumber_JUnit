package Day36_ArrayList;

import java.util.ArrayList;

public class Find_Uniques_Array_List_Store_In_ANother_ArryayList {

    // write a program that can find the unique elements
    // from an ArrayList of integers and stores into another list called uniques

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(); // 1 1 2 3 3  // find frequency of each one of these elements

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);

        ArrayList<Integer> uniques = new ArrayList<>();// here we will store our expected elements

        for (int i = 0; i<=list.size()-1; i++  ) {  // outer loop gets each of the elements

            // also can be done with for each loop instead (as an outer loop)
            //for (Integer element : list) // this again will be outer loop

            Integer element = list.get(i);
            int count = 0;
            for (Integer each : list) { // inner loop finds frequency of each of the elements

                if (each == element) {
                    count++;
                }
            }

            if (count == 1) { // if frequency is 1 then it is unique element, verifies if element is unique.
                uniques.add(element);
            }
        }
        System.out.println(uniques);
    }
}
