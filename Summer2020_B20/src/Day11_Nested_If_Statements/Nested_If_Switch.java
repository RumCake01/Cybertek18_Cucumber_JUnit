package Day11_Nested_If_Statements;

import org.w3c.dom.ls.LSOutput;

public class Nested_If_Switch {
    public static void main(String[] args) {

        int score = 40;
        String result = "";

        if (score >= 90 && score <= 100) { // valid score
            result = "A";
        } else if (score >= 80) {
            result = "B";
        } else if (score >= 70) {
            result = "C";
        } else if (score >= 60) {
            result = "D";
        } else if (score>=0 && score <= 59){
            result = "F";
        }else{
            result = "Invalid score";
        }
        System.out.println(result);

    }
}

