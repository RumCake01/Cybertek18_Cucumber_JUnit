package Day08_LogicalOperators;

public class CitizenshipTasks {

    public static void main(String[] args) {

        int age = 12;
        String citizenship1 = "USA";
        String citizenship2 = "France";

        boolean eligibaleAge  = age >= 18;
                // 12 >= 18 ==> false

        boolean usCitizen = citizenship1 == "USA" || citizenship2 == "USA";
                // "USA" == "USA" || "france" == "USA"
                    //   true     ||   false
                    // the result here is True

        boolean eligibleToVote = eligibaleAge && usCitizen;
            //                  false        &&   true
                // in && the result will be false
        System.out.println(eligibaleAge);
        System.out.println("==========================================");


        String firstNAme = "Rumiya";
        String lastNAme = "Hasnutdinova";
        int herAge = 17;
        String requiredCitizenship = "USA";
        String mustHave = "ID";
        String language1 = "English";
        String language02 = "Turkmen";
        String language03 = "French";
        String fullNAme = firstNAme + " " + lastNAme;

        boolean eligibleAGe = herAge>= 15;
        boolean citizenship = requiredCitizenship == "USA";
        boolean documents = mustHave == "Passport";
        boolean Language = language1 == "English";
        boolean Language2 = language02 == "German";
        boolean Language3 = language03 == "French";

        boolean passedRequirements = eligibleAGe && citizenship && documents;



        System.out.println(fullNAme + ", who is " + herAge + " speaks the following languages: " + language1 + ": "  +  language02 + ": "  + " " + language03+ " " +  ", and has meet all the requirements and is eligible to travel as a model: " + passedRequirements);









    }
}
