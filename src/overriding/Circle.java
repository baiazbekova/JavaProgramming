package overriding;

public class Circle extends Shape {

    public double radius;
    public static double pi = 3.14;

    @Override
    public double area() {
        return pi*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }


}
