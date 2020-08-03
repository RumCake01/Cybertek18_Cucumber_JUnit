package Day34_Wrapper_Class;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Array_List_Practice {

    public static void main(String[] args) {

        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        for(int i = 0; i<=100; i++){
            if(i%2==0){
                evenList.add(i);
            }else{
                oddList.add(i);
            }
        }
        System.out.println("\n" + oddList);
        System.out.println();
        System.out.println(evenList);
        System.out.println("=====================================");


        ArrayList<String>groceryList = new ArrayList<>();
        groceryList.add("avocado");
        groceryList.add("almond milk");
        groceryList.add("oatmeal");
        groceryList.add("raisins");
        groceryList.add("nuts");

        for(int i = groceryList.size()-1; i>=0; i--){
            System.out.print(groceryList.get(i) + "   ");

        }
        System.out.println();

        for(String each : groceryList){
            System.out.println(each);
        }

    }


}
