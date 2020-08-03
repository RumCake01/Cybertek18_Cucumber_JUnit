package DAY15_String_All_Methods;

public class String_intro {
    public static void main(String[] args) {


        String name = "Cybertek";
        String name2 = new String("Cybertek");

        String s1 = "cat";// string literal
        String s2 = "cat"; // string literal, since they are the same they will be stored in the object
            // in String pool because it cant store duplications. So there will be just one object storing them in the String pool

        System.out.println(s1 == s2);

        String d1 = "Dog";// these are identical, these two string willbe stored in one object and stored in String pool.
        String d2 = "Dog"; // the same thing, one Object will be storing them in the String pool memory of java.
        System.out.println(d1==d2);

        System.out.println("==========================================");

        String st1 = new String("tiger");// this will return false. new object will be created in the JAva heap memory.
        String st2 = new String("tiger");// this wil return false. new object will be created in the JAva heap memory.
        System.out.println(st1 == st2);// will return false because these are not identical.

        String c1 = new String("Rumik");// this object is created in the Java Heap memory.
        String c2 = "Rumik"; // this object will be created in the string pool.
        String c3 = new String("Rumik");
        String c4 = "Rumik";// will be TRue because it will be stored in the same object as String c2, in the String pool
        String c5 = "rumik";// this will be a new object and stored in the String Pool

        System.out.println(c1==c2);// false, two different objects
        System.out.println(c1==c3);//false, two different objects
        System.out.println(c2==c2);// true, will be both stored in obe object in String Pool
        System.out.println(c4==c5);

        System.out.println("====================================================");

        //STRING IMMUTABLE

        String abc = "Java";// once object is created we cant delete, one java object in the string pool
        abc = "Javascript";// here we just reassigned it, so result will be  Javascript
        System.out.println(abc);



    }

}
