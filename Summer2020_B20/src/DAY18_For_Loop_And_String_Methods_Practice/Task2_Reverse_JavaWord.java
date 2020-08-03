package DAY18_For_Loop_And_String_Methods_Practice;

public class Task2_Reverse_JavaWord {
    public static void main(String[] args) {

     // create it using substring method
     //create it using charAt method

        String str = "Java";
        // avaJ ==> ava, J

        String s1 = str.substring(1); // will give us ava
        String s2 = str.substring(0,1);// will return J
        String result1 = s1+s2;
        System.out.println(result1);
        System.out.println("=====================================");

        // create the same thing with CharAt method

        char ch1 = str.charAt(0);
        String result2 = s1+s2;
        System.out.println(result2);




    }
}
