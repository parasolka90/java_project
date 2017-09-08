package com.kodilla.spring.testing.shape;

import java.lang.*;
import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public boolean removeFigue(Shape shape) {
        boolean result = false;
        if (figures.equals(shape)) {
            figures.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape shape = null;
        if (n >= 0 && n < figures.size()) {
            shape = figures.get(n);
        }
        return shape;
    }

    public void showFigures() {
        for (Shape shape : figures) {
            System.out.println(shape.getShapeName() + " " + shape.getField());
        }
    }
}
