package Office_Hours.Practice_07_14_2020;

public class Unique_Words_Using_Arrays {
    public static void main(String[] args) {
        // find unique charactrers from the string


        String [] words = {"C#","C#","C#", "Java", "Python", "Java", "Clever"};

        // in order to check the frequency of the first variable we need to retirive it from the string


        for(String b : words){
            int count = 0;

            // we can use loop to repeat comparision step, compare all of them

            for(String a: words){
                if(a.equals(b)){
                    count++;
                }
            }
            if(count == 2){ // if the word is listed only once, this condition will be true and it will be printed out.
                System.out.println(b);
            }

        }






    }
}
