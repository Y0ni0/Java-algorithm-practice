package com.company;

public class MountainBike extends Bicycle{
    public int seatHeight;

    public MountainBike(int startSpeed, int startGear, int startHeight) {
        super(startSpeed, startGear);
        this.seatHeight = startHeight;
    }
    public void setHeight( int newValue){
        seatHeight = newValue;
    }
}
