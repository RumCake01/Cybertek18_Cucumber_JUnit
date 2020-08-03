package Day29_Custom_Methods;

public class Unique_elements_Printing_From_Arrays {


    public static void main(String[] args) {

        String [] arr = {"A", "B", "C", "B", "D"};
        uniqueElements(arr);
        System.out.println("hello world");

        String [] arr1 = {"E", "F", "F", "E", "E", "G"};

        uniqueElements(arr1);
    }




    // print out unique elements from array of the string

    public static void uniqueElements (String [] array){
        for(String a: array){


            int count = 0;

            for(String each : array){
                if(a.equals(each)){
                    count ++;
                }
            }
            if(count==1){
                System.out.print(a+ " ");
            }

        }
        System.out.println();

    }
}
