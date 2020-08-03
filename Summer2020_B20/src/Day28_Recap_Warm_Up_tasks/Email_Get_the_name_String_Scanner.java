package Day28_Recap_Warm_Up_tasks;

public class Email_Get_the_name_String_Scanner {
    public static void main(String[] args) {

       /* 3. write a program that can get the name and domain of any given email address
        Ex:
        cybertek@gmail.com
        output:
        name: cybertek
        domain: gmail
                */
        String email = "cybertek@gmail.com";

        // create two string for name and for domain, without counting indexes because they are uknown to us.

        String name = email.substring(0, email.indexOf("@")) ;// so it will count from zero till the @ not printing @
        // everything before this @ will be created and print out as a substring
        String domain = email.substring(email.indexOf("@") +1, email.lastIndexOf(".")); // it will get the domain from gmail till dot "."

        System.out.println(name);
        System.out.println(domain);
    }
}
