package com.kodilla.spring.exception.challenge;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            firstChallenge.divide(3, 0);
        } catch (ArithmeticException ae) {
            System.out.println("Division by zero. Error: " + ae);
        } finally {
            System.out.println("finally");
        }

    }
}