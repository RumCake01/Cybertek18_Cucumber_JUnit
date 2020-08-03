package Day12_Switch_Scanner;

public class Switch_Practice1 {
    public static void main(String[] args) {


        int num = 7;
        switch(num){


// we can also use String restuls = ""; to avoid sout statement every time.

            case 1:
                System.out.println("monday");
                // or by using a String we could say:
                // result = "Monday"
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default :
                System.out.println("invalid");
        }

// to print two days in a row we can skip one breaks
// and it will print the day without break and the following one.
    }
}
