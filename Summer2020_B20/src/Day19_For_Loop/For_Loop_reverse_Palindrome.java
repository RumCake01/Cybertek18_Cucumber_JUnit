package Day19_For_Loop;
import java.util.Scanner;
public class For_Loop_reverse_Palindrome {

    public static void main(String[] args) {

        // write a program that can do Palindrome: dad => dad; radar => radar


        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String anyWord = scan.nextLine();

        String reversedAnyWord = "";



        for(int i = anyWord.length()-1; i>=0; i --){
            // i - represents index numbers, every single character
            reversedAnyWord+=anyWord.charAt(i);// instead of charArt we can also use substring method below:

            // reseverAnyWord +=anyWord.substring(i, i + 1)// here must provide beginning and ending index., ending index is excluded.


        }
        System.out.println(reversedAnyWord);
        System.out.println(anyWord.equalsIgnoreCase(anyWord)); // will check if the word is Palindrome,
                                                            // the it will print true, otherwise will print false.








    }
}
