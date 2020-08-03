package Day16_String;

public class String_Method_Equals {
    public static void main(String[] args) {

        String str3 = new String("java");
        String str4 = new String("java");
        System.out.println(str3.equals(str4));// will return true
        System.out.println("===============================================");
        // do not use + plus operator when comparing text string.


        String str5 = "Java";// same exact text, thus will be only one object for these strings
        String str6 = "Java";

        System.out.println(str5 == str6);// retunrs true, but we shouldnt use it, use onlu equals method
        System.out.println("===============================================");
        System.out.println(str5.equals(str6));// returns true
        System.out.println("===============================================");
        
        
        String str7 = "JAVA";
        String str8 = "java";
        System.out.println(str7.equals(str8));// result will be false, always use .equals operator
        System.out.println("===============================================");




    }
}
