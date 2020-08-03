package Office_Hours.Practice_06_30_2020;

public class Else_if_multibranch {
    public static void main(String[] args) {

        // A, B, C , D, F
        int score = 45;


        char grade = ' ';

        // below create conditions for grade to be A, B, C, D, F

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println(grade);

        // put in ternary

        char grade2 = (score >= 90 && score <= 100) ? 'A' : (score >= 80) ? 'B' :
                (score >= 70) ? 'C' : (score >= 60) ?  'D' : 'F';

        System.out.println(grade2);
    }
}
