package Day10_IfStatements;

public class GradeCalculatorIfStatement {
    public static void main(String[] args) {

        int score = 56;

        String grade = "";

        if(score>= 90 && score <=100){// 90 <= score <= 100
            grade = "A";
        }else if(score >=80 && score <=89){
            grade = "B";
        }else if(score>=70 && score<=79){
            grade = "C";
        }else if(score>=60 && score<=69){
            grade = "D";
        }else{
            grade = " Fail";
        }
        System.out.println(" the students score is "  + grade);


    }
}
