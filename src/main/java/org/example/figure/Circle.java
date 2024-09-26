package org.example.figure;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Figure {

    public Circle(int a) {
        super(a, 0);
    }

    @Override
    public Double getSquare() {
        BigDecimal result = new BigDecimal(Math.PI * (a * a));
        return result.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public Double getPerimeter() {
        BigDecimal result = new BigDecimal(2 * Math.PI * a);
        return result.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
