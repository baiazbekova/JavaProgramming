package practice;

public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println(sum(3,4));
        System.out.println(sum(3,4,5));
        System.out.println(sum (2.3, 2.5, 2.6)+ 2.9);
    }


    public static  int sum (int a, int b){
        return a+b;
    }
    public static double sum (double v, double a, double b){
        return  a+b;
    }
    public static int sum (int a, int b, int c){
        return a+b+c;
    }

    public static double sum (double a, double b, double c, double d){
        return sum(a, b, c) +d;
    }
}
