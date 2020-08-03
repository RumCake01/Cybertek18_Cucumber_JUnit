package Day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Duplicates {

    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('A', 'A', 'B', 'B', 'C', 'C'));

        System.out.println(list);

        ArrayList<Character> nonDup = new ArrayList<>(); // right now this is an empty array List

        for(Character each : list ){
            if( !nonDup.contains(each)){
                nonDup.add(each);
            }
        }


        System.out.println("=================");


        ArrayList<String> list1 = new ArrayList<>();
        list1.add("cybertek");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Cybertek");

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1.equals(list2));

        System.out.println("==================");


        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);

        System.out.println(list3.isEmpty());
    }
}
