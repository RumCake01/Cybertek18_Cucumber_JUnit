package Office_Hours.Practice_07_20_2020;

public class Max_2DArray_Mixed_Methods_For_AND_ForEachLOOp {

    public static void main(String[] args) {
        // write a program that can find max number from any giver two dimentional array
        // mixed methods for each loop and for loop


            int [][] arr2D = {   {1, 2, 3},  {4, 5, 6},  {  7, 8, 9, 10, 11, 12  }    };

            // first compare first element with the rest


        int max = arr2D[0][0];
        int min = arr2D[0][0];


        for (int i = 0; i<=arr2D.length-1; i++){

            for ( int eachNumber : arr2D[i]) { // to get each element from signle arrays
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
