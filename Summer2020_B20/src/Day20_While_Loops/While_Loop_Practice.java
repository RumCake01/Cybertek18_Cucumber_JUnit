package Day20_While_Loops;

import org.w3c.dom.ls.LSOutput;

public class While_Loop_Practice {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // will append a new line if this empty sout added


        // with while loop we just give the condition. and if its true it executes the statement.

        int num = 1;
        while (num <= 10) {

            System.out.print(num + " ");
            num++;// make sure to place the iterator after all statements, otherwise will be a logical error.
        }

// print my name  5 times
        int i = 0;
        while (i <= 5) {
            System.out.print("RumCake, ");
            i++;
        }

        int num1 = 10;// the starting point, it will only print 5 times cause it will stop at 15.
        while (num1 < 15) { // which means if its true it will be printed 5 times
            System.out.println("Cybertek");

            num1++;
        }
        System.out.println(num);
        System.out.println("=============================================");


        // reverse the string

        String str = "Cybertek";
        //        012345678
        String result = "";

        int index = str.length() - 1; // the starting index number when we reverse the string
        // forcefully declare variable

        while (index >= 0) {
        }// ending and starting point, it started from the end, and decreases until index zero
        result += str.charAt(index); // this contains the reversed version of Cybertek string

        index--;// it will get executed 8 times.
    }
}