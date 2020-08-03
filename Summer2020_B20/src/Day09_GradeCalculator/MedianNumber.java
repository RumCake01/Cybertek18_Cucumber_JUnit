package Day09_GradeCalculator;

public class MedianNumber {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c= 300;

        boolean aIsMed = (a>b && a<c) || (a<b && a>c);
        boolean bIsMed = (b>a & b<c) || (b<a && b>c);
        boolean cIsMed = !aIsMed && !bIsMed;

        double med = 0;
        if(aIsMed){
            med = a;
        }
        if(bIsMed){
            med = b;
        }
        if(cIsMed){
            med = c;
        }
        System.out.println(med + " is the median number.");

    }
}
