package DAY15_String_All_Methods;

public class SubString_Method {
    public static void main(String[] args) {

        String sentence = "Java is fun";
        //                 012345678910
        // substring (beginning index, ending index)

        String word = sentence.substring(0,4);
        System.out.println(word);

        String word2 = sentence.substring(8, 11);
        System.out.println(word2);

        System.out.println("===============================================================");

        String sentence1 = "I like movies and tv series";
        String word3 = sentence1.substring(7, 14);
        System.out.println(word3);
        System.out.println("===============================================");


        String firstName = "MUHTAR";
        String firstCharacter = firstName.substring(0, 1);



        System.out.println(firstCharacter);
        String restOfCharacters = firstName.substring(1, firstName.length());
        System.out.println(restOfCharacters);
        firstName = firstCharacter.toUpperCase()+restOfCharacters.toLowerCase();
        System.out.println(firstName);

        System.out.println("==============================================================");

        String lastName = "school";
        String firstChar = lastName.substring(0,1);
        String remaining = lastName.substring(1);// by default, this will get all the remaining
        // characters till end of the sting "school"

        lastName= firstChar.toUpperCase() + remaining.toLowerCase();

        System.out.println(firstChar);
        System.out.println(remaining);
        System.out.println(lastName);

        System.out.println("=================================================================");

        String s = "I like Game Of Thrones";
        String series = s.substring(7);// just provide beginning index and then i will tag the rest of the string by default.
        System.out.println(series);

        String s2 = "I like Java Programming Language";
        String language = s2.substring(7);
        System.out.println(language);


    }
}
