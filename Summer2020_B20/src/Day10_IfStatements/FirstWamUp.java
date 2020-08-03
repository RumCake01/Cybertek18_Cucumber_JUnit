package Day10_IfStatements;

public class FirstWamUp {
    public static void main(String[] args) {
        /*
        1. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
Write a program that declares three integers as angles and check whether a triangle
is valid or not*/

        int angle1 = 75;
        int angle2 = 75;
        int angle3 = 30;

        int totalSum = (angle1 + angle2 + angle3);

        if(totalSum == 180){
            System.out.println("\n this is a valid triangle");
        }else{
            System.out.println(" \n doesn't look like a triangle ");
        }

        /*
        write a program that can check if the two characters (chars) are same characters
            if same, print: "Same characters"
            otherwise, print: "Different characters"
         */

        char first = 'Y';
        char second = 'Z';
        boolean compare = 'Y' == 'Z';
        if (compare){
            System.out.println("\nThese characters are the same");
        }else{
            System.out.println(" \nthese are two different characters");
        }

        /*
        task 3. SDET Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,  2004-2006 and 2015-2017.
         wirte a program that can check if the vehicle is eligible to recall.
        if eligible, print: true
        otherwise: false

         */
            int vehicleModel = 2005;
            if (vehicleModel >= 1995 && vehicleModel <= 1998) {
                System.out.println("True");
            }
            else if (vehicleModel >= 2001 && vehicleModel <= 2002){
                System.out.println("True");
            }
            else if (vehicleModel >= 2004 && vehicleModel <= 2006){
                System.out.println("True");
            }
            else if (vehicleModel >= 2015 && vehicleModel <= 2017){
                System.out.println("True");
            }
            else {
                System.out.println("\nFalse");
            }
        }
    }