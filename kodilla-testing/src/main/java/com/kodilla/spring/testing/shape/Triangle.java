package com.kodilla.spring.testing.shape;

public class Triangle implements Shape {
    double a;
    double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        if (a > 0 && h > 0) {
            double result = 0.5 * a * h;
            return result;
        } else {
            return 0;
        }
    }
}
