package Office_Hours.Practice_07_20_2020;

public class Max_2DArray_Using_For_eachLoop {
    public static void main(String[] args) {

        int [][] arr2D = {   {1, 2, 3},  {4, 5, 6},  {  7, 8, 9, 10, 11, 12  }    };

        // first compare first element with the rest


        int max = arr2D[0][0];
        int min = arr2D[0][0];


        for (int [] each1D : arr2D){ // to get each 1D array
            for ( int eachNumber : each1D) { // to get each element from signle arrays
                if (eachNumber > max) {
                    max = eachNumber;
                }
                if(eachNumber<min){
                    min = eachNumber;
                }
            }

        }
        System.out.println(" this is min: " + min + " this is max: "  + max);













    }
}
