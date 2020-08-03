package Office_Hours.Practice_06_30_2020;

public class Practice_if_Ternary {
    public static void main(String[] args) {
        /*
  if (condition){} ==> we use the single if statement we use only for single condition only

  if (Condition) ==> we use it whne we have two possible outcomes
  else


  if (Condition) ==> we use it when we have more than two possible outcomes
  else if{}
  else
  only one will be executed at the end.
  we can have as many else if statements as we want.


  // use it when we have a Pre-condition, something must be TRUE.
        //we apply it by creating if statement in another if statement.

         */

        int num = 305;
        String result = "";
        // to verify if its odd or even, we need to two conditions:
        if(num%2==0) { // in order to be even, we need to divide num/2 and its remained is zero = that number is EVEN
            //System.out.println(num + " is even number");
            result = num + " is even number";
        }else{
            //System.out.println(num + " is odd number");
            result = num + " is even odd";
        }

        // TERNARY  - shortcut of If Else statements

        // (condition1) ?  "statement"  (condition2) : "statement"



       String result2= (num%2==0)? num + " is even number" : num + " is even odd";

        System.out.println(result2);

    }
}
