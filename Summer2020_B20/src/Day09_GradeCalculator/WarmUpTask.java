package Day09_GradeCalculator;

public class WarmUpTask {
    public static void main(String[] args) {
        // another same type example :

        double a = 500;
        double b = 200;
        double c= 1000;

        boolean aIsMax = a > b && a > c;
        boolean bIsMax = b > a && b > c;
        // also can do this way below:
        // aIsMax == false && b>c; // one way to declare the statement but more critical thnking approach
        boolean cIsMax = c > a && c > b;
        // we can also declare this way:
        // aIsMax == false && bIsMax == false
        // or this way: !aIsMax && !bIsMax same as -> !(aIsMax && bIsMax) - can use any of these statements

        double max = 0; // we want to assign the max number to car

        if(aIsMax){
            //System.out.println(a);
            max = a;
        }
        if(bIsMax) {
            //System.out.println(b);
            max = b;
        }
        if(cIsMax){ // if statements get executed only if the condtion is true.
            //System.out.println(c);
            max = c;
        }
        System.out.println(max + " is the max number");



    }


}
