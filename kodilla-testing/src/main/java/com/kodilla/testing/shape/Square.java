package com.kodilla.testing.shape;

public class Square implements Shape {
    double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        if (a > 0) {
            double result = Math.sqrt(a);
            return result;
        } else {
            return 0;
        }
    }
}
