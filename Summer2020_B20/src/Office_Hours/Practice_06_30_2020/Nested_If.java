package Office_Hours.Practice_06_30_2020;

public class Nested_If {
    public static void main(String[] args) {


        // use it when we have a Pre-condition, something must be TRUE.
        //we apply it by creating if statement in another if statement.

        // DO NOT convert nested If  to ternary = it will be hard to read it.


        int score = -1;


        char grade = ' ';

        // below create conditions for grade to be A, B, C, D, F

        if (score >= 0 && score <= 100) { // this is PRE-condition, as long as the score is VALID, we can create many other else if.

            if(score >= 90){

                 } else if (score >= 80) {
                    grade = 'B';
                 } else if (score >= 70) {
                    grade = 'C';
                 } else if (score >= 60) {
                    grade = 'D';
                 } else {
                    grade = 'F';
                 }
            }else {
                grade = 'I';
            }
        System.out.println(grade);








    }
}
