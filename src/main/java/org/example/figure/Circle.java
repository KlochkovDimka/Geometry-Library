package org.example.figure;

public class Circle extends Figure {

    public Circle(int a) {
        super(a, 0);
    }

    @Override
    public Double getSquare() {
        return Math.PI * (a * a);
    }

    @Override
    public Double getPerimeter() {
        return 2 * Math.PI * a;
    }
}
