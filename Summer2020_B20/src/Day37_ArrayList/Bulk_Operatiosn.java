package Day37_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_Operatiosn {


    public static void main(String[] args) {

        ArrayList<Integer> list  = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        boolean r1 = list.contains(1);

        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(4);

        boolean r2 = list.containsAll(elements);

        System.out.println(r2);

        System.out.println("====================================");

        // verify that 1, 2, 4 are contained in the list2

        ArrayList<Integer> list2 = new ArrayList<>();
       list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);


       boolean r3 =  list2.containsAll(Arrays.asList(1, 3, 4) );

       Integer [] arr = {10, 20, 4};
       boolean r4 = list2.containsAll( Arrays.asList(arr) );
        System.out.println(r3);
        System.out.println(r4);

        System.out.println("====================================");



        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(30, 50, 76, 100));
        System.out.println(numbers);


        System.out.println("====================================");



        ArrayList<String> group29 = new ArrayList<>();

        group29.addAll(Arrays.asList("James", "Mike", "Loretta", "RumCake", "Stani", "Cristina","Alla") );

        group29.containsAll(Arrays.asList("Kuzzat", "Mirodel" ) );
        System.out.println(group29);

        System.out.println("====================================");

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll( Arrays.asList(1, 1, 2, 2, 3, 4, 5, 5, 6, 7, 7, 7));
        System.out.println(nums);
        nums.removeAll(Arrays.asList(1, 7, 5)); // removes these matching elements from the Arrays list
        System.out.println(nums);


        System.out.println("====================================");


        // retainAll methods - removes all the NOT matchign elements

        ArrayList<Integer> nums1 = new ArrayList<>();

        nums1.addAll( Arrays.asList(1, 1, 2, 2, 3, 4, 5, 5, 6, 7, 7, 7));
        nums1.retainAll(Arrays.asList(1, 2, 3, 9)); // value of elements that we WANT to keep
        System.out.println(nums1);


    }
}

