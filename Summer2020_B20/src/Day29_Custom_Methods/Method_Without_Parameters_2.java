package Day29_Custom_Methods;

public class Method_Without_Parameters_2 {
    /*
    Access-Modifier Specifiers  return-type  name (){
    }
     */



    /*
step1: Print Hello 5 times
step2: print ur school name
step3: print hello 5 times
step4: print ur name
step5: print Hello 5 times
 */



    public static void main(String[] args) {

        printHello5X();
        System.out.println("Cybertek");
        printHello5X();
        System.out.println("RumCake");
        printHello5X();
    }



    // the method and statement below will be checked first, and then the method in the main mehtod above will be executed
    public static void  printHello5X(){

        for(int i = 10; i>=6; i--){
            System.out.println("hello world");
        }
    }




}
