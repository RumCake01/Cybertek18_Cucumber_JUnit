package Day29_Custom_Methods;
import java.util.Scanner;

public class Check_eligibilityTo_Vote_Using_Methods {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your age");
        int age = scan.nextInt();
        System.out.println("enter your age");

    }



    public static void checkEligibilityToVote(String name, int age,  boolean citizenship){

        if( age >=18 ){
            System.out.println("Go Vote");
        } else{
            System.out.println("come back when eligible");
        }
        System.out.println();

    }
}

// FINISH THIS CLAS
