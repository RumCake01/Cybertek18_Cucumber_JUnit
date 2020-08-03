package Day12_Switch_Scanner;

import java.util.Scanner;

public class Replit_039_ApartmLeasing {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                System.out.println("Welcome to Cybertek Apartments!");
                System.out.println("Number of bedrooms you are interested:");

                int numberOfBedrooms = scan.nextInt();
                int startingPrice = 0;

                //WRITE YOUR CODE HERE
                String result = "";
                String price = "";
                if(numberOfBedrooms == 1){
                    result = "One Bedroom Selected ";
                    price = "1100";
                    }else if(numberOfBedrooms == 2){
                        result = "Two Bedroom Selected ";
                        price = "1850";
                    }else if(numberOfBedrooms == 3){
                        result ="Three Bedroom Selected ";
                        price = "2550";
                    }else{
                        result = "No such Bedrooms available ";
                    }
                    System.out.println(result + " Starting price: "+ price);

                }
            }

