package day21_Loops;

public class Do_While_Loop {
    public static void main(String[] args) {

        boolean result = false;

        while(result){
            System.out.println("Hello world"); // this will never get executed if condition is  false
        }
        System.out.println("==============================");



        do{ // just do it, executes the condition first , prints the statement
            // and then checks the condition
            System.out.println("Hello World");
        }while(result);


    }
}
