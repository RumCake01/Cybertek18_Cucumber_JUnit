package Replits;

public class Repl_150_PrintOut_rectangular {

    public static void main(String[] args) {

        printHollowRect();
    }


    public static void printHollowRect() {
        for (int i = 0; i <= 5; i++) {
            for (int a = 0; a <= 5; a++) {
                if (i == 0) {
                    System.out.println("*");
                }
                if (a == 0)
                    System.out.println(" ");
            }
        }
    }
}
