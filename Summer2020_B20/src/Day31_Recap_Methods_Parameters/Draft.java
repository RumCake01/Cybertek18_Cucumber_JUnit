package Day31_Recap_Methods_Parameters;

public class Draft {

        public static void printHollowRect()
        {
            for (int i = 1; i <= 5; i++) {
                for (int a = 1; a <= 5; a++) {
                    if ((i == 1 || i==5) || ( a==1 || a == 5) ) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
                public static void main(String[] args) {
                    printHollowRect();
                }
            }
