package org.example;

import org.example.figure.Figure;

public class Cube extends Figure {

    public Cube(int a) {
        super(a, a);
    }

    @Override
    public Double getSquare() {
        return (double) 12 * a;
    }

    @Override
    public Double getPerimeter() {
        return (double)6 * a * a;
    }
}
