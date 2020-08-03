package Replits;
import java.util.Scanner;
public class Repl_Loop_Calculator {
    public static void main(String[] args) {
        /*
calculate the multiplied sum of all the numbers up to the n variable.

for example:

n=2

sum = 1*2 = 2

n=3

sum = 1*2*3 = 6

n = 5
 sum = 1*2*3*4*5 = 120

hint: use a loop, and set sum and i (loop iterator) to one at the start
         */

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;

        for (int i = 1; i <=n; i++) {
            sum +=n;
        }
            System.out.println(sum*n);


    }
}