package com.wp.testing.services;

import org.junit.jupiter.api.*;

public class CalculatorServiceTest {

    @BeforeAll
    public static void init(){
        System.out.println("This method will get executed before all methods and used for initialisation");
    }

    @Test
    @DisplayName("This is add test")
    public void addTwoNumbersTest(){
        System.out.println("Add two numbers test");
        int actualResult = CalculatorService.addTwoNumbers(10, 20);
        int expectedResult = 30;
        Assertions.assertEquals(expectedResult, actualResult, "Test failed");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("Runs Before Each Test Case");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("Runs After Each Test Case");
    }

    @Test
    public void sumAnyNumbersTest(){
        System.out.println("Sum any numbers test");
        int actualResult = CalculatorService.sumAnyNumbers(5,5,5,5);
        int expectedResult = 20;
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
//    @Disabled
    public void productTwoNumbers(){
        System.out.println("product two numbers test");
        int actualResult = CalculatorService.productTwoNumbers(5,2);
        int expectedResult = 20;
        Assertions.assertSame(expectedResult,actualResult);
    }

    @Test
    public void divideTwoNumbersTest(){
        System.out.println("Divide two numbers test");
        double actualResult = CalculatorService.divideTwoNumbers(10,2);
        int expectedResult = 5;
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @AfterAll
    public static void closingMethod(){
        System.out.println("This method is used for closing connections!!");
    }

}
