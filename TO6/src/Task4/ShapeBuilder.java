package Task4;

import java.util.ArrayList;

public class ShapeBuilder {

    //4.2 - An ArrayList named shapes that can hold Shape object
    private ArrayList<Shape> shapes;


    public ShapeBuilder() {
        shapes = new ArrayList<>();
    }

    //4.3 - A method named addShape that can add shapes to the ArrayList shapes
    public void addShape(Shape s) {
        shapes.add(s);
    }

    //4.4 - A method named getTotalArea() that returns the area of all all the shapes in the ArrayList shapes
    public double getTotalArea() {
        double totalArea = 0.0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }


}