package Office_Hours.Practice_07_20_2020;

public class Max_3D_Array_For_Each {
    public static void main(String[] args) {

        int [][] [] arr3D = {  {    {1, 2, 3},    {4, 5, 6} } ,    { { 7, 8, 9, 13  }    } };

        int max = arr3D[0][0][0];

        int min = arr3D[0][0][0];

       for( int[][] arr2D : arr3D){
           for( int [] arr1D : arr2D){
               for (int eachNumber : arr1D){
                   if(eachNumber>max){
                       max=eachNumber;
                   }
                   if(eachNumber<min){
                       min= eachNumber;
                   }
               }
           }
       }

        System.out.println("this is ur max num: " + max + ",  this is ur min num:  " + min);



    }
}
