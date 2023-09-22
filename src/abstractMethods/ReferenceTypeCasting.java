package abstractMethods;

public class ReferenceTypeCasting {

    public static void main(String[] args) {


        //upcasting
        Shape shape1 = new Square();

        //downcasting
        Shape shape2 = new Cube();
        System.out.println(shape2.area());
        System.out.println( (  (Cube) shape2).volume());

        System.out.println((  (Cylinder)shape2).volume()); // .ClassCastException



    }
}
