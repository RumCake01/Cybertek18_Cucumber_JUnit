package WarmUp_Tasks_All.WarmUp_Tasks_All_July4th;

public class Warm_Up_Task6 {
    public static void main(String[] args) {
        /*write a program that can calculate the sum of all the odd numbers between 1 ~ 100*/


        int a;
        int sum=0;
        for (a = 1; a <=100; a ++){ // we  can also put it this way: a = 1; a<=99; a+=2;
            if(a%2!=0){
                sum+=a;
            }
        }
        System.out.println("\nthe sum of odd numbers between 1 to 100 is " + sum + "\n");
    }
}
