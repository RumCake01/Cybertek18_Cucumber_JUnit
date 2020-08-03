package Day08_LogicalOperators;

public class Triangle {
    public static void main(String[] args) {

        double angle1 = 100;
        double angle2 = 60;
        double angle3 = 20;
// if the some of all three var = 180 the it prints Valid Triangle

        boolean valid = angle1 + angle2 + angle3 == 180;
        boolean inValid = !valid;

        if(valid) {
            System.out.println("Valid Triangle");

        }
        if(inValid) {
            System.out.println("Invalid Triangle");

        }

















    }


}
