package Day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Utility {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(30, 50, 80, 10, 1, 2));

        // print max number using Collections max utility

        Integer max = Collections.max(nums);

        // print max number using Collections min utility
        Integer min = Collections.min(nums);

        System.out.println("max num " + max);
        System.out.println("min num " + min);
        System.out.println("========================");

        // Collections utility  replaceAll method



        // replace Muhtar names with Fatime

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Nike", "Muhtar", "Mike", "Jack", "Muhtar"));
        Collections.replaceAll(names, "Muhtar", "Fatime");
        System.out.println(names);


        // grades list

        ArrayList<Integer> grades = new ArrayList<>();

        grades.addAll(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));



        ArrayList<Integer> gradeOfA = new ArrayList<>();
        gradeOfA.addAll(grades);
        gradeOfA.removeIf(p-> p <90);

        System.out.println("these are the grades of A " + gradeOfA.size() + " "  + " and their score is " + gradeOfA);

        ArrayList<Integer> gradeOfB = new ArrayList<>();
        gradeOfB.addAll(grades);
        gradeOfB.removeIf(p-> p <80 || p >90);
        System.out.println("these are the grades of B " + gradeOfB.size() + " "  + " and their score is " + gradeOfB);

        ArrayList<Integer> gradeOfC = new ArrayList<>();
        gradeOfC.addAll(grades);
        gradeOfC.removeIf(p-> p < 70 || p>80);
        System.out.println("these are the grades of C " + gradeOfC.size() + " "  + " and their score is " + gradeOfC);

        ArrayList<Integer> gradeOfD = new ArrayList<>();
        gradeOfD.addAll(grades);
        gradeOfD.removeIf(p-> p < 60 || p>69);
        System.out.println("these are the grades of D " + gradeOfD.size() + " "  + " and their score is " + gradeOfD);

        ArrayList<Integer> gradeOfF = new ArrayList<>();
        gradeOfF.addAll(grades);
        gradeOfF.removeIf(p-> p>0 || p<59);
        System.out.println("these are the grades of F " + gradeOfF.size() + " "  + " and their score is " + gradeOfF);
    }
}
