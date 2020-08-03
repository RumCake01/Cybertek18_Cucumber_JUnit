package Day35;

import java.util.ArrayList;

public class ArrayList_methods {


    // if we want to update the element we need to use a set method
    public static void main(String[] args) {

        ArrayList<String> earlyBirdsList = new ArrayList<>();
        earlyBirdsList.add("Ibrahim");
        earlyBirdsList.add("Virginia");
        earlyBirdsList.add("Erfan");
        earlyBirdsList.add("Aalia");

        earlyBirdsList.set(2, "Aslan");
        earlyBirdsList.set(0, "RUmCake");
        System.out.println(earlyBirdsList);


        //=============METHOD CLEAR========================

        earlyBirdsList.clear();
        System.out.println(earlyBirdsList.size());


        //=============METHOD REMOVE========================
// remove items from the list ==> remvoes primitives (int index)

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // 0
        list.add(2);//  1
        list.add(3);//  2
        list.add(4);//  3
        list.add(5);//  4

        list.remove(2);  // [1, 2, 4, 5]
        list.remove(3);
        System.out.println(list);

        System.out.println("===========================================");

        // //=============METHOD REMOVE========================
        //// remove items from the list ==> remove object  ( index or index)

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1); // 0
        list1.add(2);//  1
        list1.add(3);//  2
        list1.add(4);//  3
        list1.add(5);//  4

       Integer a = 1; // if u pass the wrapper, non primitve to the remove method it will remove the element
       // int b = 1; // if u pass primitive it will remove the item with that index number.
        list1.remove(a);
        System.out.println(list1);

        System.out.println("=================");

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Mike"); // 0
        list2.add("jen");  //  1
        list2.add("Tom");  //  2
        list2.add("RumCake");//  3
        list2.add("Slava");//  4

        list2.remove("Tom");

        System.out.println(list2);


    }
}