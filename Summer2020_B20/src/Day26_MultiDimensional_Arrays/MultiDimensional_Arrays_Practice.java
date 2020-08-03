package Day26_MultiDimensional_Arrays;

import java.awt.event.AdjustmentEvent;
import java.util.Arrays;

public class MultiDimensional_Arrays_Practice {
    public static void main(String[] args) {


        String testers[] = {"Jack", "German", "Tony", "Brian"};
        String developers[] = {"Paolo", "Stephan", "Marc", "Belly"};
        String SM[] = {"Lisa"};
        String Po[] = {"Nadir"};
        String BA[] = {"Alex"};

        String[][] scrumTeam = {testers, developers, SM, Po, BA};

        String[] testers2 = {"Irene", "Muhtar", "Nazar"};

        scrumTeam[4][0] = "Adam";  // if we want to change Alex to Adam in BA

        scrumTeam[1][1] = "RumCake"; // changing Stephan to RumCake

        System.out.println(Arrays.deepToString(scrumTeam));

        // to replaces the entire testers team:

        scrumTeam[0] = testers2;

        scrumTeam[3][0] = "Zeki";

        System.out.println(Arrays.deepToString(scrumTeam));
        System.out.println("===================");

        for (String[] each1 : scrumTeam) {
            for (String names : each1) {
                System.out.println(names);
            }
            //System.out.println(Arrays.toString(each1));

        }
        System.out.println("============================");
// apply nested for each loop
        // print out numbers that are only divisible by 3 or by 5

        int[][] scores = {{10, 20, 30, 45}, {60, 55, 75, 105}, {93, 48, 125, 135}};


        // first iterate the single dimensional arrays

        for (int[] each1DArray : scores) { // each of the single dimensional arrays
            for (int eachElement : each1DArray) {// each of the elements in that single dimensional arrays
                if (eachElement % 3 == 0 || eachElement % 5 == 0) {
                    System.out.print(eachElement + " ");
                }

            }
        }

        System.out.println("================");


        // two dimensinal arrays:

        int [][] a1 = {      {1, 2},          {3, 4, 5,}      };

        int [][] a2 = {      {6, 7},          {8, 9, 10,}      };


        // if we want to put those into 1 dimensional array we have to use a three dimensional array

        int [][][] arr3D = {     {{1, 2}, {3, 4, 5,} },        {{6, 7}, {8, 9, 10,}}   };
        // indexes =                        0                                  2
    }
}
