package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class LandCh implements Subject{
    private int price;
    private List<Subscriber> subscribers;

    public LandCh(){
        subscribers = new ArrayList<Subscriber>();
    }
    @Override
    public void registerSubscriber(Subscriber s) {
        subscribers.add(s);
    }

    @Override
    public void removeSubscriber(Subscriber s) {
        subscribers.remove(s);
    }

    @Override
    public void notifysubscriber() {
        subscribers.forEach(s -> s.update()); // pull
    }

    public int getPrice(){ // pull
        return price;
    }

    public void setPrice(int price){
        this.price = price;
        notifysubscriber();
    }
}
