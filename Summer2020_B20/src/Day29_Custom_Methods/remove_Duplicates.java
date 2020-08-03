package Day29_Custom_Methods;

public class remove_Duplicates {
    public static void main(String[] args) {
        // remove duplicates from the string
        String str1 = "RummCaake";
        removeDuplicates(str1);

    }


    public static void removeDuplicates(String word) {
        String nonDup = "";
            for (String each : word.split("")) { // we are getting array from the string by using SPLIT method

                if (!nonDup.contains(each)) {
                    nonDup += each;

                }
            }
            System.out.println(nonDup);
        }
    }
