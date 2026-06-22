package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AAASetupTeardownTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("Setup completed.");
    }

    @Test
    void testAddition() {

        // Arrange
        int a = 10;
        int b = 20;

        
        int result = calculator.add(a, b);

        
        assertEquals(30, result);
    }

    @Test
    void testSubtraction() {

        
        int a = 20;
        int b = 10;

        
        int result = calculator.subtract(a, b);

        
        assertEquals(10, result);
    }

    @AfterEach
    void tearDown() {
        calculator = null;
        System.out.println("Teardown completed.");
    }
}