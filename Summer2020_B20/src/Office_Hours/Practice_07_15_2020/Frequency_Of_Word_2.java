package Office_Hours.Practice_07_15_2020;

public class Frequency_Of_Word_2 {
    public static void main(String[] args) {

        // first count it how many times java occurred in the string, and then remove all javas until all javas are removed

        String str = "JavaJavajavajavaJAVA".toLowerCase(); // we convert it to lower case  this way or with
        // or this way str = str.toLowerCase () ; or for the scanner: String str = scan.nextLine().toLowerCase();

        // debugging: "javjavajavajavajava" this is how it looks each time the count increased and the replaces codnition get executed
        // it removes java until theres no more java left

        // str = str.toLowerCase();// str  "javajavajavajavajava"
                                    // str  "javjavajavajava"
                                    // str  "javjavajava"
                                    // str  "javjava"
                                    // str  "java"
                                    // str "" / no more java left contidion stops here

        int count = 0; // we will store the frequency of our word java here, increase count each time this condition is true

        while (str.contains("java")) {
            count++;

            // remove the java that repeats
            str = str.replaceFirst("java", ""); // this statement removes one java from the string
        }
        System.out.println("java: " + count);

    }
}
