package Replits;
import java.util.Scanner;
public class For_Loop_Vowels {
    public static void main(String[] args) {

/*
Inputs:
String word;
Write a for loop that will loop through every letter of the input and print out just the vowels. Sample input/outputs
In: howdyho
oo
In: huehuehuehue
ueueueue
In: poopoo what idk what im doing
ooooaiaioi
 */

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        for(int i = 0; i<word.length(); i++) {
            char ch = word.charAt(i);
            if (ch =='a'|| ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i'){
                System.out.println(ch);
            }
        }
    }
}
