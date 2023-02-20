/**
 * Name: Zhuoran Xu
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/19/2023
 * File Name: DeliveryRequest.java
 * Description: Create a DeliveryRequest to implement by Subject
 */



package edu.bu.met.cs665.Delivery_Version1;

import java.util.ArrayList;
import java.util.List;

public class DeliveryRequest implements Subject {

    private List<Observer> Observer = new ArrayList<>();

    //private String order;

    @Override
    public void SubscribeObserver(Observer observe) {
        Observer.add(observe);
    }

    @Override
    public void UnsubscribeObserver(Observer observe) {
        Observer.remove(observe);
    }

    @Override
    public void notifyObserver(String order) {
        Observer.forEach(e -> e.update(order));
    }


}
