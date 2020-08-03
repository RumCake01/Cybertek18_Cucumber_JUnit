package Day36_ArrayList;

import java.util.ArrayList;

public class Set_method {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);
        list1.add(70);
        list1.add(80);

        System.out.println("====================");

        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 1; i<=20; i++){
            list2.add(i);
        }
        System.out.println(list2);

        for(int i = 0; i<=list2.size()-1; i++){
            Integer each = list2.get(i);

            if(each %2 !=0){
                list2.set(i, each*2); // index number of the old element and then put it back
            }else{
                list2.set(i, each*3);
            }
        }
        System.out.println(list2);

    }
}
