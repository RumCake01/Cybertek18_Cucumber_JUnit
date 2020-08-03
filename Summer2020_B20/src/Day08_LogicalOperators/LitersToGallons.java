package Day08_LogicalOperators;

public class LitersToGallons {
    /* write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.78 */

    public static void main(String[] args) {
        double liter = 1000;
        double gallon = liter / 3.785;
        System.out.println(liter + " liters are = " +  ( int) gallon + " gallons" );
        // by adding (int) we cast double gallons to int, so the result is without decimal


    }

}
