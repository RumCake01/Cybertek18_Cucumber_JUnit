package Day10_IfStatements;

import javax.sound.midi.Soundbank;

public class WarmUpAt_Night {
    public static void main(String[] args) {
        /*write a program that can define the age groups of a person
        age groups are:*/

        int ageGroup = 121;

        String age = "";

        if (ageGroup < 3 && ageGroup >0) {
            age = "Baby";
        } else if (ageGroup >= 3 && ageGroup <= 5) {
            age = "Toddle";
        } else if (ageGroup >= 6 && ageGroup <= 9) {
            age = "Kid";
        } else if (ageGroup >= 10 && ageGroup <= 12) {
            age = "Pre-Teen";
        } else if (ageGroup >= 13 && ageGroup <= 17) {
            age = "Teenager";
        } else if (ageGroup >= 18 && ageGroup <= 20) {
            age = "Young Adult";
        } else if (ageGroup >= 21 && ageGroup <= 39) {
            age = "Adult";
        } else if (ageGroup >= 40 && ageGroup <= 49) {
            age = "Middle-Aged Adult";
        } else if (ageGroup >= 50 && ageGroup <= 64) {
            age = "Very Young Senior Citizen";
        } else if (ageGroup >= 65 && ageGroup <= 74) {
            age = "Young Senior Citizen";
        } else if (ageGroup >= 75 && ageGroup <= 84) {
            age = "Old Senior";
        } else if (ageGroup >= 85 && ageGroup <=120) {
            age = "Senior Citizen";
        } else{
            age = "Invalid Entry";
        }
        System.out.println(age);

        /*
         2. Write an if statement that will print day of the week based on value of the day variable.*/

        int num = 2;
        String day = "";

        if(num==1){
            day= "Monday";
        }else if(num==2){
            day = "Tuesday";
        }else if(num==3){
        day = "Wednesday";
        }else if(num==4){
            day = "Thursday";
        }else if(num==5){
            day = "Friday";
        }else if(num==6){
            day = "Saturday";
        }else{
            day = "Sunday";
        }
        System.out.println(day);
        }
}
