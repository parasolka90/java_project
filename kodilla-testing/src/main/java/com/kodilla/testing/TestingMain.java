package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculate = new Calculator();
        int addingResult =calculate.add(2,2);
        int subtractingResult =calculate.substract(2,2);


        if(addingResult == 4){
            System.out.print("adding test ok");
        } else {
            System.out.println("adding test - error!");
        }
        System.out.println("");

        if(subtractingResult == 0){
            System.out.println("subtracting - test ok");
        } else {
            System.out.println("subtracting  test - error!");
        }
    }
}
