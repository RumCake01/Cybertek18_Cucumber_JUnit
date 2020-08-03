package Day37_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Lambda_Expression {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 3, 1, 1, 1, 6, 7));

        Predicate <Integer>  lessThan5 = p -> p <5; // if integer predicate is less than 5
        list.removeIf(lessThan5);// then this function will remove it.
// also can declare this way:

        list.removeIf( p -> p <5); // the same way to give lambda expression
        System.out.println(list);

        System.out.println("=================");
        // removeIf odd numbers
        Predicate<Integer> oddNumbers = p -> p %2 !=0; // p stands for int number
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i<=100; i ++){
            numbers.add(i);
        }

       // numbers.removeIf(p -> p %2 !=0); // removes  all odd numbers
        numbers.removeIf(p -> p %2==0); // removes all even numbers
        // System.out.println(numbers);
        System.out.println("=======");
        System.out.println(numbers);


        System.out.println("===========");

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Mary", "Mike", "Milena", "Jack", "Sergi"));

        names.removeIf( p -> p.startsWith("M") && p.endsWith("y") ); // removes items under this condition if they start with Uppercase M
        System.out.println(names);


        System.out.println("===============");

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1, 1, 1,1 ,1 ,1, 2, 3, 3, 3,3 , 4));
        // remove elements that are not unique
        nums.removeIf( p -> Collections.frequency(nums, p) != 1) ;
        System.out.println(nums);


    }
}
