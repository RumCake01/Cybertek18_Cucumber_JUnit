package Office_Hours.Practice_07_08_2020;
import java.util.Scanner;
public class Find_Min_and_Max_Number_For_Loop_While {
    public static void main(String[] args) {

        // find both min and max number using scanner
        Scanner scan = new Scanner(System.in);
        int min = 2147483647;// the biggest num that int variable can have
        int max =  -2147483648;// the smallest num have int variable can have

        for(int i = 0; i < 100 ; i++ ){

            System.out.println("Enter a number");
            int n = scan.nextInt();

            if( n < min ){
                min = n ;
            }

            if(n > max){
                max=n;
            }

        }

        System.out.println("min: "+min);
        System.out.println("max: "+max);


    }
}
