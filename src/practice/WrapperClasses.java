package practice;

public class WrapperClasses {
    public static void main(String[] args) {
        byte a = 10;
        short b = 20;
        int c = 30;


        //Autoboxing
        Byte x =  a;
        Short y = b;
        Integer z = c;

        //unboxing
        byte q =x;


        //parse methods
        String str = "123";
        Integer.parseInt(str);

        //valueOf
        String str2 = "1.5";
        Double.valueOf(str2);


    }
}
