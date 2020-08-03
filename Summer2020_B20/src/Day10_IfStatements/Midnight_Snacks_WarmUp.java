package Day10_IfStatements;

public class Midnight_Snacks_WarmUp {
    public static void main(String[] args) {

        /*1. write a program that can find the number of days in a month
                (Assume that Feb has 28 days)*/

        int month = 1;
        boolean february = month == 2;
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;
        //boolean days31 = month == 1 || month == 3 || month == 5 || month == 6 || month == 7 || month == 8 || month == 12;
        // could also just boolean for invalid EX:
        boolean invalid = month <1 || month >12;

        String output = "";

        if (february) {
            output = " 28 days";
        } else if (days30) {
            output = "30 Days";
        } else if (invalid) {
            output ="Invalid Month";
        } else {
            output = "31 days";
        }
        System.out.println(output);


/*
write a program that can check the equality of the three given numbers*/


        int n1 = 120;
        int n2 = 110;
        int n3 = 110;

        boolean outcome1 = n1 == n2 && n1 != n3;
        boolean outcome2 = n2 == n3 & n2 != n1;
        boolean outcome3 = n3 == n1 && n3 != n2;
        boolean outcome4 = n1 == n2 && n3 == n2;


        String result = "";

        if (outcome1) {
            result = " n1 & n2 are equal";
        } else if (outcome2) {
            result = " n2 & n3 are equal";
        } else if (outcome3) {
            result = ("n3 & n1 are equal");
        }else if(outcome4){
            result = (" all are equal");
        }else{
            result = "Invalid";
        }
        System.out.println(result);















    }
}
