package Day34_Wrapper_Class;

import java.util.ArrayList;

public class Return_max_min_number_From_Array_List {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // find max first by assigning possible smallest int to the MAX variable
        // whatever we have in our list will be bigger than our max value

        // then compare it with every elements of the array
        list.add(100);
        list.add(30);
        list.add(120);
        list.add(400);
        list.add(1000);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (Integer each : list) {
            if (each > max) {
                max = each;
            }
            if (each < min) {
                min = each;
            }
        }
        System.out.println("Max num is: " + max);
        System.out.println("Min num is: " + min);
    }
}
