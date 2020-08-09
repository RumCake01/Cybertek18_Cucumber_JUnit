package Day38_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class Grade_Report {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();


        list.addAll(Arrays.asList(100, 90, 88, 55, 76, 35, 77, 87, 67, 65, 99, 53, 43, 42, 57, 81, 73, 95, 96));

        System.out.println(list);

        ArrayList<Integer> gradeA = new ArrayList<>(); // 90-100
        gradeA.addAll(list);
        gradeA.removeIf(p-> p < 90  );
        System.out.println("grade A: " + gradeA);

        ArrayList<Integer> gradeB = new ArrayList<>();
        gradeB.addAll(list);
        gradeB.removeIf(p-> p <80 || p>89);
        System.out.println("grade B: " + gradeB);

        ArrayList<Integer> gradeC = new ArrayList<>();
        gradeC.addAll(list);
        gradeC.removeIf(p -> p <70 || p>79);
        System.out.println("grade C: " + gradeC);

        ArrayList<Integer> gradeD = new ArrayList<>();
        gradeD.addAll(list);
        gradeD.removeIf(p -> p <60 || p>69);
        System.out.println("grade D: " + gradeD);

        ArrayList<Integer> gradeF = new ArrayList<>();
        gradeF.addAll(list);
        gradeF.removeIf(p -> p <50 || p>59);
        System.out.println("grade F: " + gradeF);

        System.out.println("=============================");

        System.out.println(gradeA.size() + "  students have A");
        System.out.println(gradeB.size() + "  students have B");
        System.out.println(gradeC.size() + "  students have C");
        System.out.println(gradeD.size() + "  students have D");
        System.out.println(gradeF.size() + "  students have F");

    }
        }

