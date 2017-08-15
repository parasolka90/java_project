package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before

    public void before() {
        System.out.println("Test case: begin");
    }
    @After
    public void after() {
        System.out.println("Test case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator odd = new OddNumbersExterminator();
        ArrayList<Integer> list1 = new ArrayList<>();
        //When
        ArrayList<Integer> result = odd.exterminate(list1);
        System.out.println("Testing empty list" + result);
        //Then
        Assert.assertEquals(list1,result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator odd = new OddNumbersExterminator();
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        //When
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(2);
        ArrayList<Integer> result = odd.exterminate(list2);
        System.out.println("Testing normal list "+result);
        //Then
        Assert.assertEquals(list3,result);
    }
}
