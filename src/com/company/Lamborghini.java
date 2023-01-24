package com.company;

public class Lamborghini implements Cars {

    private int tyreHeight;
    private int gear;
    private int speed;
    public Lamborghini(int tyreHeight, int gear, int speed){
        this.tyreHeight = tyreHeight;
        this.gear = gear;
        this. speed = speed;
    }

    @Override
    public void applyBrake(int decrement) {

    }

    @Override
    public void speedUp(int increment) {

    }
}
