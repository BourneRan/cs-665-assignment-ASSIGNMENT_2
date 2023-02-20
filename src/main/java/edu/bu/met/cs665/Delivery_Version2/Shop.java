/**
 * Name: Zhuoran Xu
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/19/2023
 * File Name: Shop.java
 * Description: Create a shop class implement by Observer
 */

package edu.bu.met.cs665.Delivery_Version2;


import java.util.ArrayList;
import java.util.List;

public class Shop implements Subject{

    private List<Observer> Observers = new ArrayList<>();

    private String ShopName;

    public Shop(String name){
        this.ShopName = name;
    }

    @Override
    public void SubscribeObserver(Observer observe) {
        Observers.add(observe);
    }

    @Override
    public void UnsubscribeObserver(Observer observe) {
        Observers.remove(observe);
    }



    @Override
    public void notifyObserver(DeliveryRequest deliveryRequest) {

        for(Observer observer:Observers){
            observer.update(deliveryRequest);
        }

    }
}
