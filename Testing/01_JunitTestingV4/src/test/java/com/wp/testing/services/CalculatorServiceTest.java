package com.wp.testing.services;

import org.junit.*;

import java.util.Date;

public class CalculatorServiceTest {

    @BeforeClass
    public static void init(){
        System.out.println("Before all test cases!!");
        System.out.println("Started test: " + new Date());
    }
    //test method of addTwoNumbers
    @Test(timeout = 2000)
    public void addTwoNumbersTest() throws InterruptedException {
        System.out.println("Test for add two numbers");
        Thread.sleep(3000);
        int actualResult = CalculatorService.addTwoNumbers(12, 45);
        int expectedResult = 57;
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void sumAnyNumbersTest(){
        System.out.println("Test for sum any numbers");
        int actualResult = CalculatorService.sumAnyNumbers(10,5,5);
        int expectedResult = 25;
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Before
    public void beforeEach(){
        System.out.println("Before each test case");
    }

    @Test
    public void productTwoNumbers(){
        System.out.println("Test for product two numbers");
        int actualResult = CalculatorService.productTwoNumbers(5, 2);
        int expectedResult = 10;
        Assert.assertEquals(expectedResult,actualResult);
    }

    @After
    public void afterEach(){
        System.out.println("After each test case");
    }

    @Test
    public void divideTwoNumbers(){
        System.out.println("Test for divide two numbers");
        double actualResult = CalculatorService.divideTwoNumbers(10, 2);
        double expectedResult = 5;
        Assert.assertEquals(expectedResult,actualResult, 0.0001);
    }

    @AfterClass
    public static void cleanup(){
        System.out.println("After all test cases!!");
    }

}
