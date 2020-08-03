package Day08_LogicalOperators;

public class ChallengeForAdam {
    public static void main(String[] args) {
        /*Create a program that utilizes "If Statements" to set the parameters. For example (If my partner is taller that 65 inches and weighs no more than 250 LBS, we will match)
- Must include, height (IN as well as CM)
- Must include, weight (LBS as well as KG)
- Must include nationality, as well as secondary nationality (for example, American, Russian)
- Must include concatenation to output statements: for example, my ideal match is 72 inches (182 CM) tall, and weight 185 LBS (83 KG).
- Must include age.
- Must include sex. (Male, Female, or both)
- Must include one thing you look for in someone. Whether it is eye color, hair color or how white their teeth are! Who cares! Just make it PERSONAL to you!
- MUST USE 1 IF STATEMENT WITH &&, 1 WITH || AND 1 WITH ! You can add them inside the "If condition" for example
 if(sex == male || sex == female) {
	System.out.println("My ideal partner is Male or Female");*/

        double height = 70;
        double CM = height * 2.54; // inch to cm
        double Inch = CM / 2.54; // cm to inch

        double weight = 168;
        double KG = weight / 2.205;// lbs to kg
        double Lbs = KG * 2.205; // kg to lbs

        String nationality1 = "American";
        String nationality2 = "Swiss";
        String sex = "Male";
        String lifeStyle = "Vegan";

        boolean doubleNationality =  nationality1 == "American" || nationality2 == "!Swiss";
        boolean doubleNationality1 = nationality1 == "American" && nationality2 == "American";

        if (height <= 70  &&  weight <= 168) {
            System.out.println("\nOh, looks like you are " + (int)CM + " cm tall, or " + (int)Inch + " (inches). So glad you're taller than me. I will need to grab my heels. \nWow, look at that body, your weight is " + (int)KG +" KG, or " + (int)Lbs + " (Lbs)." + " I def want some beach photos with you.");
        }
        if (nationality1 == "American" || nationality2 == "Swiss") {
            System.out.println("No double nationality? = " + doubleNationality + ". Oh well, it's ok. Either one works. So you are swiss? = " + doubleNationality1+ ". No worries, we can still hang out.");
        }
        if (sex !="Female"){
            System.out.println("My ideal partner is " + sex+ ".");
        }
        if (lifeStyle =="Vegan" || lifeStyle == "Vegetarian") {
            System.out.println("Yesssss, I am soooo glad you like veggies too. \nIt seems I just matched with you and this is crazy.. But here's my number, so call me maybe. 240.421.XXXX.");
        }

    }
}
