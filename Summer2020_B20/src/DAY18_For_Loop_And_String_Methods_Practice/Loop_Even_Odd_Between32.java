package DAY18_For_Loop_And_String_Methods_Practice;

public class Loop_Even_Odd_Between32 {
    public static void main(String[] args) {

        for (int a = 0; a <= 32; a += 2) {
            System.out.println("Even numbers are: " + a);

        }
        System.out.println("==================================");
        for (int a = 1; a <= 32; a += 2) {
            System.out.println("odd numbers are:" + a);
        }
        System.out.println("==================================");
        for (int a = 32; a >= 0; a -= 2) {
            System.out.println("even number backwards:" + a);

        }
        System.out.println("==================================");
        for (int a = 31; a >= 1; a -= 2) {
            System.out.println("odd numbers are:" + a);


        }
    }
}

