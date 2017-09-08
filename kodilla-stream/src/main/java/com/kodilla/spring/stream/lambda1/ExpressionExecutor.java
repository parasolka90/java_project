package com.kodilla.spring.stream.lambda1;

public class ExpressionExecutor {
    public void executeExpression(double a, double b,MathExpression mathExpression){
        double result = mathExpression.calculateExpression(a,b);
        System.out.println("Result: "+result);
    }
}
