package Task4;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Shape c1 = new Circle (5.0);
        Shape s1 = new Square (6.0);


        //4.1 - Testing the getArea() methods from Circle and Square class
        System.out.println("Area of Circle: " + c1.getArea());
        System.out.println("Area of Square: " + s1.getArea());



        //4.4 - Testing the getTotalArea() from the class ShapeBuilder
        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShape(c1);
        shapeBuilder.addShape(s1);
        System.out.println(shapeBuilder.getTotalArea());

    }
}
