package Replits;
import java.util.Scanner;
public class Replit_074_Alejandro {
    public static void main(String[] args) {
        /*
        alejandro have started learning java, he knows what you know about ifs and strings.

he has a large number of text emails, going trough all of them will take a lot of time.
to save time he will only read the emails that refer to him by name.

he wants to write a program that gets a string (the email) and determines if his name "alejandro"
appears in that string. if so it will output "read this mail" else it will output "dont read".
for example:
a = "dear alejandro.....alot of text"
outputs: "read this mail"
a = "thunder blaz is the best drink in the galaxy..."
outputs: "dont read"
a = "subject : important project, alejandro we refer to you  this ...."
outputs: "read this mail"
         */

        /*
        1. String that matches his name Alejandro
        2. if matches => "read this mail"
        3. else =>"dont read"
         */
        Scanner scan = new Scanner(System.in);
        String txt = scan.nextLine();
        String result = "";

        txt.equalsIgnoreCase("alejandro");
        if(txt.contains("alejandro")){
            result = "read this mail";
        }else{
            result = "dont read";
        }
        System.out.println(result);




















    }
}
