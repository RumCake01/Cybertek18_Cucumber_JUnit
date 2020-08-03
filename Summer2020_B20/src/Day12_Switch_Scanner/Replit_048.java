package Day12_Switch_Scanner;


import java.util.Scanner;

public class Replit_048 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();

        boolean n1Bigger = n1 > n2 && n1 > n3;
        boolean n2Bigger = !n1Bigger && n2 > n3;
        boolean n3Bigger = !n1Bigger && n2Bigger;

        String result = "";

        if (n1Bigger) {
            result = "n1 is bigger";
        } else if (n2Bigger) {
            result = "n2 is bigger";
        } else {
            result = "n3 is bigger";
        }
        System.out.println(result);
    }
}
