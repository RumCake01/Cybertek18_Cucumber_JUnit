package Day17_Review_Of_String_Methods;

public class String_Methods_Practice {
    public static void main(String[] args) {

        // use charAt(index number) to get specific letter from the string
        // index number cant be less than ZERO., no negative numbers.

            String str  = "Cybertek";
            char ch1= str.charAt(1); // call the method charAt and provide the index number for the letter/character.
            System.out.println(ch1);
            char ch2= str.charAt(7); // call the method charAt and provide the index number for the letter/character.
            System.out.println(ch2);


            //  legnth  ==> will always return INT, so we can assign it to int

            String str2 = "Cybertek School";
            int l = str2.length();
            System.out.println("length is:" +l);

            //to get the last character from the string we can substract 1 from the length: length -1 .
             // last index = legnth-1
            char ch3 = str2.charAt(str2.length()-1);
            System.out.println(ch3);
            System.out.println("last index number:"+ (l-1));

            // UpperCase and LowerCase methods - will create a new String

            String str4 = "cybertek";
            str4 = str4.toUpperCase();// will return a new string, assign this to the existing variable.
            System.out.println(str4);

            // LOWER CASE
            String str5 = "JAVA";
            str = str.toLowerCase();// will return "java" assign this to the existing variable

        // Trim = will remove the spaces between a word from both sides.
            String str6 = "   Cybertek    ";
            System.out.println(str6);
        System.out.println("============================================");
            str6= str6.trim();// assign it to a variable str6, to create a new object, will remove all empty spaces
        // will not remove the spaces between two word, removes the space only for one wor from two sides as in example
        System.out.println(str6);



        // Substring Method = in any methods of string the ending index is always excluded, thus always give + 1

        // Substring: ENDING INDEX IS EXCLUDED, BEGINNING INDEX IS INCLUDED.

        String str7 = "I like Java Language";
        //             012345678910 // we want to get the word Java
        String word = str7.substring(7, 10 + 1);// assigned to a new variable because we want to keep the orginal sentence
        // result will be  Java
        System.out.println(str7); // will print out the entire str7 first sentence
        System.out.println(word); // will print out just the letters referenced in the word string.


        // to create the substring / to get the letters from certain index number till the end, we can use this:


        String word2 = str7.substring(12); // will print all letter starting from index 12 till the end.
        // we can also do it this way below, but line 59 is better, the above one,
        String word3 = str7.substring(12, str7.length()-1+1);// to include the last index in the new substring
        System.out.println(word2);
        System.out.println("============================================");
        System.out.println(word3);

        System.out.println("============================================");

        String word4 = str7.substring(2, 6);
        System.out.println(word4);
        System.out.println("============================================");


        // IndexOf & lastIndexOf = use to get a return index., returns only INT

        String str8 = "Hello Batch20, Have a Wonderful day, We are happy to see you";
        // to get a character/letter W - it seems to be the only W, it is unique
        // first call the indexOf (W), make sure to incude the same way, uppercase

        int l1 = str8.indexOf("Wo");// declare with INT variable
        System.out.println(l1);// will retunr the first W in the sentence
        System.out.println(str8.charAt(l1));
        System.out.println("============================================");

        // 3 ways to get the second W from the sentence above
        int l2 = str8.indexOf("We");// one way to get a second W from the sentence
        System.out.println(l2);
        int l3 = str8.indexOf(", W") + 2;// will also return us the second W from the sentence
        System.out.println(l3);
        int l4 = str8.indexOf("We are happy"); // wil also return the second W from the sentence


        // string lastIndexOf using it we can get the last J in the sentence below:
        String str9 = "Java Java Java ";
        int l5 = str9.lastIndexOf("J"); // will return index number for last J from the sentence
        int l6 = str9.indexOf("J");// will return us index number first J from the sentence

        int l7 = str9.indexOf(" Java ") +1;
        int l8 = str9.lastIndexOf("Java ");//

        System.out.println(l4);
        System.out.println("============================================");
        System.out.println(l5);
        System.out.println("============================================");
        System.out.println(l6);
        System.out.println("============================================");
        System.out.println(l7);
        System.out.println("============================================");
        System.out.println(l8);
        System.out.println("============================================");

        // Replace and ReplaceFirst method

        String s1 = "I like Java, Java is a programming language";
        s1 = s1.replace("Java","C#");// this will replace ALL THE JAva words in the sentence.
        System.out.println(s1);
        System.out.println("============================================");

        String s2 = "I like Java, Java is a programming language";
        s2 = s2.replaceFirst("Java","C#");// will replace the first java word in the sentence
        System.out.println(s2);
        System.out.println("============================================");

        String s3 = "I like Java, Java is a programming language";
        s3 = s3.replace("Java is","C# ");// will replace the SECOND java word in the sentence
        System.out.println(s3);
        System.out.println("============================================");


























    }
}
