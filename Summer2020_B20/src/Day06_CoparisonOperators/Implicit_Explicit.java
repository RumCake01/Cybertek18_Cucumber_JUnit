package Day06_CoparisonOperators;

public class Implicit_Explicit {

    public static void main(String[] args) {
        short s1 = 100;
        long l1 = s1; // we can assing s1 to long because of the implicit casting, its done automatically
        long l2 = (long)s1; // example of casting it manually, implicit casting

        int I1 = 300;
        double d1 = I1; // 300.0
        System.out.println(d1);

        // Explicit Casting Examples:

        double d2 = (double) I1; // casting is done manually again, its extra step
        System.out.println(d2);


        long L1 = 4400;
        short sh1 = (short) L1;// explicit casting is done manually.
        System.out.println(sh1);


        int n1 = 1000;
        byte b1 = (byte)n1; // make sure u can assign that data type, make sure their range can hold it.
                            // in this example, byte cant hold 1000, the result will be  24.
        System.out.println(b1);

        double m1 = 34.5;
        float f1 = (float) m1;// u can apply explicit casting because 34.5 is within the range of float
        System.out.println(f1);

        double m2 = 34.5;
        float f2 = (float) m2;// because assigned to float, the long will turn into decimal number instead of whole number
        System.out.println(f2);

        long r1 = -500;
        int p1 = (int)r1;// falls within a smaller range of primitive it is why it can perform explicit casting.
        System.out.println(p1);

        long r2 = 13;
        byte t1 = (byte) r2;// make sure 13 falls within a range of the primitive type.







    }
}
