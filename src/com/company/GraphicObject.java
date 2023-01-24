package com.company;

//This class is used to explain abstraction

public abstract class GraphicObject {
    int x, y;

    void moveTo(int newX, int newY){
        System.out.println("move to x: " + x + "and y: " + y);
    }
    abstract void draw();
    abstract void resize();
}
