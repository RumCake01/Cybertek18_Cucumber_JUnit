package Day17_Review_Of_String_Methods;

public class String_Methods2_All_Booleans {
    public static void main(String[] args) {



        String s1 = "Cat"; // memory location is in the string pool
        String s2 = new String ("Cat"); // memory location is in the heap
        String s3 = new String ("Cat");

        // equals
        System.out.println(s1==s2); // will return false, because we use  "=" operator
        System.out.println(s1.equals(s2));// true
        System.out.println(s2.equals(s3));// true
        System.out.println(s2==s3); // false

        String s4 = "java";
        String s5 = "Java";
        System.out.println(s4.equals(s5)); // false
        System.out.println(s3==s4);// false


        // equalsIgnpreCase = ignores case sensativity
        System.out.println(s4.equalsIgnoreCase(s5)); // this will return true because the case sensitivity is ignored

        String s6 = "MuHtAr";
        String s7 = "muhtar";
        System.out.println(s6.equalsIgnoreCase(s7)); // true
        System.out.println("=============");

        System.out.println(s6.equals(s7)); // false
        System.out.println("=============");

        // isEmpty method = checks is the length of String is zero, meaning the String is empty, returns true or false
        // checks if the length of the string is zero.
        String str = " ";
        System.out.println(str.isEmpty());// returns false
        System.out.println("=============");

        str = str.trim();
        System.out.println(str.isEmpty());// the Trim method removed all the empty spaces in the srt " ".
        System.out.println("=============");

        String str2 = "Cybertek";
        System.out.println(str2.isEmpty());// returns false
        System.out.println("=============");

        str2 = ""; // length == 0
        System.out.println(str2.isEmpty());
        System.out.println("=============");



        // contains method: is present in the sentence or not.


        String str3 = "Java, C#, Python, Ruby, C++";
        System.out.println(str3.contains("Java"));// true
        System.out.println("=============");
        System.out.println(str3.contains("java"));// false because of the spelling

       // if we want to ignore the case sensitivity: convert to lower case first, then search for content
        System.out.println(str3.toLowerCase().contains("java"));// true
        System.out.println("=============");

        String str4 = "ABCD";// verify if uppercase D is present in the string
        System.out.println(str4.contains("D"));
        System.out.println("=============");



        // startsWith & endsWith:

        String str5 = "Cybertek";
        System.out.println(str5.startsWith("C")); // returns true
        System.out.println("=============");
        System.out.println(str5.startsWith("CyBT")); //returns false
        System.out.println("=============");
        System.out.println(str5.startsWith("C") || (str5.startsWith("C"))); // returns true because one condition is true.
        System.out.println("=============");

        //endWith - ended with a given character or not.

        String str6 = "Today is a great day";
        System.out.println(str6.endsWith("day")); // returns true
        System.out.println("=============");
        System.out.println(str6.endsWith("great"));// false
        System.out.println("=============");



        String S1 = new String("GEEKS");
        String S2 = new String("GEEKS");
        System.out.println(S1==S2);
        System.out.println(S1.equals(S2));

        String t1 = new String ();
        String t2 = new String();
        System.out.println(t1.equals(t2));
        System.out.println(t1==t2);














    }
}
