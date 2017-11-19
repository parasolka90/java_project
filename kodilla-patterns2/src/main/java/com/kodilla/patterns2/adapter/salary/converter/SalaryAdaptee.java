package com.kodilla.patterns2.adapter.salary.converter;

import com.kodilla.patterns2.adapter.salary.newhrsystem.CompanySalaryProcessor;
import com.kodilla.patterns2.adapter.salary.newhrsystem.Employee;
import com.kodilla.patterns2.adapter.salary.newhrsystem.SalaryProcessor;

import java.math.BigDecimal;
import java.util.List;

public class SalaryAdaptee implements SalaryProcessor {
    @Override
    public BigDecimal calculateSalaries(List<Employee> employees) {
        CompanySalaryProcessor theProcessor = new CompanySalaryProcessor();
        return theProcessor.calculateSalaries(employees);
    }
}
