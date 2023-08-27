package practice;

import java.sql.SQLOutput;

public class CustomeMethod_Parameters {
    public static void main(String[] args) {
        displayValue(7);
        eligibleToVote(18, true);
        eligibleToVote(5, true);
        oddOrEven(36);
    }



    public static void displayValue (int num){

        System.out.println("The value is: "+ num); //7
    }

    public static void eligibleToVote (int age, boolean isUSCitizen){

        if (age>=18 && isUSCitizen){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
    }

    public static void oddOrEven (int num1){
        if (num1%2 == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }

    }

}
