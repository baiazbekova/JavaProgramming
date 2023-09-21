package abstractMethos1;

import abstractMethods.*;

public class PolymorphismIntro {

    public static void main(String[] args) {

        Shape shape1 = new Circle();
        shape1.area(); //this method is coming from Shape class
        //shape1.radius = 10; //we can't use it, because radius is not in Shape class but in Circle class

        Shape shape2 = new Cube();
        shape2.area();
        //shape2.volume = 20; //it will give error

        Shape shape3 = new Rectangle();
        shape3.area();

        Square square1 = new Square();
        square1.side = 10;
        System.out.println(square1.area());

        Circle circle2 = new Circle();
        Rectangle rectangle1 = new Rectangle();



        Shape[] shape = {circle2, shape1, shape2, shape3, rectangle1, square1};

        //using Interface
        Volume obj1 = new Cube();
        obj1.volume();
        Volume obj2 = new Cylinder();
        obj2.volume();




    }
}
