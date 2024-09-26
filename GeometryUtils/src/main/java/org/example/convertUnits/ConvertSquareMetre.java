package org.example.convertUnits;

public class ConvertSquareMetre {

    private ConvertSquareMetre() {
    }

    public static Double toSquareCentiMetre(Double squareMetre) {
        return squareMetre * 10000;
    }

    public static Double toSquareMillimetre(Double squareMetre) {
        return squareMetre * 1000000;
    }

    public static Double toSquareKilometer(Double squareMetre) {
        return squareMetre / 1000000;
    }
}
