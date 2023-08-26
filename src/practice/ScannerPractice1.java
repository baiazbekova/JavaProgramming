package practice;

import java.util.Scanner;

public class ScannerPractice1 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        //Ask user to enter integer number
        System.out.println("Please enter an integer number");
        int number = input.nextInt(); //method will take integer input


        //Ask user to enter a decimal number
        System.out.println("Please enter a decimal number");
        double number1 = input.nextDouble();

        //ask user to enter word
        System.out.println("please enter a word");
        String str = input.next();

        System.out.println("number is "+ number);
        System.out.println("decimal is "+ number1);
        System.out.println("string is "+ str);

    }
}
