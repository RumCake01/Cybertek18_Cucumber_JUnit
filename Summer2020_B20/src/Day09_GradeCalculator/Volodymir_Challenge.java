package Day09_GradeCalculator;
import java.util.Scanner;

public class Volodymir_Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("" +
                "        WELCOME TO  ");
        System.out.println(
                "╔═══╗╔══╗╔═╗─╔╗╔═══╗╔═══╗╔═══╗\n" +
                        "║╔═╗║╚╣─╝║║╚╗║║╚╗╔╗║║╔══╝║╔═╗║\n" +
                        "║╚═╝║─║║─║╔╗╚╝║─║║║║║╚══╗║╚═╝║\n" +
                        "║╔══╝─║║─║║╚╗║║─║║║║║╔══╝║╔╗╔╝\n" +
                        "║║───╔╣─╗║║─║║║╔╝╚╝║║╚══╗║║║╚╗\n" +
                        "╚╝───╚══╝╚╝─╚═╝╚═══╝╚═══╝╚╝╚═╝");
        System.out.println("" +
                "       NEW DATING APP");
        System.out.print("to continue pls press ENTER");
        String nextStep = scanner.nextLine();
        System.out.print("Lets start with your  age(years): ");
        int age = scanner.nextInt();
        System.out.print("What about hight(inches): ");
        int hight = scanner.nextInt();
        System.out.print("What about your weight(lb): ");
        int weight = scanner.nextInt();
        System.out.print("Gender preference (pls type 1 for male, 2 for female and 3 for else): ");
        int gender = scanner.nextInt();
        System.out.print("Are you smoking?( pls type 1 for yes and 2 for no) ");
        int smokig = scanner.nextInt();
        System.out.println("SYSTEM MACH PROCCESING...");
        System.out.println("LOOKS LIKE U GOT INCOMING MESSAGE.\n \n");
        if (age < 6 || age > 90) {
            System.out.println("Unfortunately you are not eligible to date((((");
        }
        if (gender == 1) {
            System.out.print("Hi my name is Nick");
        }
        if (gender == 2) {
            System.out.print("Hi my name is Hannah");
        }
        if (gender == 3) {
            System.out.print("Hi my name is Alex ");
        }
        if (age > 7 && age < 30) {
            System.out.print(" im 24 ");
        }
        if (age >= 30 && age < 45) {
            System.out.print(" im 30");
        }
        if (age >= 45 && age < 89) {
            System.out.print(" im 46");
        }
        if (hight > 12 && hight < 50) {
            System.out.print(" Im pretty short only 5ft 2in ");
        }
        if (hight >= 50 && hight < 70) {
            System.out.print(" Im not too tall, about 5f 6in  ");
        }
        if (hight > 71 && hight < 200) {
            System.out.print(" Im pretty tall, about 6ft 4in ");
        }
        if (weight >= 60 && weight < 100) {
            System.out.println("and super fit.  ");
        }
        if (weight > 100 && weight < 150) {
            System.out.println("with normal body structure");
        }
        if (weight > 150 && weight < 10000) {
            System.out.println("with some extra weigh");
        }
        if (smokig == 2) {
            System.out.print(" Aslo i'm not smoking.");
        }
        if (smokig == 1) {
            System.out.print(" Aslo i'm a heavy smoker. ");
        }
        System.out.println(" Would love to hang out with you . Pls call or text me @747-123-4567");
    }
}