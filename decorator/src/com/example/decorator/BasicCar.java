package com.example.decorator;

public class BasicCar implements Car {
    int hp=100;

    boolean hasAC;

    public boolean hasAC() {
        return hasAC;
    }

    @Override
    public int getHP() {
        return hp;
    }


    @Override
    public void assemble() {
        System.out.println("Assemble basic car");
    }

}
