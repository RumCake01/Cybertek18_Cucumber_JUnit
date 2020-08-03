package Day11_Nested_If_Statements;

public class Number_To_Words {
    public static void main(String[] args) {
        /*
        Write a program that can convert numbers between 0-9 to words, if the number is greater or less than zero. results is invalid.
         */
        int num = 10;
        String result = "";

        if (num == 0) {
            result = "zero";
        } else if (num == 1) {
            result = "one";
        } else if (num == 2) {
        result = "two";
        } else if (num == 3){
            result = "three";
        } else if (num == 4) {
            result = "four";
        } else if (num == 5) {
            result = "five";
        }else if (num == 6) {
            result = "six";
        }else if (num == 7) {
            result = "seven";
        }else if (num == 8) {
            result = "eight";
        }else if (num == 9) {
            result = "nine";
        }else{
            result = "invalid";
        }
        System.out.println(result);








    }
}
