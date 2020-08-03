package Day08_LogicalOperators;

public class IfStatements {

    public static void main(String[] args) {

        int a = 2000;
        int b = 2000;


        if (a > b) { // this is our condition, if its true, the message in the middle will get printed
            System.out.println(a + " is the maximum number");

            // if the statement in () is false - the SOUT statement will never get executed.

        }

        if (b > a) {// this is our boolen in paranthesis
            System.out.println(b + " is the maximum number");

            // if the statement in () is false - the SOUT statement will never get executed.
        }

        if (a == b) {
            System.out.println(" both are equal");
            // if the statement in () is false - the SOUT statement will never get executed.
        }

        System.out.println("======================================");

        boolean BreakTime = true;

        if(BreakTime == true){
            System.out.println("Take 15 min break!");

        }
        if(BreakTime == false) {
            System.out.println("Keep studying!");
        }

        System.out.println("======================================");

        boolean Corona = true;
        if(Corona == false);{// since the condition is false, the statements will not get printed.
            System.out.println("buy more toilet paper");
            System.out.println("stay at home");
            System.out.println("wash ur hands");
            System.out.println("stay at home");
        // STATEMENTS are not printed because the IF condition is FALSE.
        }


    }
}



