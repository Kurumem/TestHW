package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double result;
        result = calc.sum(25,40);
        System.out.println(result);
        result = calc.sub(25,40);
        System.out.println(result);
        result = calc.mul(25,40);
        System.out.println(result);
        result = calc.div(25,40);
        System.out.println(result);

        QuadraticEq quadraticEq = new QuadraticEq();
        quadraticEq.quadraticEq(1,-5,9);




    }
}
