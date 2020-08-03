package Day29_Custom_Methods;

public class Return_keyboard_intro {

    // calculate the students grade based on the score
    public static void main(String[] args) {

        grade(-100);
        System.out.println();


        System.out.println("==================");

        eligibleToBuy(17);
    }

    public static void grade(int score) {
        if(score <0 || score>100){// pre-condition to make sure the numbers enter are valid
            System.out.println("invalid score");
            return; // if activated, it will exit the method grade right away
        }

        char grade = (score>=90 )? 'A' : (score>=80)? 'B'
                : (score>=70) ? 'C' : (score>=60) ? 'D' : 'F' ;
        System.out.println("grade is: " + grade);
        System.out.println("========================================================");
    }

    public static void eligibleToBuy (int age){

        if(age<21){
            System.out.println("not eligible");
            return;
        }
        System.out.println("ur eligible to buy");
    }



}
