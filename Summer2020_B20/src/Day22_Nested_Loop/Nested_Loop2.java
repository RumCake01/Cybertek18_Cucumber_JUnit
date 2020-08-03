package Day22_Nested_Loop;

public class Nested_Loop2 {
    public static void main(String[] args) {

// these are steps we need to repeat 5 times:

        for(int j = 1; j <=5; j++){

            for (int i = 1; i <= 5; i++) { // this is the inner loop, and it will continue printing over and over again
            System.out.print(i + " ");
        }
        System.out.println();

        }
        System.out.println("==============================");


    }
}
