package Day33_LocalDateName;

import java.time.LocalDate;
import java.util.Arrays;

public class Practice_Arrays_5_In_One {

    public static void main(String[] args) {

        // create an array of String and store 5 of ur classmates names

        String [] studentNames = {"RumCake", "Stani", "Cristina", "John", "Mike"};
        LocalDate[] birthDays  = {
                                    LocalDate.of(1982, 12, 26),
                                    LocalDate.of(1993, 11, 25),
                                    LocalDate.of(1982, 12, 23),
                                    LocalDate.of(1956, 11, 28),
                                    LocalDate.of(1990, 7, 9)};
        for(int i = 0; i<=studentNames.length-1; i++){

            System.out.println(studentNames[i] + " : "+ birthDays[i] + "  ") ;
        }
        System.out.println("===========================================");


        // print only bday using for each loop
        for (LocalDate each :  birthDays){ // will print out birthday's only
            System.out.println(each);
        }

    }
}

