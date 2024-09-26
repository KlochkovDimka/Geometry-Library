package org.example.comparing;

import org.example.figure.Figure;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Comparing {
    private Comparing() {
    }

    public static void comparingPerimeter(Figure figureOne, Figure figureTwo) {
        BigDecimal result;
        if (figureOne.getPerimeter() > figureTwo.getPerimeter()) {
            result = BigDecimal.valueOf(figureOne.getPerimeter() - figureTwo.getPerimeter())
                    .setScale(2, RoundingMode.HALF_UP);

            System.out.printf("Периметр фигуры 1 больше периметра фигуры 2 на: %s\n", result.doubleValue());
        } else {
            result = BigDecimal.valueOf(figureTwo.getPerimeter() - figureOne.getPerimeter())
                    .setScale(2, RoundingMode.HALF_UP);

            System.out.printf("Периметр фигуры 2 больше периметра фигуры 1 на: %s\n", result.doubleValue());
        }
    }

    public static void comparingArea(Figure figureOne, Figure figureTwo) {
        BigDecimal result;
        if (figureOne.getSquare() > figureTwo.getSquare()) {
            result = BigDecimal.valueOf(figureOne.getSquare() - figureTwo.getSquare())
                    .setScale(2, RoundingMode.HALF_UP);

            System.out.printf("Периметр фигуры 1 больше периметра фигуры 2 на: %s\n", result.doubleValue());
        } else {
            result = BigDecimal.valueOf(figureTwo.getSquare() - figureOne.getSquare())
                    .setScale(2, RoundingMode.HALF_UP);

            System.out.printf("Периметр фигуры 2 больше периметра фигуры 1 на: %s\n", result.doubleValue());
        }
    }
}