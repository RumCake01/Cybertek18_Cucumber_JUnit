package Day27_Recap;

public class Draft_01 {
    public static void main(String[] args) {
        String words = "AABBCCDD";
        // HOW MANY DUPLICATES I HAVE AND PRINT THEIr FREQUENCY

        String result = "";


        String nonduplicates = "";

        for (int i = 0; i <= words.length() - 1; i++) {
            String a = "" + words.charAt(i);
            if (!nonduplicates.contains(a)) {
                nonduplicates += a;
            }
        }

        for (int j = 0; j <= nonduplicates.length() - 1; j++) {
            char b = nonduplicates.charAt(j);
            int count = 0;
            for (int i = 0; i <= words.length() - 1; i++) {
                char each = words.charAt(i);

                if (each==b) {
                    count += 1;
                }
            }
            result += "" + b + count;

        }
        System.out.println(result);



        for(int i = 0; i<5; i++){
            System.out.println("happy new year");
        }
    }
}


