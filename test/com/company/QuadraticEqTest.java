package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEqTest {

    @Test
    void quadraticEqPos() {
        QuadraticEq Quad = new QuadraticEq();

        Quad.quadraticEq(1,3,-4);


        assertEquals(Quad.getX1(),1);
        assertEquals(Quad.getX2(),-4);
    }

    @Test
    void quadraticEqNull() {
        QuadraticEq Quad = new QuadraticEq();

        Quad.quadraticEq(1,-4,4);

        assertEquals(Quad.getX1(),2);
    }

    @Test
    void quadraticEqNeg(){
        QuadraticEq Quad = new QuadraticEq();

        int negative = Quad.quadraticEq(1,-5,9);

        assertEquals(negative,0);
    }





}