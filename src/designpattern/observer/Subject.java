package designpattern.observer;

public interface Subject {
    void registerSubscriber(Subscriber s);
    void removeSubscriber(Subscriber s);
    void notifysubscriber();
    int getPrice();
}
