package Warm_Up_Tasks;
import java.util.Scanner;

public class Student_Score_Scanner_And_Nested_If {
    public static void main(String[] args) {
        /*
        1. write a program that can calculate grades of the student based on the given score
                    90 <= score <= 100 ==> Excellent
                    80 <= score <= 89 ==> Great
                    70 <= score <= 79 ==> Good
                    60 <= score <= 69 ==> Passed
                    0 <= score <= 59 ==> Failed
                    other == > Invalid Entry
            MUST use Scanner and nested If
         */
        // nested if - used when we have a pre-condition.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the score");
        double score = scan.nextDouble();

        String result = "";

        if(score >=0 && score <=100){
            if(score >=90){
                result = "Excellent";
            }else if(score >=80){
                result = "Great";
            }else if(score >=70){
                result = "Good";
            }else if(score >=60){
                result = "Passed";
            }else{
                result = "Failed";
            }
        }else{
            result = "Invalid Entry";
        }
        System.out.println(result);
    }
}


