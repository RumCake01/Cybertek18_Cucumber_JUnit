package Day09_GradeCalculator;

public class Minumum {

    public static void main(String[] args) {

        double a = 100;
        double b = 200;
        double c = 300;
        boolean aIsMin = a < b && a < c;
        boolean bIsMin = b < a && b < c;
        boolean cIsMin = c < a && c < b;
        // we creared these conditions to identify the minimum one

        double min = 0;
        if (aIsMin){
            min = a;
        }
        if (bIsMin){
            min = b;
        }
        if(cIsMin){
            min = c;
        }


    }
}
