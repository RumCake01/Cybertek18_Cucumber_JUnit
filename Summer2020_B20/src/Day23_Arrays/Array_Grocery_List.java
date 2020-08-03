package Day23_Arrays;

public class Array_Grocery_List {
    public static void main(String[] args) {


        String[] groceryList = {"Carrots", "Kale", "Avocado", "Almond Flour", "Tofu"};
        double[] priceOfItem = {3.00, 2.99, 5.99, 8.99, 2.67};

        for (int i = 0; i <= groceryList.length - 1; i++) {
            System.out.println(groceryList[i] + ": $" + priceOfItem[i]);
        }


        System.out.println("==============================================");

        String []shoppingList = new String[7];

        shoppingList[0]= "Avocado";
        shoppingList[1]= "Bread";
        shoppingList[2]= "Kale";
        shoppingList[3]= "Radish";
        shoppingList[6]= "Carrots";
        shoppingList[5]= "Tomatoes";
        shoppingList[4]= "Beans";

        for(int a = 0; a<shoppingList.length; a++) {
            System.out.println(shoppingList[a]);
        }











    }
}
