package Day19_For_Loop;

public class For_Loop_Continue_Statement {
    public static void main(String[] args) {


        for(int i = 1; i <=5; i ++){

            if(i == 3){
                continue;// will continue printing the rest without number 3, jumps to next iteration
            }
            System.out.print(i+" "); // results wll be: 1 2 4 5
        }
        System.out.println("==================================");
        System.out.println();
        for(char ch = 'A'; ch<='F'; ch ++){

            if(ch =='C'){
                continue;

            }
            System.out.print(ch + " ");
        }
        System.out.println();

        for (char ch= 'a'; ch <='f'; ch++){

            if(ch== 'c' || ch =='f'){
                continue;
            }
            System.out.print(ch + " ");
        }

        System.out.println();
    }
}
