package Day28_Recap_Warm_Up_tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Multi_Dimensional_Array_Practice {

    public static void main(String[] args) {

        String[] group22 = {"Aalia", "Aiperi", "Cristina", "RumCake", "Stani",
                "Viorel", "Iclal", "Saim", "Tsolmon", "Daniel", "Bahar"};
        String[] group33 = {"Aalia", "Aiperi", "Cristina", "RumCake", "Stani",
                "Viorel", "Iclal", "Saim", "Tsolmon", "Daniel", "Bahar"};
        String[] group2 = {"Aalia", "Aiperi", "Cristina", "RumCake", "Stani",
                "Viorel", "Iclal", "Saim", "Tsolmon", "Daniel", "Bahar"};
        String[] group21 = {"Aalia", "Aiperi", "Cristina", "RumCake", "Stani",
                "Viorel", "Iclal", "Saim", "Tsolmon", "Daniel", "Bahar"};
        String[] group17 = {"Aalia", "Aiperi", "Cristina", "RumCake", "Stani",
                "Viorel", "Iclal", "Saim", "Tsolmon", "Daniel", "Bahar"};

        String[][] Batch20 = {group33, group22, group2, group21, group17};
        //  indexes:            0       1           2       3       4


        for (int i = 0; i <= Batch20.length - 1; i++) {
            String[] eachGroup = Batch20[i];
            // System.out.println(Arrays.toString(eachGroup));

            // now lets iterate each of the array, lets print out each of the members

            for (int j = 0; j <= eachGroup.length - 1; j++) {
                String eachStudent = eachGroup[j];

                if (eachStudent.toLowerCase().contains("m")) {

                    System.out.print(eachStudent + "   ");
                }

            }
            System.out.println();
        }
    }
}


