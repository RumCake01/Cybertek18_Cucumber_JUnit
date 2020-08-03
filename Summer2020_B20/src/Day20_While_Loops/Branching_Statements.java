package Day20_While_Loops;

public class Branching_Statements {

    public static void main(String[] args) {

      // declare initialization before whiel loop

      char ch = 'A';
      while(ch<='E'){
          if(ch == 'C') {
              ch++;// we have to move this here (one should go under the sout and one shoudl be places
              // before the continue statement)
              // because everything after B will be skipped
              continue; // skips everything, even iterator, please iterator ch++ before this statement
          }
          System.out.print(ch + " " );
          ch++; // iterator is always executed after the block, should never be skipped.


      }

        boolean a = true;
      while(a){
          System.out.println("test started");
          //break;// this will just terminate the loop

          // if we use System.exit -- it is going to terminate the entire program

          System.exit(0);// this will stop the entire program, nothing after this line will be executed

      }
         System.out.println("completed"); // this wil not be excuted if placed after System.exit.
    }
}
