package Day36_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Practice {

    public static void main(String[] args) {
        /*
        {30, 20, 40, 50, 15}

        output should be 50 40 30 20 15
         */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(100);

        Collections.sort(list);
        System.out.println(list);

        // print arrayList in reversed order

        ArrayList<Integer> descendingList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            //  descendingList.add( list.get (i) + " "); // this will print them reversed
            System.out.println(list.get(i) + " ");

        }

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("E");
        list2.add("C");
        list2.add("F");
        list2.add("A");
        list2.add("B");

        System.out.println(list2);

        Collections.swap(list2, 0, 4); // B C F A E // for the last index we can give list2.size()-1;
        System.out.println(list2);
        Collections.swap(list2, 1, 3);
        System.out.println(list2);

        // frequency method

        ArrayList<Character> charList = new ArrayList<>();

        charList.add('A');
        charList.add('B');
        charList.add('E');
        charList.add('A');
        charList.add('A');
        charList.add('A');

       int count =  Collections.frequency(charList, 'A');
        System.out.println(count);

    }
}
