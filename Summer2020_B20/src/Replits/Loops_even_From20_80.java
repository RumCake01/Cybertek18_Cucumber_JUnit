package Replits;

public class Loops_even_From20_80 {
    public static void main(String[] args) {
        /*
    Write a while loop that prints all the even integers
     from 80 through 20 inclusive, separated by spaces.
         */

        int num = 80;
        int until = 20;
        while(num>=until){
                System.out.print( num + ", ");
            num-=2;

        }
    }
}
