package Day25_Practices_Arrays_Loops_String;

public class Find_Longest_String {

    public static void main(String[] args) {
        /*
        Write a program that can return the longest string of text from a String array
         */
        // We can use For Each loop here because we have a structure: Arrays.

        String[] str = {"Anam", "Nickolas", "Amir", "Nurmamet"};

        // 1. find the max length
        // 2. compare it to the rest of the string items

        int maximimLength = str[0].length();

        // we can apply for each to get access to elements directly from the variabl string str

        for(String each : str){ // to fidn the max from the string// the each represents every sihgle element in the string
            // and it is why it must match the data type, hence here is a string each.

            if(each.length()>maximimLength){ // if the each elements length grater than the prevuous max it will be assigned to the maximumLength
                maximimLength=each.length();

            }

        }
        // here we are going to print the string that has Max Length  ==> print out that word

        for(String each : str){
            if(each.length() == maximimLength) {
                System.out.println(each);
            }
        }
    }
}
