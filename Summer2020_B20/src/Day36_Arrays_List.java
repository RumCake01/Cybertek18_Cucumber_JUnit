import java.util.ArrayList;
import java.util.ArrayList;
public class Day36_Arrays_List {

    public static void main(String[] args) {



        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // 0
        list.add(50);// 1
        list.add(40);// 2
        list.add(20);// 3
        list.add(50);// 4



        int a = list.indexOf(40);
        System.out.println(a);
        System.out.println(list.lastIndexOf(40));

        boolean r1 = list.contains(100);


    }

}
