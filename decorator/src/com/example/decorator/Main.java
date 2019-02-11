package com.example.decorator;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello");

        Car car1=new LuxuryCar(new SportCar( new BasicCar()));
        car1.assemble();
        System.out.println(car1.getHP());
    }
}
