package com.example.decorator;

public class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car car){
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        hp=23;
        System.out.println("Add Luxury");
    }
}
