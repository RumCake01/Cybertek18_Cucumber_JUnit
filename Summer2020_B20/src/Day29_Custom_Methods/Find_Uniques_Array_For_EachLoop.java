package Day29_Custom_Methods;

public class Find_Uniques_Array_For_EachLoop {

    public static void main(String[] args) {


        // write a program to find characters from the string array and its frequency using for each loop

        String [] arr = {"A", "B", "C", "B"};



        for ( String a :  arr){ // this helps to get each of the elements - outer loop, it repeats the inner loop

            int count = 0;

            for (String each : arr){ //  this inner loop get frequency of a's value, gets frequency
                // each represents our array
                if (a.equals(each) ) {
                    count+=1;
                }
            }
            if(count==1) { // if count equals to 1, then it is unique
                System.out.println(a + count);
        }

        }




    }
}
