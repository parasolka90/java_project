package com.kodilla.testing;

import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Triangle;


public class TestingMain {
    public static void main(String[] args) {
        ShapeCollector shape = new ShapeCollector();
        shape.addFigure(new Circle(6));
        shape.addFigure(new Triangle(4, 8));

        shape.showFigures();
    }
}
