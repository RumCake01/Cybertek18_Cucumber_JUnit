package Day34_Wrapper_Class;
import java.util.Scanner;
public class Wrapper_Class_practice2 {

    public static void main(String[] args) {


        // this is a universal approach, it can be used whenever there's no Data Structure


        int a = Integer.MAX_VALUE; // MAX_VALUE ALREADY contains the max number for the int
        System.out.println(a);

        byte b = Byte.MAX_VALUE; // we can get the max value for byte by using this method
        System.out.println(b);


        int a2 = Integer.MIN_VALUE; // returns min negative number for integer
        System.out.println(a2);


        System.out.println("=====================================================");

        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE; // assign the max possible max value
        int min = Integer.MAX_VALUE;// assign the largest possible number the use can enter

        for(int i =1; i<=5; i++){
            System.out.println("enter a number");
            int n = scan.nextInt();

            if(n>max){
                max = n;
            }

            if(n<min){
                min = n;
            }
        }
        System.out.println("Max num: " + max + ",  min num: " + min);
    }
}
