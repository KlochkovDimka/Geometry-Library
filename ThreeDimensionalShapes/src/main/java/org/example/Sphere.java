package org.example;

import org.example.figure.Figure;

public class Sphere extends Figure implements Volume {

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

    @Override
    public Double getVolume() {
        return (double) (4 / 3) * Math.PI * (a * a * a);
    }
}
