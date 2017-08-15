package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;

public class TestingMain {
    public static void main(String[]args) {
        ArrayList<Integer> number = new ArrayList<>();
        OddNumbersExterminator num = new OddNumbersExterminator();
        number.add(4);
        number.add(5);
        number.add(7);
        number.add(8);
        number.add(3);
        System.out.println(num.exterminate(number));
    }
}
