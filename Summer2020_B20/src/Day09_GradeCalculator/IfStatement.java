package Day09_GradeCalculator;

public class IfStatement {
    public static void main(String[] args) {
        /*
        write a java program that can identify
        if a person is eligible to buy alcohol
         */
        boolean hasID = true;
        int age = 19;

        boolean eligible = hasID && age >= 21;

        String result = "";

        if(eligible == true){
            System.out.println("Eligible to buy alcohol");
        }
        if(eligible == false){
            System.out.println("No, go buy ur milk");
        }

        System.out.println(result);
    }

}
