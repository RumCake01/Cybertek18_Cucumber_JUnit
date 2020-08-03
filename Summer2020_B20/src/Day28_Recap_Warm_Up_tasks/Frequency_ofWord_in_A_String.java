package Day28_Recap_Warm_Up_tasks;

public class Frequency_ofWord_in_A_String {
    public static void main(String[] args) {
        /*
        1. write a program return the frequency of a word from a string Using FOR LOOP
            ex:
                str = "JavajavaJAVA";
                word = "java";
                output:
                    3
        do not use contains and replaceFirst approach
         */

        String str = "JavaJAVAjava".toLowerCase();

        // find out how many java i have in the string

        int count = 0;
        for(int i= 0; i<=str.length()-4; i++) { //
            // we gave length()-4 here because

            // using substring method get first 4 characters

            // substring (0, 4) ==> java
            // substring (1, 5) ==> avaj
            // substring (2, 6) ==> vaja
            // substring (3, 7) ==> ajav
            // substring (4, 8) ==> java

            // two javas occurred in this the string after debugging it

            // substring (i, i+4) - beginning index and plus next four characters

            String s = str.substring(i, i + 4); // we start from zero index, and end after every four characters
            // we need to make sure i's value wil not be out of bond/range

            // indicate the index numbers here to get the exact characters and count the frequency

            // now compare if the string equals to java

            if (s.equals("java")) { // whenever next four characters are matching with java, it will increase the count
                count++;
            }
        }
        System.out.println(count);

    }
}
