package com.example.decorator;

public class SportCar extends CarDecorator {

    public SportCar(Car car){
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        hp=50;
        System.out.println("Add sport pack");
    }
}
