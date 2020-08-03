package Office_Hours.Practice_07_15_2020;

public class Similar_To_frequency_Cat {
    public static void main(String[] args) {

        // write a program that can find the frequency of a word from a string (not from a sentence)
        //input CatCatCat
        //Cat
        // Output: 2

        // first we need to find

        String str = "Dog dog dog Cat cat Cat ".toLowerCase();  /// we want to find HOW MANY TIMES DID CAT and DOG oCCURRED separately

        // or we can do toLower case conversion this way as well:
        // str = str.toLowerCase (); - like this annd it will convert any kind of user input to lower case

        int countOfDog = 0;

        // to verify if dog occurred in the string do the condition:

        // when the loop first executes, the loop will check if the below condition is true, the it will increase the count
        // at the same time, the first dog will be out, so we will be left with one dog only,
        // as long as we have 1 cat left this condition is true, then the count will be increased by oen again,
        //so the count now is two, and then it will remove the second dog, so there will be only 1 dog left,
        // and the condition becomes true, which means after the third execution
        // condition will become false and the count will stop.


        while (str.contains("dog")) {  // while the string contains cat, we increase the count by 1
            countOfDog++; // increase the count and assign it to
            // doesnt matter where u place ur count, it will work as long as it is within the loop
            // now we need to remove the first cat from the string

            str = str.replaceFirst("dog", "");
            // after finish counting first dog, we dont want to count it again,
            // so we need to remove it, the number of times removing it is basically the frequency of the word
        }

        // repeat the same while loop only for the cat


        int countOfCat = 0;;

        while (str.contains("cat")) {  // while the string contains cat, we increase the count by 1
            countOfCat++; // increase the count and assign it to
            // doesnt matter where u place ur count, it will work as long as it is within the loop
            // now we need to remove the first cat from the string

            str = str.replaceFirst("cat", "");
            // after finish counting first dog, we don't want to count it again,
            // so we need to remove it, the number of times removing it is basically the frequency of the word
        }
        System.out.println("Dog: " + countOfDog);
        System.out.println("Cat: " + countOfCat);
    }
}
