package Day23_Arrays;
import java.util.Scanner;
public class Room_Reservatio_Nested_loop {
    public static void main(String[] args) {

        /*
        2. write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
            the program asks the user which bedroom does he/she wants to reserve and calculats the total price
            and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            while answer is neither yes or no ==> please re-enter

         */


        Scanner scan = new Scanner(System.in);
        int total =0;
        System.out.println("welcome to cybertek inn");


        // first lets give the user options:

        while(true){
        System.out.println("please choose from the following: ");
        System.out.println("option 1- Kind Bed: $120");
        System.out.println("option 2- Queen Bed: $100");
        System.out.println("option 3- Single Bed: $80");

        // get user input, whatever he selects has be printed

        int option = scan.nextInt();

        switch(option) {
            case 1: total += 120;break;

            case 2: total += 100;break;

            case 3: total += 80; break;
        }
            System.out.println("do u want to reserve another room");
            String a = scan.next().toLowerCase();

            while ( !(a.equals("yes") || a.equals("no")) ) { // while the answers are invalid, this below statements will repeat
                // use while loop here because
                // the user needs to select and check out// it will only stop if user's answer is valid

                System.out.println("Invalid, please re-enter");// below repeat the steps again so the user can re-enter the answer
                System.out.println("do u want to reserve another room");
                a=scan.next().toLowerCase();
            }

            if(a.equals("no")){
                break;
            }
        }
        System.out.println("Your total price is: $"+ total);
    }
}
