package com.example.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Piotr on 2019-01-30.
 */
public class ObservableImpl implements MyObservable{

    List<MyObserver> subscribers;

    public ObservableImpl(List<MyObserver> subscribers) {
        this.subscribers = subscribers;
    }

    public ObservableImpl() {
        this.subscribers = new LinkedList<>();
    }

    @Override
    public void mySubscribe(MyObserver o) {
        subscribers.add(o);
    }

    @Override
    public void myUnsubscribe(MyObserver o) {
        subscribers.remove(o);
    }

    @Override
    public void myNotify(Object o) {
        subscribers.forEach(s->s.update(o));
    }
}
