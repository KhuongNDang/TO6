package Task4;

import java.sql.SQLOutput;

public class Square implements Shape {
    private double sideLength;

    //4.2 - A constructor that takes one parameter sideLength
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    //4.3 - A method called getArea that returns the area of a square
    @Override
    public double getArea() {
        return sideLength * sideLength;

    }
}