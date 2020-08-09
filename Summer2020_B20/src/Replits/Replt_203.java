package Replits;

public class Replt_203 {

        public static void main (String [] args){

            String str = "kayak";
            System.out.println(isPalindrome(str));
        }

        public static boolean isPalindrome(String check) {

            String reversed = "";
            String s = check.replace("", "").toLowerCase();
            for(int i = check.length()-1; i>=0; i--){
                reversed +=check.charAt(i);
            }
            if(reversed.equals(s)){
                return true;
            }
            return false;
        }
    }

