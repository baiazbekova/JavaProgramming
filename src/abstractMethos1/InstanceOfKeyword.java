package abstractMethos1;

import abstractMethods.Circle;
import abstractMethods.Rectangle;
import abstractMethods.Shape;
import abstractMethods.Square;

public class InstanceOfKeyword {

    public static void main(String[] args) {

        Shape shape1 = new Circle();

        Shape shape2 = new Rectangle();

        Shape shape3 = new Square();

        if (shape1 instanceof Circle){
            System.out.println("it is a circle");
        }else{
            System.out.println("it's not a circle");
        }

        if(shape2 instanceof Rectangle){
            System.out.println("it is a rectangle");
        }else{
            System.out.println("it's not a rectangle");
        }

        if(shape3 instanceof Circle){
            System.out.println("it is a circle");
        }else{
            System.out.println("its not a circle");
        }
    }
}
