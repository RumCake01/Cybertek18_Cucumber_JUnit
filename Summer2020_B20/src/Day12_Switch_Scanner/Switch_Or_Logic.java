package Day12_Switch_Scanner;

public class Switch_Or_Logic {
    public static void main(String[] args) {

        String productName = "iphone";

        switch(productName){

            case "galaxy":
                System.out.println("Samsung");
                break;
            case "iphone": // doing it this way allows to use like || OR logic.
            case "ipad": // if either one of those names listed, then the print statement will "Apple"
            case "mackbook":
                System.out.println("Apple");
                break;









        }






    }
}
