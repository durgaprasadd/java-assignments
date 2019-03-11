package com.step.day4;
public class Vehicle {
    private double speed;
    private int wheels;

    public Vehicle(double speed,int wheels) {
        this.speed = speed;
        this.wheels = wheels;
    }
    public void increaseSpeed(double speed){
        this.speed += speed;
    }
    public void decreaseSpeed(double speed){
        this.speed -= speed;
    }

    public double getSpeed() {
        return speed;
    }
    public void printSpeed(){
        System.out.println(this.speed);
    }
}
