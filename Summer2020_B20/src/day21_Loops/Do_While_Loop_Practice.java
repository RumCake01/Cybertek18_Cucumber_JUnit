package day21_Loops;

public class Do_While_Loop_Practice {

    public static void main(String[] args) {

        // we can only give condition in do-while loop, just like in while loop


        // start wiwth initialization first:

        int num = 1;

        do{

            System.out.print(num + " ");

            num ++;// increases the number by 1 always untul reaches 21.

            // make sure that iteration is placed after the loop statements: see above.

        }while(num<=20);// when the value equal to 21. the loop will stop executing when num is greater than 20.

        System.out.println(); // this empty print statement can append a new line.

        System.out.println(num);

        // print alphabet in backwards


        char ch = 'Z';


        do{
            System.out.println(ch+" ");
            ch--;
        }while (ch>='A');// as long as it is true we continue executing








    }
}

