package Task4;


public class Circle implements Shape {
    private double radius;

    //4.2 - A constructor that takes one parameter radius
    public Circle(double radius) {
        this.radius = radius;
    }

    //4.3 - A method called getArea that returns the area of a circle
    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }
}

