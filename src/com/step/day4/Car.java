package com.step.day4;

public class Car extends Vehicle {
    private int gear;
    private String company;

    public Car(double speed, int gear,String company) {
        super(speed,4);
        this.gear = gear;
        this.company = company;
    }
    public void changeGear(int gear){
        this.gear+= gear;
    }
}
