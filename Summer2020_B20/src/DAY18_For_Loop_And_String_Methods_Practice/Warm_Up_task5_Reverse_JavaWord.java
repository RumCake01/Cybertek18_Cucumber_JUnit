package DAY18_For_Loop_And_String_Methods_Practice;

public class Warm_Up_task5_Reverse_JavaWord {
    public static void main(String[] args) {
      /*
       write a program that can reverse the following string:
                String str = "Java";
                output: avaJ
            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you MUST use charAt method
       */
        String str = "Java";
        //using charAt method
        System.out.println( "" + str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0));
        System.out.println("=============================================");
        //using substring
        System.out.println(str.substring(str.length()-3) + str.substring(0,1));



        String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1==s2 is:"+s1==s2);










    }
}
