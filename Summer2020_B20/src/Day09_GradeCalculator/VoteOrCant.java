package Day09_GradeCalculator;

public class VoteOrCant {
    public static void main(String[] args) {

        int age = 35;
        boolean usCitizen = true;

        if(age >= 18 && usCitizen){
            System.out.println("eligible to vote.");
        }else{
            System.out.println("Not eligible to vote");
        }
    }

}
