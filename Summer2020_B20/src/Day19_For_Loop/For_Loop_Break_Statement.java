package Day19_For_Loop;

public class For_Loop_Break_Statement {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
            break;
        }
        System.out.println("=============================");

        // if we want to print A to C only:

        for (char ch = 'A'; ch <= 'H'; ch++) {
            // below helps to execute only specific letters, and the break stop the rest
            if (ch == 'C') {// once condtion is true, the break will get executed
                break;
            }
            System.out.println(ch + " ");

        }
        System.out.println();

        System.out.println("=============================");


        for (int i = 10; i <= 50; i += 10) {// will print 10, 20, 30, 40
            if (i == 40) {
                break;
            }
            System.out.println(i + " ");
            System.out.println();
            System.out.println("=============================");
        }

        for (int x = 1000; x >=100; x-=100){
            if(x==500){ // this will print number backwords in 100 increment: 1000, 900, 800 etc
                break; // it will stop once it gets to 500., then the statemnt below will get executed.
            }
            System.out.println(x+" ");
        }


    }
}
