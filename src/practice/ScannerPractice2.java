package practice;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);


        System.out.println("please enter first name");
        String str = input.nextLine();

        System.out.println("please enter last name");
        input.next();

    }
}
