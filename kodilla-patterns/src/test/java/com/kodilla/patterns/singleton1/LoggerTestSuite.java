package com.kodilla.patterns.singleton1;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void log() {
       Logger.getInstance().log("test");
    }
    @Test
    public void testGetLastLog() {
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("LastLog: " + lastLog);
        //Then
        Assert.assertEquals("test", lastLog);
    }
}
