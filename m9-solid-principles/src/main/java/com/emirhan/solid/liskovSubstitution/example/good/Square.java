package com.emirhan.solid.liskovSubstitution.example.good;

public class Square implements Shape{

    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return this.side * this.side;
    }
}
