package com.emirhan.solid.interfaceSegregation.example.good;

public class Owl implements CanFly,CanWalk,CanEat{
    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void walk() {
        System.out.println("Walking");
    }
}
