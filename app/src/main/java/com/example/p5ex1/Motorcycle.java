package com.example.p5ex1;

public class Motorcycle extends Vehicle {
    @Override
    public void start(){
        System.out.println("the motorcycle started driving");
    }
    @Override
    public void Stop(){
        System.out.println("the motorcycle driving driving");
    }
    @Override
    public void Eccelerate(){
        System.out.println("the motorcycle speed up");
    }
}
