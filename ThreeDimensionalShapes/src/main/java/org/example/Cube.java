package org.example;

import org.example.figure.Figure;

public class Cube extends Figure implements Volume {

    public Cube(int a) {
        super(a, a);
    }

    @Override
    public Double getSquare() {
        return (double) 12 * a;
    }

    @Override
    public Double getPerimeter() {
        return (double) 6 * a * a;
    }

    @Override
    public Double getVolume() {
        return (double) a * a * a;
    }
}
