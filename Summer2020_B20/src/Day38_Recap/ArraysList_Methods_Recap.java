package Day38_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysList_Methods_Recap {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        cars.addAll(Arrays.asList("Lamborghini", "BMW", "Porsche", " AstonMartin", "Lexus"));

        // cars.remove(2); // one way to do it by passing the index number
        // cars.remove("Porsche"); // second method to remove same element by giving its name
        // cars.removeIf(p-> p.toLowerCase().contains("m"));
        // cars.removeAll(Arrays.asList("BMD"));
       //  cars.retainAll(Arrays.asList("Tesla"));  // keep only mathching items
        System.out.println(cars);



        // contains method

        ArrayList<String> groceryList = new ArrayList<>();

        groceryList.addAll(Arrays.asList("Mango", "Avocado", "Tofu",  "Almond Milk", "Honey", "Cherry"));
        boolean r = groceryList.contains("Mango"); // check if one element is present
        boolean r1 = groceryList.containsAll(Arrays.asList("Tofu", "Cherry")); // checks if multiple elements are present
        System.out.println(r);
        System.out.println(r1);
        System.out.println("Total number of items: " + groceryList.size());


        //set cherry to apple, first find the index number and then we pass whatever we need to:
        // to get the last index number we need to give size()-1

       // set method
        groceryList.set(groceryList.size()-1, "Apple");
        System.out.println(groceryList);

        // now set tofu to papertowels,
        // first provide the indexOf method for the word, and then the word we want to replace it with

        // set method
        groceryList.set(groceryList.indexOf("Tofu"), "Washing Machine");
        System.out.println(groceryList);


        // clear method
        groceryList.clear();// clears everything
        System.out.println(groceryList);
    }
}
