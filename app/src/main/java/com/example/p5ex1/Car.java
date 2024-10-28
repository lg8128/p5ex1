package com.example.p5ex1;

public class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("the car started driving");
    }
    @Override
    public void Stop(){
        System.out.println("the car stopped driving");
    }
    @Override
    public void Eccelerate(){
        System.out.println("the car speed up");
    }
}
