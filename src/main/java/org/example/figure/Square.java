package org.example.figure;

public class Square extends Figure {

    public Square(int a) {
        super(a, a);
    }

    @Override
    public Double getSquare() {
        return (double) a * a;
    }

    @Override
    public Double getPerimeter() {
        return (double) a * 2;
    }
}
