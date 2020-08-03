package Day12_Switch_Scanner;

/*
write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150

 */

public class Age_Group {
    public static void main(String[] args) {
        int age = 21;
        String ageGroup = "";

        if(age>0 && age<=150) {

            if (age < 21) {
                ageGroup = "teenager";
            } else if (age <= 55){
                ageGroup = "adult";
            }else{
                ageGroup = "senior";
            }

        }else{
            ageGroup = "invalid";
        }
        System.out.println(ageGroup);



        /// ternary below:

        String ageGroup1 =(age<21)? "teenager" :(age<=55)? "adult" : "senior";
        System.out.println(ageGroup1);

    }
}
