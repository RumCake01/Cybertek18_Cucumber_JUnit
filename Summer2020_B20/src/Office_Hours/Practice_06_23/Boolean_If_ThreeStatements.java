package Office_Hours.Practice_06_23;

public class Boolean_If_ThreeStatements {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = !x==false;
                    // !x >>> means opposite of true, which is false
        // y == false
        boolean z = y;

        if (x)  {
            System.out.println("Hello everyone");
        }
        if(y){
            System.out.println("Today is great day");
        }
        if(z){
            System.out.println("We are improving everyday");
        }// since all the conditions are true, all the sout statements will be executed.




    // Question #10 from the quiz

        int X = 10;
        int Y = X++;
        // y = 10 first, the will be increased (post increment)
                // X = 11 because of the post increment operation above
                 //the value is now == 1
        System.out.println(Y++ + "" + X++ + "" + Y);
            // y = 10 + "" + 11 + "" + 11




    }
}
