package com.step.assignments;

public class Wall {
    private double width;
    private double height;
    public Wall(){}

    public Wall(double width, double height) {
        this.setHeight(height);
        this.setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width <0){
            this.width = 0;
            return;
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<0){
            this.height=0;
            return;
        }
        this.height = height;
    }
    public double getArea(){
        return this.height*this.width;
    }
}
