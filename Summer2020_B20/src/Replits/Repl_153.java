package Replits;
import java.util.Scanner;

public class Repl_153 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s);
    }


    public static void person(String info) {

        //your code here
        String[] str = info.split(",");

        String name = str[0];
        String lastName = str[1];
        String age = str[2];


        System.out.println("person name: " + name + " last name: " + lastName + " age: " + age);
    }
}
