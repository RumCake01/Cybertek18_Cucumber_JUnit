package Day35;

import java.util.ArrayList;
import java.util.ArrayList;

public class Combine_2Arrays_to_ArrayList {

    /*
    3. write a program that can combine two String arrays into one arrayList
        ex:
        arr1 = {"A", "B", "C"};
        arr2 = {"D", "E", "F", "G"};
        list ==> {"A", "B", "C", "D", "E", "F", "G"}  */

    public static void main(String[] args) {

        String[] group1 = {"Aalia", "Mohammed", "Mike", "Jack"};
        String[] group2 = {"Jennifer", "Said", "Berk", "Jamal"};

        ArrayList<String> studentList = new ArrayList<>();
        for (String each : group1) {
            studentList.add(each);
        }
        for (String each : group2) {
            studentList.add(each);
        }

        System.out.println(studentList);


    }


    public static int[] mergR(int[] a, int[] b) {


        int[] both = new int[a.length + b.length];
        int z = 0;
        for (int each : a) {
            both[z] = each;
            z++;
        }
        for (int each : b) {
            both[z] = each;
            z++;
        }
        return both;
    }
}