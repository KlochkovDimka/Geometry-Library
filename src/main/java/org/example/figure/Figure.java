package org.example.figure;

public abstract class Figure {

    protected final int a;
    protected final int b;

    public Figure(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public abstract Double getSquare();

    public abstract Double getPerimeter();
}
