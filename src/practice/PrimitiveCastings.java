package practice;

public class PrimitiveCastings {

    public static void main(String[] args) {
        //implicit casting - small to large primitive types
        int a = 100;
        double b = a;

        System.out.println(a);
        System.out.println(b);

        //explicit casting - larger to smaller primitive types
        double x = 20.5;
        int y = (int) x;

        System.out.println(x); //20.5
        System.out.println(y); //20


    }
}
