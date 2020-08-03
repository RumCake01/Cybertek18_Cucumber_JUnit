package Day29_Custom_Methods;

public class Method_practice1 {
    public static void main(String[] args) {

        // print all the odd numbers between 1-100 all in one line
        // print all the even numbers between 1=100 all in one line

        printOddNumbers();
        System.out.println("Hello");
        printEvenNumbers();
        System.out.println("hello");



    }



    public static void printOddNumbers() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    public static void printEvenNumbers(){

        for(int i = 2;  i<=100; i+=2){
            System.out.print(i + "  ");
        }
        System.out.println();
    }


}
