import java.lang.reflect.Array;
import java.util.Arrays;

public class Day28_WarUp_Tasks {
    public static void main(String[] args) {

        // loops short quiz review

        int a = 0;

    while (a<=6){ // true, a first was increased by 2, then increased by 2 again, so 4 is <=than 6
        // if a ==6, a<=6, this condition is still true, a becomes 8 = so thats when the condition is false
        a+=2;


        int i = 0;
        int j = 7;
        for(i=0; i<j-1; i+=2){
            System.out.println(i+"");

        }
    }

    for (int k = 0; k<=4;){
        k++;
        System.out.println(k + ""); // 1, 2, 3, 4, 5 and then it stops

    }


    int z = 5;
    for (int q = 5; q>0; q--){
        z +=q;
    }
        System.out.println(z);
    }
}
