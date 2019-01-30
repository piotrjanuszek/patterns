package com.example.observer;

/**
 * Created by Piotr on 2019-01-30.
 */
public class MessengerClient implements MyObserver {

    private String myName;
    Messenger messenger;

    public MessengerClient(String myName) {
        this.myName = myName;
        messenger = Messenger.getInstance();
        messenger.mySubscribe(this);
    }

    @Override
    public void update(Object o) {
        System.out.println(myName + ":  " + (String)o);
    }

    public void sendMessage(String message){
        messenger.myNotify(message,this);
    }
}
