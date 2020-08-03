package DAY15_String_All_Methods;

public class Legth_Method {
    public static void main(String[] args) {

        //legth () = returns number in int, always


        String name = "Cybertek";// it has 8 letters, the result is 8.
        int l = name.length();
        System.out.println(l);

        String name2 = "Rumiya Hasnutdinova";
        int l2 = name2.length();
        System.out.println(l2);

        // find the last index number:


        // to get the last index number is equal to the length of the string minus 1.
        int lastIndexNumber = name.length()-1;
        System.out.println(lastIndexNumber);

        // to get last Character from the String

        int lastCharacter = name.charAt(lastIndexNumber);
        System.out.println(lastCharacter);









    }
}
