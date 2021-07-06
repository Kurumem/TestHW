package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() {
        Calculator calculator = new Calculator();

        double value = calculator.sum(25,40);

        assertEquals(65,value);
    }

    @Test
    void sub() {
        Calculator calculator = new Calculator();

        double value = calculator.sub(25,40);

        assertEquals(-15,value);
    }

    @Test
    void mul() {
        Calculator calculator = new Calculator();

        double value = calculator.mul(25,40);

        assertEquals(1000,value);
    }

    @Test
    void div() {
        Calculator calculator = new Calculator();

        double value = calculator.div(25,40);

        assertEquals(0.625,value);
    }
}
