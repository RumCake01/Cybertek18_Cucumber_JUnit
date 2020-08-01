public class HappyB20 {

    public static void main(String[] args) {

// find frequency of a word froms string Array

            String[] str = {"RUmCake", "Java", "Cake", "Cake"};
            String findWord = "cake";
            int count = 0;
            for (String each : str) {
                if (findWord.equalsIgnoreCase(each)) {
                    count++;
                }
            }
            System.out.println(findWord + " " +count);
            System.out.println( "hello hello");
            System.out.println( "hello hello");
            System.out.println( "hello hello");
    }
}
