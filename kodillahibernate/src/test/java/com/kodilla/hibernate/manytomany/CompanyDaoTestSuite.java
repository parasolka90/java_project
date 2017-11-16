package com.kodilla.hibernate.manytomany;

import com.kodilla.hibernate.manytomany.manytomany.facade.CompanyFacade;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static com.kodilla.hibernate.manytomany.manytomany.facade.CompanyFacade.MyDataType.COMPANY;
import static com.kodilla.hibernate.manytomany.manytomany.facade.CompanyFacade.MyDataType.EMPLOYEE;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    private CompanyFacade facade;

    Employee johnSmith;
    Employee stephanieClarckson;
    Employee lindaKovalsky;

    Company softwareMachine;
    Company dataMaesters;
    Company greyMatter;

    @Before
    public void before() {

        johnSmith = new Employee("John", "Smith");
        stephanieClarckson = new Employee("Stephanie", "Clarckson");
        lindaKovalsky = new Employee("Linda", "Kovalsky");

        softwareMachine = new Company("Software Machine");
        dataMaesters = new Company("Data Maesters");
        greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);
    }

    @Test
    public void testSaveManyToMany() {

        //Given & When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e) {
            System.out.println("records not found");
        }
    }

    @Test
    public void testEmployeeNamedQuery() {

        //Given
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //When
        String testName = "Smith";
        List<Employee> resultList = employeeDao.retrieveEmployeeByLastname(testName);

        //Then
        Assert.assertEquals(testName, resultList.get(0).getLastname());
        Assert.assertEquals(3, resultList.size());

        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e) {
            System.out.println("records not found");
        }
    }

    @Test
    public void testCompanyNamedQuery() {

        //Given
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //When
        List<Company> resultList1 = companyDao.retrieveCompaniesStartWith("Sof");
        List<Company> resultList2 = companyDao.retrieveCompaniesStartWith("rey");

        //Then
        Assert.assertEquals(softwareMachine.getName(), resultList1.get(0).getName());
        Assert.assertTrue(resultList2.isEmpty());

        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e) {
            System.out.println("records not found");
        }
    }

    @Test
    public void testCompanyFacade() {
        //Given & When
        List<String> companies = facade.findByName(COMPANY,"Soft");
        List<String> employees = facade.findByName(EMPLOYEE,"Smit");

        //Then
        for (String entry : companies) {
            Assert.assertEquals("Software Machine", entry);
        }
        for (String entry : employees) {
            Assert.assertEquals("John Smith", entry);
        }
    }
}
