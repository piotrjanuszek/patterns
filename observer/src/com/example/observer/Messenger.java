package com.example.observer;

/**
 * Created by Piotr on 2019-01-30.
 */
public class Messenger extends ObservableImpl {

    private static volatile Messenger instance;
    private Messenger(){}   //singleton

    public static Messenger getInstance(){
        if (instance == null) {
            synchronized (Messenger.class) {
                if (instance == null) {
                    instance = new Messenger();
                }
            }
        }
        return instance;
    }

    public void myNotify(Object o, MyObserver sender) {
        subscribers.stream()
                .filter(x->!x.equals(sender))
                .forEach(x->x.update(o));
    }


}
