package Day09_GradeCalculator;

public class Grade_Calculator_ {

        public static void main(String[] args) {

        /* write a program that can check if number is positive negative or equals to zero.
        for example*/
            int num = 1;
            if(num ==1){
                System.out.println(num + " is positive number");
            }
            if(num==-6){
                System.out.println(num + " is negative number");
            }
            if(num==0){
                System.out.println("zero");
            }

            /*write a program that can calculate the grade.*/

            int grade = 75;
            if(grade==90){
                System.out.println("Your score is Excellent");
            }
            if(grade>=70 && grade<=90){
                System.out.println("Your score is Good. Go have a drink!");
            }
            if (grade>=60 && grade<=70){
                System.out.println("Your score is Pass");
            }
            if(grade<=60){
                System.out.println("Your score is Fail");
            }


            int frenchLanguage = 85;
            if(frenchLanguage >=90 && frenchLanguage<=100){
                System.out.println("You are fluent in French.");
            }
            if(frenchLanguage>=80 && frenchLanguage<=90){
                System.out.println("Your French is ok.");
            }
            if(frenchLanguage>=70 && frenchLanguage<=80){
                System.out.println("Your French is so-so.");
            }
            if(frenchLanguage>=60 && frenchLanguage<=70){
                System.out.println("Your French is kinda bad.");
            }
            if(frenchLanguage<=60){
                System.out.println("You barely speak French.");
            }


        }

    }

