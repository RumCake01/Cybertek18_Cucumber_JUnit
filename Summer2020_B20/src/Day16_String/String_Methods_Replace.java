package Day16_String;

import java.io.OutputStream;

public class String_Methods_Replace {
    public static void main(String[] args) {
        String email = "cybertek@gmail.com";// repace gmail with yahoo
        //lets call a replace method

        email  = email.replace("gmail", "yahoo");
        // we first indicate old value, then what we want to have as a new replacement

        System.out.println(email);
        System.out.println("==========================");

        // another example


        String word = "java";// lets replace letter a with letter e

        word = word.replace("a", "e");//replaces all a char with new e character

        // to reverse it to original

        word = word.replace("e", "a");// will replace all e with A char, hence return a string back to normal
        System.out.println(word);
        System.out.println("==========================");
        System.out.println(word);
        System.out.println("==========================");

        // another example

        String sentence = "I like to learn Java, Java is cool, Java is fun";
        sentence = sentence.replace("Java", "#"); // replaces all Java with C#
        // it will retunr a new string, but doesnt change the first string
        System.out.println(sentence);
        System.out.println("==========================");

        //if we want to replace 2nd java and 3rd Java, we can do it with some extra space below or last character of the word before the word we want to change
        String sentence1 = "I like to learn Java, Java is cool, Java is fun";
        sentence1 = sentence1.replace("a, Java", "a, C#");// use some uniques characters before the word the needs to be replacesd
        System.out.println(sentence1);
        System.out.println("==========================");

        String sentence2 = "I like to learn Java, Java is cool, Java is fun";
        sentence2 = sentence2.replace("to learn", "to know");
        System.out.println(sentence2);
        System.out.println("==========================");

        String s1 = "I like to stay in Cybertek, Cybertek is nice place";
        s1= s1.replace("Cybertek", "MIT");
        System.out.println(s1);
        System.out.println("==========================");

        String s2 = "I like to stay in Cybertek, Cybertek is nice place";
        s2= s2.replace("MIT", "Cybertek");
        System.out.println(s2);
        System.out.println("==========================");


        String s3 = "I like to leaRn Java, and we aRe woRking together";
        s3 = s3.replace("R", "r"); // replace "R" letter to lower case "r" letter, OR we can also indicate it as a char 'R' and 'r'.
        System.out.println(s3);
        System.out.println("==========================");

        String s4 = "I like to drink tea and tea";
        s4 = s4.replace("like", "prefer");
        System.out.println(s4);
        System.out.println("==========================");
        String s5 = "I like to drink tea and tea";
        s5=s5.replaceFirst("tea", "cola");// replacing first word Tea with Cola, first one Only
        System.out.println(s5);
        System.out.println("==========================");

        String s6 = "I like to watch Game of Thrones, and walking Dead";// we want to remove everthing after the come,
        s6= s6.replace(", and walking Dead", ".");// by giving an empty string "." at the end, we remove everything after coma
        System.out.println(s6);
        System.out.println("==========================");








    }
}
