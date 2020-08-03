package Day03_sequences_Variables;

import java.sql.SQLOutput;

public class EscapeSequences {
    public static void main(String[] args) {

        System.out.println("\nHello Everyone\n" + "\nMy name is Cybertek");  // prints all in one line, \n this allows printing it from  anew line
        System.out.println("\n \t I am in Washington DC"); //  \t -  provides indent to the message
        System.out.println("\n\n\t\t\t I love programming");
        System.out.println("\n\\"); // prints one  back slash
        System.out.println("/"); // prints one front slash
        System.out.println("My name is \'Rumiya\'"); // 'Rumiya'
        System.out.println("My name is 'Rumiya"); // 'Rumiya'
        System.out.println("My favorite TV-series is \"Game Of Thrones\""); // prints in a double quote

    }
}
