package Day33_LocalDateName;

public class My_revew_3_Sundays_Class {

    // create a method that can reverse any string

    public static void main(String[] args) {
        reverse("Rumcake");
        reverse("Aniver");
        reverse ("house");
        reverse("love");
    }

    public static void reverse(String str){
        String result = "";

        for(int i = str.length()-1; i>=0; i--){
            result+= str.charAt(i);
        }

        System.out.println(result);
    }
}
