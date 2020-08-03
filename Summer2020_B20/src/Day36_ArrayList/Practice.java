package Day36_ArrayList;

public class Practice {
    public static void main(String[] args) {

// find frequency of word:

        String str = " javaJavaJAVAjAVa".toLowerCase();


        int count = 0;
        for (int i = 0; i<=str.length()-4; i ++) {
            if (str.substring(i, i + 4).equals("java")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
