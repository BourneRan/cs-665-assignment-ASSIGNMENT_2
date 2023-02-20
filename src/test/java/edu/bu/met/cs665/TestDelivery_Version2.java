/**
 * Name: Zhuoran Xu
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/19/2023
 * File Name: TestDelivery_Version1.java
 * Description: Junit Test
 */

package edu.bu.met.cs665;
import edu.bu.met.cs665.Delivery_Version2.DeliveryRequest;
import edu.bu.met.cs665.Delivery_Version2.Driver;
import edu.bu.met.cs665.Delivery_Version2.Shop;
import org.junit.Test;


public class TestDelivery_Version2 {

    @Test
    public void testdelivery_version2(){

        DeliveryRequest deliveryRequest = new DeliveryRequest("666 Brooklin St", 001);

        Shop grocery = new Shop("StarMarket");

        Driver driver1 = new Driver("Jack", "car");

        Driver driver2 = new Driver("Annie", "scooter");

        Driver driver3 = new Driver("Allan", "bicycle");

        Driver driver4 = new Driver("Green", "truck");

        Driver driver5 = new Driver("Rick", "foot");

        grocery.SubscribeObserver(driver1);

        grocery.SubscribeObserver(driver2);

        grocery.SubscribeObserver(driver3);

        grocery.SubscribeObserver(driver4);

        grocery.SubscribeObserver(driver5);

        grocery.notifyObserver(deliveryRequest);


        DeliveryRequest deliveryRequest1 = new DeliveryRequest("888 CommonWealth Rd", 002);

        Shop restaurant = new Shop("PizzaStore");

        restaurant.SubscribeObserver(driver1);

        restaurant.SubscribeObserver(driver2);

        restaurant.SubscribeObserver(driver3);

        restaurant.SubscribeObserver(driver4);

        restaurant.SubscribeObserver(driver5);

        restaurant.notifyObserver(deliveryRequest1);
    }
}
