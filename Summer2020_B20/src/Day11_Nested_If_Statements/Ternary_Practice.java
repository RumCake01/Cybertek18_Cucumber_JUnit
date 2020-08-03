package Day11_Nested_If_Statements;

public class Ternary_Practice {
    public static void main(String[] args) {

        int age = 15;
        String citizen = "USA";
        String result = "";

        if(age>=18 && citizen == "USA"){
            result = "Can vote";
        }else {
            result = "Can not vote";
        }
        System.out.println(result);

        String result2 = (age>=18 && citizen == "USA")? "Can Vote" : "Can not Vote";
        System.out.println(result2);
        System.out.println("===================================");

        int n1 = 100;
        int n2 = 200;

        String r = (n1 ==n2)? "equal" : " not equal";
        System.out.println(r);


        int num = 100;









    }
}
