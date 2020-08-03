package Day11_Nested_If_Statements;

public class Ternary_Practice_Multi_Branch {
    public static void main(String[] args) {

        int num = 100;
        String result = "";
        if(num > 0){
            result = "Positive";
        }else if(num <0){
            result = "Negative";
        }else{
            result = "Zero";
        }

        //Using multi Branch to the ternary:

        String result2 = (num>0)? "Positive" : (num<0)? "Negative" : "Zero";
        System.out.println("\n" + result2);


        System.out.println("============================");


        int a = 20;
        int b = 20;
        String outcome = (a>b)? "A is greater" : (b>a)? "B is greater" : "A is equal to B";
        System.out.println(outcome);






    }

}
