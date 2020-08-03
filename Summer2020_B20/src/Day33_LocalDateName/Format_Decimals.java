package Day33_LocalDateName;

import java.text.DecimalFormat;

public class Format_Decimals {

    //first use class names decimalFormat, named df
    //once declared, we need to give a pattern, give it as a String

    public static void main(String[] args) {


        DecimalFormat df = new DecimalFormat("0.000");//
        // depending on the number or of zero we indicate in the patter,
        // that wll be the outcome after coma in the console

        double a = 22 / 7.0;
        System.out.println(a);

        System.out.println(df.format(a)); // outcome 3.14

    }

}
