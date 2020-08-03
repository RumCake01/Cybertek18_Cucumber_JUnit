package Day19_For_Loop;

public class For_Loop_Continue_Statement_Numbers {

    public static void main(String[] args) {


        //print odd numbers between 1 to 50:


        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                continue; // if number is odd, then skip it, otherwise
                // this is printing equal numbers
            }
            System.out.print(i + " ");

            // now below print odd numbers
        }
        System.out.println("==================");
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) { // if the is even number then skip, it, otherwise print odd numbers
                continue; // this will print odd numbers
            }
            System.out.print(i + " ");
        }
    }
}
