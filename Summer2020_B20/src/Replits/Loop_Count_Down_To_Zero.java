package Replits;
import java.util.Scanner;
public class Loop_Count_Down_To_Zero {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        for (a = 100; a >= 0; a--) {
            System.out.print(a + "\n");
        }
        for (int b = 0; b <= 66; b+=2){
            if(b%2==0){
                System.out.println("even numbers" + b);
            }
        }
    }
}
