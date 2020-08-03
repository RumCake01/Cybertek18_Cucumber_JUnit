package Day05_ArithmeticsOperations;

import java.sql.SQLOutput;

public class EmployeeInfo {

    public static void main(String[] args) {

        String firstName = "John";
        String lastName = "Daniel";
        int age = 128;
        String companyName = "CapitalOne";
        char gender = 'M';
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 120_000.50;

        System.out.println("\nEmployee full  name is: " + firstName+" " + lastName );
        System.out.println( firstName+ " "+ lastName+"' gender is: "+ gender );
        System.out.println( firstName+ " "+ lastName+"'age is: " + age+" years old" );
        System.out.println( firstName+ " " + lastName +" works at: " + companyName );
        System.out.println( firstName+ " " + lastName+ "' job title is: " + jobTitle );
        System.out.println( firstName+ " " + lastName+ "' salary is: $" + salary );
        System.out.println( firstName+ " " + lastName+ " is full time employee: " + isFullTime );
        System.out.println(firstName+ " " + lastName+ " is married: " + isMarried );



    }


}
