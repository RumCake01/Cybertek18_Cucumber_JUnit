package Day16_String;

public class String_Method_StartsWith {

    public static void main(String[] args) {

        String s1 = "Muhtar";//
        System.out.println(s1.startsWith("M"));// will return true
        System.out.println("==============================================================");
        System.out.println(s1.startsWith("j"));// will return false
        System.out.println("==============================================================");

        // we can also ask for more than 1 character

        System.out.println(s1.startsWith("Mu"));// going to check if first characters are equal in the string to what we need
        System.out.println("==============================================================");

        System.out.println(s1.toLowerCase().contains("mu"));// first will return lowerCase,
        // then will check if the string contains what we are looking for

        System.out.println("==============================================================");




    }
}
