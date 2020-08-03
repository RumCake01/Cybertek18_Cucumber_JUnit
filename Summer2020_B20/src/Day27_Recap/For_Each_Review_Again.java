package Day27_Recap;

public class For_Each_Review_Again {

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 5 };

        for(int i = 0; i<=arr.length-1; i++){
            System.out.print(arr [i] +" ");
        }

        System.out.println();

        System.out.println("=========================");

        // we can do this task with for each loop as well


        for(int each: arr){
            System.out.print(each + " " );
        }

        System.out.println();

        System.out.println("=========================");

        // Reverse the for loop


        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }

        // reverse it with for each loop - WE CAN NOT REVERSE IT WITH FOR EACH LOOP because we need provide index numbers.



        System.out.println();

        System.out.println("=========================");



        // print out numbers that are divisible by 3.


        int [] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};

        // use for each loop and continue statement


// iterate every single element one by one

        // get access to each elements by using FOR EACH loop

        int countDivisbleBy3 = 0;

        for( int each : scores){ // print out each only if the number are divisble by 3.

            if(each%3 != 0){ // if its not evenly divisible by 3, we need to skip it
                continue;
            }
            countDivisbleBy3++;
            System.out.print(each + " " );
        }
        System.out.println(countDivisbleBy3);


        System.out.println();
        System.out.println("======================");

        String[] names = {"AB", "ABC", "A", "AB", "ABCD"};

       for(String each : names){
           if( ! each.contains("C")){
               continue;
           }
           System.out.print(each + "");
       }


        System.out.println();
        System.out.println("======================");



        // find the max and min from array:


        int [] score = {80, 75, 65, 110, 90, 45, 56, 78};


        int maxNumber = score[0];
        int minNumber = score[0];

        for( int each  : score){
            if(each>maxNumber) { // if it is true, we will assign each to maxNumber, if each new number is bigger than the previous one,
                //then it is assigned to the max number
                maxNumber=each;

            }
            if(each<minNumber){ // if it is true, we will assign each to minNumber, if each new number is bigger than the previous one,
                //then it is assigned to the min number
                minNumber=each;
            }
        }
        System.out.println("Max number: " + maxNumber);
        System.out.println("Min number: " + minNumber);

    }

}
