package Day25_Practices_Arrays_Loops_String;

public class Put_5_String_IntoArray_Use_Substring {
    public static void main(String[] args) {
        /*
        Write a program that will take five Strings and save them into an array called arr. and  Use for loop to print out the first three letter of each element of arr, one per line.
            You can assume that every element of arr is at least 3 letters long.
                Example: arr -> ["apple", "banana"]
                        prints:  appban
         */

        String[] words = {"Apple", "Banana", "Strawberry", "Java", "Python"};

        // we can either do it this way, or we can use a for loop below:

        System.out.println( words[0].substring(0, 3) );
        System.out.println( words[1].substring(0,3));
        System.out.println( words[2].substring(0,3));
        System.out.println( words[3].substring(0,3));
        System.out.println( words[4].substring(0,3));

        System.out.println("=================================================================================");
        // the same thing using the foor loop.


        for(int i = 0; i<=words.length-1; i++){
            System.out.println(words[i].substring(0,3));

        }
        System.out.println("=================================================================================");

        // the same task using FOR EACH loop

        for(String each : words){
            System.out.println(each.substring(0, 3));
        }

    }
}
