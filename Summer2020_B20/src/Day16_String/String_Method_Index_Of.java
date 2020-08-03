package Day16_String;

public class String_Method_Index_Of {
    public static void main(String[] args) {
        
        
        String s5 = "I like to stay in cybertek, we are learning Java";// we have 3 lower case r letters 
        int r1 = s5.indexOf("r");// it will return the idex number of first r only...
        System.out.println(r1);
        System.out.println(s5.charAt(r1));// just to verify
        System.out.println("==========================");

        // to find a second r in the sentence, try to make it unique:

        int r2 = s5.indexOf("re");// giving the next letter of the r we want to get the index of, we can use some unique identifier
        System.out.println(r2);// will return the second r2
        System.out.println("==========================");

        int r3 = s5.indexOf("rn");// will return the index number of third R in the statement
        System.out.println(r3);
        System.out.println("==========================");

// remember: index number start counting from ZERO
// anyting u specify within the "" it will return the index of that first letter u specify in the ""
// EX: "tay in cyb"  - will return index of T letter only
// EX: "ing Java"  - will return index number of I only


        String s6 = "Java is a programming language, and java is fun";
        int I1 = s6.indexOf("J");
        System.out.println(I1);
        System.out.println("==========================");

        //Call Last Index Of = call last occured of, starts from the end
        String s7 = "Java is a programming language, and java is fun";
        int I2 = s7.lastIndexOf("J");
        System.out.println(I2);
        System.out.println("==========================");

        // get the next character by adding + 1
        String s8 = "Java is a programming language, and java is fun";
        int I3 = s8.lastIndexOf("J" + 1);// will get us the next character after J starting from the end
        System.out.println(I3);
        System.out.println("==========================");

        // get the index number by placing uniqie part of the sentence
        String s9 = "Java is a programming language, and java is fun";
        int I4 = s9.lastIndexOf("java is f");// will return Second J index
        System.out.println(I4);
        System.out.println("==========================");

        String s10 = "Java";
        int a1 = s10.indexOf("A");// will return us -1 , because index of "A" doesn't exist, it doestn match any As in the string.
        System.out.println("==========================");





    }
}
