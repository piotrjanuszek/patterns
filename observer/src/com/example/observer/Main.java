package com.example.observer;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello");
        MessengerClient c1= new MessengerClient("Klient_1");
        MessengerClient c2= new MessengerClient("Klient_2");
        MessengerClient c3= new MessengerClient("Klient_3");
        c1.sendMessage("DUPA");
    }
}
