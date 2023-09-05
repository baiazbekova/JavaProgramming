package practice;

import java.sql.Array;
import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {
        //1- create a variable named numbers that can have 5 integers
        int [] numbers = new int [5];
        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=40;
        numbers[4]=50;

        System.out.println(Arrays.toString(numbers)); //[10, 20, 30, 40, 50]

        //2 - create a variable named colors that has: yellow, red, white, blue, green, black

        String [] colors = {"yellow", "red", "white","blue","green","black"};

        System.out.println(colors.length);
        System.out.println(Arrays.toString(colors));

    }
}
