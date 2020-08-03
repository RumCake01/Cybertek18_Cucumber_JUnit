package Day30_Recap;

public class Return_methods2 {

    public static void main(String[] args) {

        String name = "level";

        //revStr1(name); doesn't return value when used with void
       //  System.out.println(); // doesn't return value when used with void

       String reversedName =  revStr1(name);
        System.out.println(name.equalsIgnoreCase(name)); // to compare strings we need to use equals method


    }

    public static String revStr1(String str) {
        String result = ""; // with void  this value will only be printed, theres not return value out of this method

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;

    }
}
