package org.example.figure;

public class Rectangle extends Figure {

    public Rectangle(int a, int b) {
        super(a, b);
    }

    @Override
    public Double getSquare() {
        return (double) a * b;
    }

    @Override
    public Double getPerimeter() {
        return (double) 2+(a+b);
    }
}
