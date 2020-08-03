package Day13_Scanner;

public class Browsers {
    public static void main(String[] args) {
        /*write a program that can display the selected browser
                   1.1  declear a String variable called browserName
                    1.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
                    1.3. if the browser name does not match with the valid browsers' names,
                            out put should be: Invalid Browser Name
                Do Not use: scanner, if statement, and ternary */

        String browserName = "chrome";
        //boolean, long, double, float - are not accepted in the switch statements

        switch(browserName){
            case "chrome":
                System.out.println("opening chrome browser");
                break;
            case"firefox":
                System.out.println("opening firefox");
                break;
            case "opera":
                System.out.println("opening opera browser");
                break;
            case "safari":
                System.out.println("opening safari browser");
                break;
            case "edge":
                System.out.println("opening edge browser");
                break;
            default:
                System.out.println("Invalid browser name");
        }

    }
}
