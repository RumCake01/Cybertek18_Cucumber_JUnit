package Day25_Practices_Arrays_Loops_String;

public class Reverse_string_ForLoop_AND_WhieLoop {
    public static void main(String[] args) {

// ANY tasks we use For Loop - we can also solve using WHILE LOOP below


        // Task: Remove duplicates for String using For and While loops
        // This task might appear during the interview
        // make sure ur able to explain it and show ur problem solving skills

        String str = "Batch20";
        // reverse a string,
        // string is a sequence of characters so it start with zero and last index is 6 here.

        // we need to get every single charcter one by one from index 6 till index zero

        // we can use charAt here for 6 times and get all the characters
        // or we can do it faster way by using

        // this is an efficient way of doing it.
        /*str.charAt(6);
        str.charAt(5)
        str.charAt(4);
        str.charAt(3);
        str.charAt(2);
        str.charAt(1);
        str.charAt(0); */

        // FOR loop
        String result = "";  // we can assign it to a variable to make it variable
        // we declare it outside of the loop

        for (int i = 6; i>=0; i-- ) { //  we can also put int i = str.length()-1 if we cant count the number of characters;
            // we start our initialization or either the length method of the string str.
            // with index 6 because we are doing it backwards, and it will end at index zero
            // the loop will stop when it gets less than zero, because index numbers cant be less than zero
            // we need decrement here because we need decrease it by one each time.
            // here we are basically repeating the charAt method
            result += str.charAt(i); // now we can concat each of them to the string result
            // charAt will retrieve each of the characters

        }
        System.out.println(result);

        System.out.println("======================");

// While Loop - second solution

        String result2 = "";

        // in while loop we can only give a boolean condtion
        // thus, we create intiialization before while loop

        int index = str.length()-1; // this is our initialization starts with the last index 6

        while(index >=0){ // we can only give condition here

            // to get each of the characters we need to use a charAt method here

           result2+= str.charAt(index); // we concat it here to the string result2


            index--; // this is our iteration. we give at the end, after while loop
            // we iterate it after we execute other statements
        }

        System.out.println(result2);
    }
}
