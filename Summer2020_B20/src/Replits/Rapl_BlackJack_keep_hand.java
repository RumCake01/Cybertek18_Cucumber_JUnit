package Replits;
import java.util.Scanner;
public class Rapl_BlackJack_keep_hand {
    public static void main(String[] args) {






        Scanner s = new Scanner(System.in);
        int house = s.nextInt();
        int player = s.nextInt();
        String output ="";

        if(player==21 && house==8) {
            output = "bust";
        }else if(player<house) {
            output = "player loss";
        }else if(player==house) {
            output = "tie";
        }else if(player>house){
              output = "player wins";
        }
        System.out.println(output);
    }
}
