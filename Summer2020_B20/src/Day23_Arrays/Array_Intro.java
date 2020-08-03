package Day23_Arrays;

public class Array_Intro {
    public static void main(String[] args) {


        // intro to arrays

        //String students = "RumCake";// here we can store only one data

        // to store muultiple data we can use array, they are designed for multiple data

        //String[] students = {"Cybertek", "Muhtar", "Nadir", "Asiya"};/// we can place the bracker after data type or after variable name
        // String[] or String students[]
            // index numbert     1           2         3        4
        // use index numbers to retrieve the data from variable students, 4 data and max index is 3.

       // String name1 =  students[4];
        //System.out.println(name1);


        int[] scores ={85, 70,90,100, 200 };
        String[] names = {"Mike", "Adam", "Tony", "John", "Ammy"};

        // instead of repeating it the steps below many times, we can use loop:

       /* System.out.println(names[0] + ": " + scores[0] );
        System.out.println(names[1] + ": " + scores[1] );
        System.out.println(names[2] + ": " + scores[2] );
        System.out.println(names[3] + ": " + scores[3] );
        System.out.println(names[4] + ": " + scores[4] );*/



        // the same action using foor loop:

        for(int i = 0; i<=4; i++){// this starts with zero because thats our first indext of the first string,
            // and i<=4 because thats the last word in the string
            System.out.println(names[i] + ": " + scores[i] );
        }

        System.out.println("=============================================================================");

        // if u want to declare array without giving elements, just declare the size only:

        String[] classmates = new String[5];// we specify the size of array here String [5], which means this array can contain five elements
        classmates[0] = "John";
        classmates[1] = "Mark";
        classmates[2] = "Steve";
        classmates[3] = "Milena";
        classmates[4] = "Baae";

// array size is fixed.

        for(int i = 0; i <=classmates.length-1; i++){ // or we can just use i <=4 if we know how many variables are in the string
            System.out.println(classmates[i]);// we provide the name of the string first and then the array data which int i in this case.

        }













    }
}
