package Day07_Unary_ShortHand;

public class Divisible_2_3_5 {
    public static void main(String[] args) {
        /* write a program that can check if a number is evenly divisible by 2, 3 ,5
         */

        int number = 199;
        boolean divisibleBy2 = number % 2 ==0;
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;
        System.out.println("\n" + number + " is divisible by 2: " + divisibleBy2 );
        System.out.println(number + " is divisible by 3: " + divisibleBy3 );
        System.out.println(number + " is divisible by 5: " + divisibleBy5 );




    }





}


