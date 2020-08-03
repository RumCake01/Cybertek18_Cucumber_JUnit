package DAY15_String_All_Methods;

public class Trim_Method {
    public static void main(String[] args) {


        String p = "   Cybertek School    ";// these spaces are unused spaced.

        // to remove the spaces we can use the TRIM method, doesnt remove space between words in the middle.
        p = p.trim();
        System.out.println(p);
    }
}
