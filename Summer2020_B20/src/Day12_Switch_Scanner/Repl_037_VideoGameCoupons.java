package Day12_Switch_Scanner;

import java.util.Scanner;

public class Repl_037_VideoGameCoupons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of coupons");
        int coupons = input.nextInt();
        String output = "";
        String result2 = "";


        if(coupons>=10) {
            output = "Number of Candies: "+ coupons/10;
            result2 = "Number of Gumballs: "+ coupons%10/3;
        }else if (coupons <10 && coupons>=3){
            output = "Number of Candies: 0";
            result2 = "Number of Gumballs: "+ coupons/3;
        }else{
            output = "Not enough coupons";
        }
        System.out.println(output);







    }
}
