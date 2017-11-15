package com.kodilla.hibernate.manytomany.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.CompanyDao;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyFacade {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public List<String> findByName(MyDataType myDataType, String name) {
        List<String> resultList = new ArrayList<>();
        switch (myDataType) {
            case COMPANY:
                List<Company> companiesList = companyDao.findCompaniesByName("%"+ name +"%");
                companiesList.stream()
                        .map(company -> resultList.add(company.getName().toString()))
                        .collect(Collectors.toList());
                return resultList;

            case EMPLOYEE:
                List<Employee> employeesList = employeeDao.findEmployeesByName("%"+ name +"%");
                employeesList.stream()
                        .map(employee -> resultList.add(employee.getFirstname() + " " + employee.getLastname()))
                        .collect(Collectors.toList());

                return resultList;

        }
        return new ArrayList<>();
    }

    public enum MyDataType {
        COMPANY,EMPLOYEE
    }
}
