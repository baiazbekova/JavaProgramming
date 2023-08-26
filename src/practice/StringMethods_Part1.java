package practice;

import javax.sound.midi.Soundbank;

public class StringMethods_Part1 {

    public static void main(String[] args) {

        //charAt
        String str = "Cydeo";
        char ch1 = str.charAt(2);
        System.out.println(ch1);

        //length
        String str2 = "Wooden spoon";
        int n1 = str2.length();
        System.out.println(n1);
        int lastIndex = str2.length()-1;
        System.out.println(lastIndex);

        //toLowerCase
        String str3 = "WOODEN SPOON";
        String str10 = str3.toLowerCase();
        System.out.println(str10);

        //toUpperCase
        String str4 = "wooden spoon";
        String str5 = str4.toUpperCase();
        System.out.println(str5);

        //trim
        String str6 = "      Java Programming   Language";
       str6 = str6.trim();
        System.out.println(str6);

        //indexOf
        String str7 = "Wooden Spoon";
        int indexNumber = str7.indexOf("o");
        System.out.println(indexNumber);
        int indexNumberOfSecondO = str7.indexOf("od");

        //lastIndexOf
        String str8 = "Wooden Spoon";
        int indexNumberOfLastO = str8.lastIndexOf("o");
        System.out.println(indexNumberOfLastO);



    }
}
