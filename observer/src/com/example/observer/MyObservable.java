package com.example.observer;

/**
 * Created by Piotr on 2019-01-30.
 */
public interface MyObservable {
    void mySubscribe(MyObserver o);
    void myUnsubscribe(MyObserver o);
    void myNotify(Object O);
}
