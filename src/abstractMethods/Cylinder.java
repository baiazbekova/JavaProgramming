package abstractMethods;

public class Cylinder extends Shape implements Volume{
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }
}
