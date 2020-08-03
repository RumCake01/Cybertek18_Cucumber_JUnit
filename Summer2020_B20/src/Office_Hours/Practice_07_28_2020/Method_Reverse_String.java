package Office_Hours.Practice_07_28_2020;

public class Method_Reverse_String {

    public static void main(String[] args) {
        String name = "RUmCake";
        String reversedName = name;// optional, we dont need to assign to a separate variable
        System.out.println(reverseString(name));
        System.out.println(reversedName.toLowerCase());
        System.out.println(reversedName.toUpperCase());
    }


    // when declaring: acc modifier; then return-type; Method Name() {Statenents }

    public static String reverseString (String str){
        String result = "";
        for(int i = str.length()-1; i>=0; i--){
            result +=str.charAt(i);
        }

        return result;

    }
}
