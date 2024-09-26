package org.example.figure;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle extends Figure {

    protected int c;

    public Triangle(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public Double getSquare() {
        double p = getPerimeter() / 2;
        p = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        BigDecimal result = new BigDecimal(p);
        return result.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public Double getPerimeter() {
        return (double) a + b + c;
    }
}
