package Day34_Wrapper_Class;

import javax.swing.plaf.IconUIResource;

public class Wrapper_Class_Methods {

    public static void main(String[] args) {



        // method .parse method returns primitive


        String str = "123";

         int a = Integer.parseInt(str);
        System.out.println(str + 1); // is a string
        System.out.println(a + 1); // by adding one we can verify which one is a string and which one is adds a number

        Double d1 = Double.parseDouble("7.5");

        System.out.println(d1-1);

        String s1 = "true";
        boolean b1 =  Boolean.parseBoolean(s1);
        System.out.println(!b1); // by applying logical operator ! we can verify if its boolean or not, can be applied to boolean


        System.out.println("===========================================================");



        // the valueOf method returns us a wrapper class value



        String s2 = "100000.5";
        double dob1 = Double.valueOf(s2); // unboxing
        System.out.println(dob1*2);// to check if its a primitive or a string

        String s3 = "FalSE";
        boolean boul1 = Boolean.valueOf(s3);  // unboxing
        System.out.println(boul1);

    }
}
