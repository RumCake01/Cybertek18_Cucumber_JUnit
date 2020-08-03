package Replits;
import java.util.Scanner;

import java.util.Arrays;

public class Zombie_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.

        int days = 0;
        System.out.println("Day" + days + " " + Arrays.toString(inhabitants));
        int sum = 0;

        // while everuthing if greater than zero we are executing evertying/
        // we are following the arrays that are given by the user
        //
        do {
            for (int index = 0; index < inhabitants.length; index++) {
                if (index < inhabitants.length - 1) {
                    if (inhabitants[index] != 0 && inhabitants[index + 1] == 0) {
                        inhabitants[index] = inhabitants[index] / 2;
                    }
                    if (inhabitants[index] == 0 && inhabitants[index + 1] != 0) {
                        inhabitants[index + 1] = inhabitants[index + 1] / 2;
                    }
                }
            }

            for (int zombie : inhabitants) {
                sum += zombie;
                days++;
                System.out.println("Day" + days + " " + Arrays.toString(inhabitants));
            }

        } while (sum> 0);
        System.out.println("EXTINCT!");
    }
}