package Day22_Nested_Loop;
import java.util.Scanner;
public class Nested_Loop4 {
    public static void main(String[] args) {

        /*

      *
      **
      ***
      ****
      *****
      ******
      *******
*/


        // horizontal stars are decided by the outer loop

        for(int i = 1; i<=7; i++) { //

            for(int k = 1; k<=i; k++){// this will print 7 stars in the same line
                System.out.print("*");
            }
            System.out.println();// we need to give an empty sout always.
        }


        System.out.println("======================================================");

        /*

       *******
       ******
       *****
       ****
       ***
       **
       *
            */


        for(int b = 7; b >= 1; b--){ // the same thing just opposite
            // we start with the bottom biggest number, and then we reduce it by 1, b--

            for(int c = b; c>=1; c--){// c is responsible for printing the stars
                // it follows the same count of start as b, prints same number of * as b

                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println("============================");



            }

        }
