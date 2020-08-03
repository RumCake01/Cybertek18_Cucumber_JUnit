package Day28_Recap_Warm_Up_tasks;

public class Frequency_ofWord2 {
    public static void main(String[] args) {
        String str = "CATCatcatcatdogDogDog".toLowerCase();

        int countCat = 0; // cat - we have 3 characters, so we need to compare three characters
        int countDog = 0;


        for (int i = 0; i <= str.length() - 3; i++) { // we use str.length()-3 that way we avoid index out of bond.
            String s = str.substring(i, i + 3); {

                if (str.substring(i, i + 3).equals("cat")) {
                    countCat++;
                }
                if (str.substring(i, i + 3).equals("dog")) {
                    countDog++;
                }
                System.out.println(" Cat : " + countCat);
                System.out.println("dog: " + countDog);
            }
        }
    }
}