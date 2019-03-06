package com.step.assignments;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(10));
        System.out.println(area(2,5));
    }
    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }

    public static double area(double length, double breadth) {
        if (length < 0 || breadth < 0) {
            return -1;
        }
        return length * breadth;
    }
}