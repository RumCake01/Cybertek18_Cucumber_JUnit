package Day12_Switch_Scanner;
/*
write  a program that can find the number of days in  a month:
28 days: = 2
30 days = 4,6,9,11
31 days = 1, 3, 5, 7, 8, 10, 12
invalid = month >12 || months <1
 */
public class Month_By_Name {
    public static void main(String[] args) {

        int month = 11;
        String output = "";

        switch (month){

            case 2:
                output = "28 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                output = "30 days";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                output = "31 days";
                break;
            default:
                output= "invalid month";
        }
        System.out.println(output);

    }
}
