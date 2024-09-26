package org.example;

import org.example.figure.Figure;

public class Sphere extends Figure {

    public Sphere(int a) {
        super(a, 0);
    }

    @Override
    public Double getSquare() {
        return 4 * Math.PI * a * a;
    }

    @Override
    public Double getPerimeter() {
        return null;
    }
}
