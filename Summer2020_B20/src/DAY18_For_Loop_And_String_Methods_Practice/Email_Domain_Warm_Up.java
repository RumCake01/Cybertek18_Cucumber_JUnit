package DAY18_For_Loop_And_String_Methods_Practice;
import java.util.Scanner;
public class Email_Domain_Warm_Up {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        int index1 = email.indexOf("@");// lets get the index number first of at@
                //email.substring()
        int index2 = email.lastIndexOf(".");// lets the index of dot
        // now we can get the text that is contained between them

        String domain  = email.substring(index1+1, index2); // to get the gmail word from the sentence
        System.out.println(domain);


    }
}
