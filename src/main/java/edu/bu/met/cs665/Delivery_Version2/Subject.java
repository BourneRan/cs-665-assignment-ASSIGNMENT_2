/**
 * Name: Zhuoran Xu
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/19/2023
 * File Name: Subject.java
 * Description: Create an interface for Subject
 */

package edu.bu.met.cs665.Delivery_Version2;


public interface Subject {
    void SubscribeObserver(Observer observe);

    void UnsubscribeObserver(Observer observe);

    void notifyObserver(DeliveryRequest deliveryRequest);
}
