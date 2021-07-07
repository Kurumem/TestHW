package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEqTest {

    @Test
    void quadraticEqPos() {
        QuadraticEq Quad = new QuadraticEq();

        double[] testArray = {1,-4};
        double[] array = Quad.quadraticEq(1,3,-4);

        assertArrayEquals(array,testArray);




    }

    @Test
    void quadraticEqNull() {
        QuadraticEq Quad = new QuadraticEq();

        double[] array = Quad.quadraticEq(1,-4,4);

        assertEquals(array[0],2);
    }

    @Test
    void quadraticEqNeg(){
        QuadraticEq Quad = new QuadraticEq();

        double[] negative = Quad.quadraticEq(1,-5,9);

        assertEquals(negative[0],' ');
    }





}