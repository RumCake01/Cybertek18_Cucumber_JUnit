package WarmUp_Tasks_All.WarmUp_Tasks_All_July4th;

public class For_loop_Characters_A_to_Z {
    public static void main(String[] args) {

        //write a program that can print out all letter in english alphabet in ascending order:

        // write a program that will print out all the letters in eglish alphabet in discending order


        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " "); // " " for spacing
        }
        // we can also declare it this way:
        for (int i = 97; i <= 122; i++)// this will print letters from Aski table order by their given number
            // char ch = (ch) i;
            System.out.print((char) i + " "); //  " " for spacing

        System.out.println("====================================================");

        // Task 2. print it in discending order, backwards

        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.print(ch + " ");
        }
        System.out.println();

        for (int i = 90; i >= 65; i -= 2) {
            System.out.print((char) i + " ");
        }

        // this below will print out all 65K charcters that exist in the world.

        // for (int i = 0; i <=65000; i+=2){
        //System.out.println((char) i + " ");
    }
}
