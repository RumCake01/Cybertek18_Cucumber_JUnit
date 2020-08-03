package Day12_Switch_Scanner;

import java.util.Scanner;

public class Repl_045_VehicleYearEligibleOrNot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehicleYear = input.nextInt();

        //WRITE YOUR CODE HERE:

        boolean validForRecall = (vehicleYear >=1995 && vehicleYear >=1998) ||
                (vehicleYear>=2001 && vehicleYear<=2002) || (vehicleYear>=2004 && vehicleYear<=2006)
                || (vehicleYear>=2015 && vehicleYear<= 2017);
        boolean notValidForRecall = validForRecall !=validForRecall;
        String result = "";
        if(validForRecall){
            result = "Your vehicle needs to be recalled!";
        }else{
            result = "Your vehicle is fine, enjoy!";
        }


        System.out.println(result);


    }
}
