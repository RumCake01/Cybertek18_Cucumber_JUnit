package Day11_Nested_If_Statements;

public class Quiz_June20 {
    public static void main(String[] args) {

        int num = 9;
        if (num++ == 10) {
            System.out.println("h" + num);
        } else {
            System.out.println("hello un" + num);
        }

        int score = 0;
        if (score == 0) {
            score += 50;
        }
        if (score != 0) {
            score += 50;
        }
        System.out.println(score);

        char grade = 'A';
        boolean passed = grade == 'A' || grade == 'B';
        boolean passed2 = grade == 'C' || grade == 'D';
        if (passed || passed2) {
            System.out.println("you passed");
        } else {
            System.out.println("you failed");
        }








    }


}
