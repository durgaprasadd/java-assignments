package com.step.assignments;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double width, double length) {
        if (length<0){
            length = 0;
        }
        if (width<0){
            width = 0;
        }
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double getArea(){
        return this.length*this.width;
    }
}
