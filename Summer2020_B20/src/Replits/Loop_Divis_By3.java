package Replits;

public class Loop_Divis_By3 {
    public static void main(String[] args) {

        /*
        Write for and while loops so that they print those numbers between
         1 and 20 and divisible by 3.
Expected Output:  3 6 9 12 15 18
         */

        /*for (int i = 1; i <= 20; i++) {
            while (i % 3 == 0) {
                System.out.print(i + " ");
                i++;
         */

        for(int i=1; i <=20; i+=1){
            while(i%3==0){
                System.out.println(i + " ");
                i++;
            }
        }

    }
}