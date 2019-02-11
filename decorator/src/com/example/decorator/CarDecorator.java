package com.example.decorator;

public class CarDecorator implements Car {

    protected Car car;
    protected boolean hasAC=false;
    protected int hp;

    public CarDecorator(Car car){
        this.car=car;
    }

    @Override
    public int getHP(){
        return car.getHP()+hp;
    }

    @Override
    public void assemble() {
        car.assemble();
    }
}
