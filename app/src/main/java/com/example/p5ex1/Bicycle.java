package com.example.p5ex1;

public class Bicycle extends Vehicle{
    @Override
    public void start(){
        System.out.println("the bicycle started driving");
    }
    @Override
    public void Stop(){
        System.out.println("the bicycle stopped driving");
    }
    @Override
    public void Eccelerate(){
        System.out.println("the bicycle speed up");
    }
}