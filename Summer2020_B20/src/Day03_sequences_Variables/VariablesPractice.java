package Day03_sequences_Variables;

public class VariablesPractice {

    public static void main(String[] args) {
        //100, 200
        byte num1 = 100;
        short num2 = 200;
        int sum = num1+num2;
        System.out.println(sum);

        long x = 100;
        float y = x; // floats can be long and prints result with a decimal y = 100.0
        float f1 = 100;
        float f = 100F;
        System.out.println(x); // will print 100
        System.out.println(y);// will print 100.0
        System.out.println((double) x);

    }
}
