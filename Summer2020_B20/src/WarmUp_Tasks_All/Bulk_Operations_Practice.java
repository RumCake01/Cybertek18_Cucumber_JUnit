package WarmUp_Tasks_All;
import java.util.ArrayList;
import java.util.Arrays;
public class Bulk_Operations_Practice {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("A");
        students.add("B");
        students.add("C");
        students.add("D");
        students.add("E");
        students.add("F");

       boolean r1 = students.containsAll(Arrays.asList("G","K" ) );

        System.out.println(r1);

        System.out.println("====================================");

        // write a program that can remove all the names named 'Ahmed'

        ArrayList<String> employeeNames = new ArrayList<>();

        employeeNames.addAll(Arrays.asList("Mike", "Jimmy", "Sarah", "Ahmed", "Ahmed") );
        System.out.println(employeeNames);
        employeeNames.removeAll(Arrays.asList("Ahmed") );// convert to the collection type and remove Ahmed
        employeeNames.retainAll(Arrays.asList("Mike", "Jimmy", "Sarah") );
        System.out.println(employeeNames);
        System.out.println("====================================");
        System.out.println(employeeNames);


        System.out.println("====================================");

        // write a program that can remove all the numbers that are less than 5

        ArrayList<Integer> nums1 = new ArrayList<>();

        nums1.addAll( Arrays.asList(1, 1, 2, 2, 3, 4, 5, 5, 6, 7, 7, 7));
        for (int i = 0; i<=nums1.size()-1; i++){

            if(nums1.get(i)<5){
                nums1.remove(i);
            }
        }
        System.out.println(nums1);


    }
}
