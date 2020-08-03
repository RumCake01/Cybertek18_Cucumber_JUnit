package Day22_Nested_Loop;

public class Nested_Loop3 {
    public static void main(String[] args) {


        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
        }
        System.out.println();


        // the same thing using while loop

        int j =1;
        while(j<=4){ // will print stars in vertical, respobsible for repeating the inner loop vertically
            for (int i = 1; i <= 7; i++) { // will print stars in one line in the inner loop, hirozontal amount of stars
                System.out.print("*");
            }
            System.out.println();
            j++;
        }
    }
}
