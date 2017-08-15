package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("beginning of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("all tests are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(6);
        ;
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(circle, shapeCollector.getFigure(0));
    }

    @Test
    public void getFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(6);
        shapeCollector.addFigure(circle);
        //When
        Shape retrivedFigure = shapeCollector.getFigure(0);
        //Then
        Assert.assertSame(circle, retrivedFigure);

    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(6);
        shapeCollector.addFigure(circle);
        //When
        boolean result = shapeCollector.removeFigue(circle);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testShowFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(6);
        shapeCollector.addFigure(circle);
        //When
        shapeCollector.showFigures();
        //Then
        Assert.assertTrue("Cannot assert void return type", true);
    }
}
