package Office_Hours.Practice_07_27_2020;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Combine_2Arrays3_Combined_Loops {
    public static void main(String[] args) {


        String[] a1 = {"Tetiana", "Jack", "Mike"};
        String[] a2 = {"Mark", "Denis", "Lily", "RumCake"};

        String[] a3 = new String[a1.length + a2.length];

        int index = 0;

        for(int i = 0; i<=a1.length-1; i++){
            a3[index] = a1[i];
            index++;
        }

        for(int j= 0; j<=a2.length-1; j++){
            a3[j+a1.length] = a2[j];

        }


        System.out.println(Arrays.toString(a3) );


    }
}
