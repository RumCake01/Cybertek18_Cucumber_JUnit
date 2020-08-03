package Office_Hours.Practice_06_17_2020;

public class LogicalOparetors {
    public static void main(String[] args) {
        boolean r1 = !true != true;
            //  false !=(doesnt equal) true
        //      false !=false == true
        System.out.println(r1);
        boolean r2 = !r1;
        System.out.println(r2);
        System.out.println(!!!!! false);// since its the odd number of !! it will return true
        System.out.println(!!!!!! true); // even numbers of !! return true
        System.out.println("===========================");

        boolean result1 = 9 > 10 || "Java" == "Java";
                //    false       ||   true// result is true.
        boolean result2  = 9>10 || "Java" == "Java" || 'A' == 'a';
            // false || true || false // results is true

        // &&

        boolean result3 = "java"!="Python" && "Muhtar" == "Good guy";
                // true    &&   false








    }
}
