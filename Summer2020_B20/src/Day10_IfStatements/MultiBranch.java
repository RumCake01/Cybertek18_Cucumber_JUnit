package Day10_IfStatements;

public class MultiBranch {
    public static void main(String[] args) {
        int number = -100;

        //// try to always use it this way:

        if (number>0){
            System.out.println( number + " is positive");
        }else if (number<0){// use else if if there are more possibilities left.
            System.out.println(number + " is negative");
        }else{ // use else if there're no more possibilities.
            System.out.println(number + " is zero");
        }

    }
}
