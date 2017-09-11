package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
        public void testCalculatorAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double sum = calculator.add(5.6,2.1);
        double difference = calculator.sub(5.6,2.1);
        double product = calculator.mul(5.6,2.1);
        double quotient = calculator.div(5.6,2.1);
        //Then
        Assert.assertEquals(7.7,sum,0.1);
        Assert.assertEquals(3.5,difference,0.1);
        Assert.assertEquals(11.7,product,0.1);
        Assert.assertEquals(2.66,quotient,0.1);
    }


}
