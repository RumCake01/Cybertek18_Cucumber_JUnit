package Day10_IfStatements;

public class Character_Identify {
    public static void main(String[] args) {

        char character = '9';// create condition if characte is alphabetic


        boolean isAlphabetic = (character >= 65 && character <= 90) || (character >= 97 && character <= 122);

        //        upper case letters only       ||   lower case letters only

        String alphabet = "";

        if(isAlphabetic){// can also put this way: if(isAplhabetic == true)
            alphabet = character + " is Alphabetic character";

            // or u can skip boolean, and just put it this way:
            // if(isAlphabetic = (character >= 65 && character <= 90) || (character >= 97 && character <= 122)){

            //System.out.println(character + " is Alphabetic");
        }else{
            alphabet = character + " is not Alphabetic";
           // System.out.println(character + " is not Alphabetic");
        }
// or can also skip the two sout regular statements and just print 1 statement at the end:


        System.out.println( alphabet);// by using String alphabet is better, and can do only one sout.

        boolean isDigit = character >= 48 && character <= 57;
        String digit = "";
        if (isDigit){
            digit = character +  " is a digit";
        }else{
            digit = character + " is not a digit";
        }
        System.out.println(digit);

        boolean specialChar = isAlphabetic == false && isDigit ==false;

        String specialCharacter = "";
        if(specialChar){
            specialCharacter = character + "is a special character";
            }else{
               specialCharacter = character + " is not a special character";
            }

    }
}
