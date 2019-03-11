package com.step.day4;

public class Ferrari extends Car{
    private String model;

    public Ferrari(double speed, int gear, String model) {
        super(speed, gear, "Ferrari");
        this.model = model;
    }
}
