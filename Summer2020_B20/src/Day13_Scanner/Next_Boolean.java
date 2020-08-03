package Day13_Scanner;

import java.util.Scanner;

public class Next_Boolean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your car has 4 doors");
        boolean yourCar = input.nextBoolean();
        System.out.println(yourCar);
    }
}
