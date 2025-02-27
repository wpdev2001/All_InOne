package com.wp.testing.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AssertExample {

    @Test
    public void assertDemo(){
//        Assertions on list
//        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
//        List<Integer> list2 = Arrays.asList(1,2,3,4,5);
//
//        Assertions.assertIterableEquals(list1,list2);
//        For this method we have specify exactly what type of exception is gonna be thrown. Like in this case it is RuntimeException
        Assertions.assertThrows(RuntimeException.class,() -> {
//            throw new RuntimeException("This is testing exception"); -->After commenting this, it will throw an error
            System.out.println("This is just for testing");
        });
    }



}
