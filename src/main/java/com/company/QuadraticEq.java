package com.company;


public class QuadraticEq {
    private double x1, x2;
    public double[] quadraticEq(double a, double b, double c){
        double dis = 0;
        double[] returnArray = new double[2];

        dis = b*b - (4*a*c);
        if (dis > 0) {
            x1 = (-b + Math.sqrt(dis)) / (2 * a);
            x2 = (-b - Math.sqrt(dis)) / (2 * a);
            returnArray[0] = x1;
            returnArray[1] = x2;





        }
        else if (dis == 0){
            x1 = (-b) / (2 * a);
            returnArray[0] = x1;
        }
        else {
            returnArray[0] = ' ';
            return returnArray;
        }
        return returnArray;
    }

}
