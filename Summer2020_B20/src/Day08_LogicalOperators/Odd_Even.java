package Day08_LogicalOperators;

public class Odd_Even {
    public static void main(String[] args) {

        int number = 101; //even number if it can be divided by 2 with remainder of zero
        boolean even = number % 2 == 0;
        boolean odd = !even;

        if (even){
            System.out.println(number + " is even number");
        }
        if (odd) {
            System.out.println(number + " is odd number");
            
        }





    }


}
