package Office_Hours.Practice_06_23;


public class If_Statement_PreDecrement_Comparison {
    public static void main(String[] args) {

        int number = 10;
        if(--number >10) {
            // predecrement decreases value right away
            // the value now is == 9>10 ==> false
            //so it jumps to the else block to print out.
            System.out.println("Hello Cybertek " + number);
        }else{
            System.out.println("hello world " + number);
        }

        }
    }
