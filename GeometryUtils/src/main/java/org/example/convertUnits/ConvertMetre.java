package org.example.convertUnits;

public class ConvertMetre {

    private ConvertMetre() {
    }

    public static Double toCentimetre(Double metre) {
        return metre * 100;
    }

    public static Double toMillimetre(Double metre) {
        return metre * 1000;
    }

    public static Double toKilometre(Double metre) {
        return metre / 1000;
    }
}
