package practice1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {
//        System.out.println("Hello, World");
//        throw  new ArithmeticException("Wrong calculation");


        System.out.println("Enter age");
        int age = new Scanner(System.in).nextInt();
        if (age<0 || age >130){
            throw new InputMismatchException("Invalid age "+ age);
        }
        System.out.println("Age is "+ age);
    }
}
