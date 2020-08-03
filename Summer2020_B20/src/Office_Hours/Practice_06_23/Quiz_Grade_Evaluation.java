package Office_Hours.Practice_06_23;

public class Quiz_Grade_Evaluation {
    public static void main(String[] args) {

        char grade = 'A';
        boolean passed = grade == 'A' || grade == 'B';
                        //'A'  == 'A'
                        // returns true
        boolean passed2 = grade == 'C' || grade == 'D';
            // 'A' == 'C' || 'A' == 'D'
            // returns False

        if (passed || passed2){
            // true || false ==> returns TRUE
        }else{
        }
        System.out.println("you failed");

    }
}
