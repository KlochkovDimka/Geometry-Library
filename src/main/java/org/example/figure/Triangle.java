package org.example.figure;

public class Triangle extends Figure {

    protected int c;

    public Triangle(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public Double getSquare() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public Double getPerimeter() {
        return (double) a + b + c;
    }
}
