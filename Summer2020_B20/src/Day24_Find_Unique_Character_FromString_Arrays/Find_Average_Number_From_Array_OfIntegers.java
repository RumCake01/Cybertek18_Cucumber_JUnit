package Day24_Find_Unique_Character_FromString_Arrays;

public class Find_Average_Number_From_Array_OfIntegers {
    public static void main(String[] args) {

        int[]array = {1,2, 3, 4,5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};

        int sum = 0;

        for(int i = array.length-1; i>=0; i--) { // we need decrement here because otherwise we will get error called IndexOutOfBond
            // it cant be here less than zero

            sum+=array[i];
        }
        // to find the average numbers we need double data type: we need divide the sum divide by length and then do casting
        System.out.println(sum);

        double average = sum/ (double)array.length; /*we do cast here so we can get a double number after dividing int by int
        but we want to convert it to double, thats why we added double to one of the integers so it can be verted to dec number.
   this is a must otherwise we will get a int number and the result will not be the actualy number even if we assign it to double average */

        System.out.println(average);


    }
}
