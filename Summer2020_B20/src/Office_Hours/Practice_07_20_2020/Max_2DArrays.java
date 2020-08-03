package Office_Hours.Practice_07_20_2020;

public class Max_2DArrays {

    // write a program that can find max number from any giver two dimentional array


    public static void main(String[] args) {

        int [][] arr2D = {   {1, 2, 3},  {4, 5, 6},  {  7, 8, 9, 10, 11, 12  }    };

        // first compare first element with the rest


        int max = arr2D[0][0];
        int min = arr2D[0][0];

       for (int each = 0; each<=arr2D.length-1; each++) { // each is the index num of all array, outer arrays
            int [] eachArray = arr2D[each];

            for (int i = 0; i <= eachArray.length - 1; i++) {
                int eachNumber = eachArray[i]; // get elements from each one of the single arrays

                if (eachNumber > max) {
                    max = eachNumber;
                }
                if(eachNumber<min){
                    min= eachNumber;
                }
            }
        }
        System.out.println("this is max: " + max + ",  this is min: " + min);



    }
}
