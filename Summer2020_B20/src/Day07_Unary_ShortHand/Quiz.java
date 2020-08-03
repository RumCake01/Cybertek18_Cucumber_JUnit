package Day07_Unary_ShortHand;

public class Quiz {
    public static void main(String[] args) {

        int iNum = 100;
        double dNum = 200;
        float fNum = 300;

        //iNum = fNum; cant assign larger primitive to smaller one, unless CASting is used.

         fNum = iNum; // int can be assigned to a float number
         dNum = fNum; // float can be assignmed to double
        //fNum = dNum; // cant be assigned directly b/c double is bigger than float, it needs casting.

        dNum = iNum; // can be assingned, implicit castig done automatically
       // iNum = dnum; // cant be assignmed directly, needs casting

        System.out.println("\n Result A" + 0 + 1  );
                            // result: String 01
        System.out.println("Result A" + 1 + 2 ); // result string A12
        System.out.println("Result B" + (1) + 2 ); // result B12




    }

}
