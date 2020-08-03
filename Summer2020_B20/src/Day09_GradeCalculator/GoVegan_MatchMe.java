package Day09_GradeCalculator;

public class GoVegan_MatchMe {

    public static void main(String[] args) {

        System.out.println("Hello,Guys!  \nLet's do something funny. I here someone wanna to challenge us, so let's START our GAME!");
        System.out.println("Here i will talk about:How need to look my IDEAL BOYFRIEND! \nIf you will match the RESULT, You will go with me on are DATE, if NOT, i am SORRY! :) ");
        int age = 29;
        int heightInInch = 85;
        int heightInCM = 190;
        int weightLBS = 180;
        int weightInKg = 80;
        String nationality = "Moldova";
        System.out.println("CONGRATULATION! \nYOU DID IT! \nNOW WE CAN GO ON A DATE!");
        String sex = "Male";
        boolean colorEyesBlue = true;
        String blue = "Blue";
        boolean colorHairBlond = true;
        String blonde = "Blonde";
        System.out.println("1). How old are you? I hope you are not  a baby !" + "\n" + age + "\n");
        if (age >= 27 && age <= 30) {
            System.out.println("Good Job! You pass! Let's go NEXT!");
        } else {
            System.out.println("Oh, I am sorry! but you're not in my range! ");
        }
        System.out.println("2). Ok! Now when i know you are not baby, let's see how tall are you?\nFirst let's see in CM" + "\n" + heightInCM + "\n");
        if (heightInCM >= 190) {
            System.out.println("Good Job! Keep Going!");
        } else {
            System.out.println("Oh! I am sorry!");
        }
        System.out.println("In INC please too. Yes, i know i am crazy! I just wanna to see how Smart you are :)" + "\n" + heightInInch + "\n");
        if (heightInInch >= 85) {
            System.out.println("Good Job! Keep Going!");
        } else {
            System.out.println("Oh! I am sorry!");
        }
        System.out.println("OK! Now let's see what is your weight? No offence , just i like the Man who is taking care of His BODY!" + "\n" + weightInKg + "\n");
        if (weightInKg >= 80) {
            System.out.println("Really Good! I see you love to practice sport like me! Keep Going , we almost DONE!" + "\n");
        } else {
            System.out.println("Oh! I am sorry!");
        }
        System.out.println("Two more question and you almost done! Let's see what color is your eyes? " + "\n" + blue);
        if (colorEyesBlue == true || blue == "Blue") {
            System.out.println("OMG! You almost PASS! Just one more question and we can go on a DATE");
        } else {
            System.out.println("Oh! I am sorry!");
        }
        System.out.println("HUH! The final question! Let's see what will be! I am so exited ! Are you?" + "\n" + blonde);
        if (colorHairBlond == true || blonde == "blonde") {
            System.out.println("CONGRATULATION! \nYOU DID IT! \nNOW WE CAN GO ON A DATE!");
        } else {
            System.out.println("Oh! I am sorry! Do not worry! You'll found something for you too!\nGood LUCK!!");
        }
        System.out.println("Thank you so much for you attention and patience!!!\nGood LUCK!");
    }
}
