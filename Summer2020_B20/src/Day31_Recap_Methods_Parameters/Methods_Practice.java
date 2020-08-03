package Day31_Recap_Methods_Parameters;

public class Methods_Practice {

    // identify the max number between two numbers
    public static void main(String[] args) {

       int a  =  biggerNumber(10,77);
        System.out.println(biggerNumber(10, 77));
        System.out.println(biggerNumber(10, 77) *77);
    }

    public static int biggerNumber(int a, int b){

        return (a>b) ? a :  b;


    }
}
