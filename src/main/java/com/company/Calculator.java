package com.company;


import java.io.IOException;

public class Calculator {
    public double sum(double x, double y){
        return x + y;
    }
    public double sub(double x, double y){
        return x - y;
    }
    public double mul(double x, double y){
        return x * y;
    }
    public double div(double x, double y) throws IOException {
        if (y == 0){
            throw new IOException("Нельзя делить на ноль");
        }
        return x / y;
    }

}