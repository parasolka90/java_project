package com.kodilla.patterns2.adapter;

import com.kodilla.patterns2.adapter.salary.converter.SalaryAdapter;
import com.kodilla.patterns2.adapter.salary.oldhrsystem.Workers;
import org.junit.Assert;
import org.junit.Test;

public class SalaryAdapterTestSuite {
    @Test
    public void testTotalSalary() {
        //Given
        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter();
        //When
        double totalSalary = salaryAdapter.totalSalary((workers.getWorkers()), workers.getSalaries());
        //Then
        System.out.println(totalSalary);
        Assert.assertEquals(27750, totalSalary, 0);
    }
}
