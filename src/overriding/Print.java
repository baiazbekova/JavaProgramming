package overriding;

public class Print {
    public static void main(String[] args) {

       Circle circle = new Circle();
        circle.radius = 10;

        System.out.println( circle.area());

    }
}
