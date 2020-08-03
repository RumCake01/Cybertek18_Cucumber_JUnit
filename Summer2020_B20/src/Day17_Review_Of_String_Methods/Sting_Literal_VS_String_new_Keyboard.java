package Day17_Review_Of_String_Methods;

public class Sting_Literal_VS_String_new_Keyboard {
    public static void main(String[] args) {

        //String  = sequences of charcters. Object. Immutable.

            //object - 2 ways to store it:
        // 1. String literal: String str = "Cybertek"; = this goes to String pool for memory location
        // 2. String using New Keyword = String str = new String"Cybertek" = will be stored in the Heap memory.

        String s1 = "Cybertek";// string pool, s1 is sharing the same object with s2
        String s2 = "Cybertek"; // string pool, s2 is sharing the same object with s1
        String s3 = new String("Cybertek"); // will be a new object, stored in the heap memory.
        String s4 = new String("Cybertek");

        System.out.println(s1==s2);

        System.out.println(s1==s3);

        System.out.println(s3==s4);












    }

}
