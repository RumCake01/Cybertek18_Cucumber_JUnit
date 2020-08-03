package Day33_LocalDateName;

public class My_review_2_Sundays_Class {

    public static void main(String[] args) {

        grade(100);



    }

    public static void grade (int score){

            if (score <0 || score >100){
            System.out.println("invalid score");
            return;
}
            char grade = (score>=90)? 'A' : (score>=80)? 'B'  : (score >=70)?  'C'
                : (score>=60)? 'D'  : (score>=50)? 'F' : '0';

            System.out.println("grade " + score);
    }




}
