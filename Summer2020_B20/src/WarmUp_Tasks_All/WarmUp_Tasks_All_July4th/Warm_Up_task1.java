package WarmUp_Tasks_All.WarmUp_Tasks_All_July4th;

public class Warm_Up_task1 {
    public static void main(String[] args) {
        /*
        Warmup tasks:
    1. Write a method which prints out the numbers from 1 to 50 but for
    numbers which are a multiple of both 3 and 5,
     print "FINRA" instead of the number,  for numbers which are a multiple of 3,
      print "FIN" instead of the number and for numbers which are a multiple of 5,
       print "RA" instead of the number.

    ex:
        output:
            1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN ....*/

        int a;
        for (a = 1; a <= 50; a++) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.print(" FINRA ");
            } else if (a % 3 == 0) {
                System.out.print(" FIN ");
            } else if (a % 5 == 0) {
                System.out.print(" RA ");
            } else {
                System.out.print(a + " ");

                // we  can also use declare it this this way:
                //for (a = 1; a <= 99; a+=2) { // which means that all odd number are added by two, 1, 3, 5

                // and we can declare it this way:
                //for (a = 1; a <= 100; a++) {
                   // if (a % 15 !=0) // which will check for both conditions a%3 and a%5 = or not to zero.


                // to find even numbers we can for loop this way;

                // for (a = 1; a <= 100; a+=2) // this will increase iterator by two every time.

            }
        }
    }
}