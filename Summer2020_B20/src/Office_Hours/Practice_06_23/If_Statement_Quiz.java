package Office_Hours.Practice_06_23;

public class If_Statement_Quiz {
    public static void main(String[] args) {

        int score = 0;
        if(score ==0){
            // current value of the score is zero, and we are
            //comparing it to zero again
            // the boolean returns = TRUE
            score += 50; // += automatically adds the value to the score
            // now this adds to the score zero, zero is now == 50
        }
        if(score !=0){ // means score doesnt equal to zero
            //score currently == 50
            //which means that score 50 doesn't equal to zero.
            // returns us true.
            score +=50; // this adds 50 to the existing score 50
            // the result here is 100.
        }
        System.out.println(score);

    }
}
