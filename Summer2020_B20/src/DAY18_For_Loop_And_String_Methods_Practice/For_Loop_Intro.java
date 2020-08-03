package DAY18_For_Loop_And_String_Methods_Practice;

public class For_Loop_Intro {
    public static void main(String[] args) {

        // loops are used fo repeating the statement


        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("========================================");

        for (int i = 0; i <2; i ++ ){ //  we don't want an infinite loop, that's why we need an iterator.
            System.out.println("hello world");
            System.out.println("========================================");
            // to avoid logical error, always include itertator.

            for (int a = 1; a <=5; a++){ // a is 1, then it increases to 2 because of the iterator, then the
                // message gets printed, then iterator increases the value of a again, and execute the same message again,
                // so it will print it 5 times, and the a becomes 6 - it becomes false, so the statement wont get executed.
                System.out.println("Cybertek Batch 20");
                System.out.println("========================================");


                // print numbers 1 to 9

                for (int b = 1; b <=10; b ++){
                    System.out.print(b + " ");
                }
                System.out.println();
                System.out.println("hello");
                System.out.println("==========================================");

                // print numbers in backwords

                for (int l = 10; l>=1; l--) {// while is greater than, the loop will keep repeating,
                    // until the increment makes it decrease its value.

                    System.out.print(l + "");
                }


                // write a program that can print all even numbers between 0 =  1000
                //// write a program that can print all odd numbers between 0 =  1000
                // write a program that can print a = z
                // write a program that can print A = Z.








            }





            
        }






    }
}
