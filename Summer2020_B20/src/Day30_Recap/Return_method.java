package Day30_Recap;

public class Return_method {
    public static void main(String[] args) {

        addition1(3, 4);

        int sum = addition2(100, 20);
        System.out.println(sum);

        System.out.println(addition2(3, 4)  * 2);


    }

    public static void addition1(int a, int b){ // this method will not return any value, it can only print it out.
        int sum = a+b;
        System.out.println(sum);
    }

    public static int addition2( int a, int b){
        int sum = a+b;

        return sum;


// in order to have a return value, we cant use void. if the method doesnt return any value, we cant assign it to a variable

    }
}
