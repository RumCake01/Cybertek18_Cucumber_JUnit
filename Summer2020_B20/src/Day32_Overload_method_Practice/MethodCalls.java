package Day32_Overload_method_Practice;
import Library.Util;
public class MethodCalls {

    public static void main(String[] args) {

        String first = "RumCake";
        String last = "hasnu";

        String result;

        result = Util.formatFullName(first, last);
        System.out.println(result);

        System.out.println(Util.reverse(result));

    }
}
