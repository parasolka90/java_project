package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList exterminate(ArrayList<Integer> number) {
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < number.size(); i++) {
            if (number.get(i) % 2 == 0) {
            odd.add(number.get(i));
            }
        }
        return odd;
    }
}
