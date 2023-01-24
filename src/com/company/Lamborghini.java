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
        speed = speed - decrement;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }
    public int getTyreHeight(){
        return tyreHeight;
    }
    public void setTyreHeight(int tyreHeight){
        this.tyreHeight = tyreHeight;
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getGear(){
        return gear;
    }
    public void setGear(int gear){
        this.gear = gear;
    }
}
