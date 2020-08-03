package Day10_IfStatements;

public class PracticeTasks_Myself {
    public static void main(String[] args) {
        /*
        1. write a program that can identify if the given character character is Alphabetic*/
        char aplhabetic = '%';
        boolean letters = aplhabetic >= 65 && aplhabetic <= 90 || aplhabetic >= 127 && aplhabetic <= 122;
        boolean digit = aplhabetic >= 48 && aplhabetic <= 57;
        boolean specialCharacter = aplhabetic >= 33 && aplhabetic <= 47 || aplhabetic >= 58 && aplhabetic <= 64 || aplhabetic >= 91 && aplhabetic <= 96 || aplhabetic >= 123 && aplhabetic <= 126;
        boolean invalid = letters == false && digit == false && specialCharacter == false;

        String result = "";

        if (letters) {
            result = aplhabetic + " this is a letter";
        } else if (digit) {
            result = aplhabetic + " this is a number";
        } else if (specialCharacter) {
            result = aplhabetic + " this is a special character";
        } else if (invalid) {
            result = aplhabetic + " This is invalid character";
        }
        System.out.println(result);
        /*
        HTTP is the protocol that governs communications between webservers and web clients (i.e. browsers). Part of the protocol includes
         a status code returned by the server to tell the browser the status of its most
          recent page request. Some of the codes and their meanings are listed below:
    status code:
        200, OK
        201, Created
        202, Accepted
        301, Moved Permanently
        303, See Other
        304, Not Modified
        307, Temporary Redirect
        400, Bad Request
        401, Unauthorized
        403, Forbidden
        404, Not Found
        410, Gone
        500, Internal Server Error
        503, Service Unavailable*/

        int code = 202;

        String resultOut = "";
        if (code == 200) {
            resultOut = code + " OK";
        }
        if (code == 201) {
            resultOut = code + " Created";
        }
        if (code == 202) {
            resultOut = code + "Accepted";
        }
        if (code == 301) {
            resultOut = code + " Moved Permanently";
        }
        if (code == 303) {
            resultOut = code + " See other";
        }
        if (code == 304) {
            resultOut = code + " Not Modified";
        }
        if (code == 307) {
            resultOut = code + " Temporary Redirected";
        }
        if (code == 400) {
            resultOut = code + " Bad Request";
        }
        if (code == 401) {
            resultOut = code + " Unauthorized";
        }
        if (code == 403) {
            resultOut = code + " Forbidden";
        }
        if (code == 404) {
            resultOut = code + " Not Found";
        }
        if (code == 410) {
            resultOut = code + " Gone";
        }
        if (code == 500) {
            resultOut = code + " Internel Server Error";
        }
        if (code == 503) {
            resultOut = code + " Service Unavailable";
        }else{
            resultOut = code + " Invalid Entry";
        }

            System.out.println(resultOut);

    }
}






/*1. declare an int variable called StatusCode
2. write a if statement that prints out, on a line by itself, the appropriate label from the above list based on status.
                    Example:
                        if status code = 200
                        output: ok
                        if status code = 201:
                        output: Created
            NOTE: use single if statements ONLY. DO NOT use more that one print statement*/