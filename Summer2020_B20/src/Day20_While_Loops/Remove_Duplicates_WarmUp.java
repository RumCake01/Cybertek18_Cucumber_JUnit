package Day20_While_Loops;

public class Remove_Duplicates_WarmUp {
    public static void main(String[] args) {
/*
write a program that can remove the duplicates from any given
String
            Ex:
                input: abcabcaabb
                output: abc
 */


        String str = "aabb";
        String result = "";

        for(int i = 0; i <=str.length()-1; i ++){
            // to get characters from the string one by one below

           String s =  "" + str.charAt(i); // a, a, b, b

           if( ! result.contains(s) ) { // if the character already contained in the result,
               // the character  will not be added
               result +=s;
           }
        }

        System.out.println(result );



    }
}
