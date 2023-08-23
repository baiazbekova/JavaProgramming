package practice;

public class Number {

    int num1 = 6;
    static int num2 =10;

    public static void main(String[] args) {
        Number s1 = new Number();
        Number s2 = new Number(); //28
        s1.num1 = 15;
        s1.num2 = 17;

        s2.num1 = 22;
        s2.num2 = 28;

        System.out.println(s1.num1 + "" + s1.num2++ + "" + ++s2.num1+ ""+ ++s2.num2);
        //                 15             28                    22             28
        //                 15            28                     23             30

        // ++num2 pre increment
        // num2++ post increment


    }
}
