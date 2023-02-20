/**
 * Name: Zhuoran Xu
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/19/2023
 * File Name: TestDelivery_Version1.java
 * Description: Junit Test
 */

package edu.bu.met.cs665;
import edu.bu.met.cs665.Delivery_Version1.DeliveryRequest;
import edu.bu.met.cs665.Delivery_Version1.Driver;
import edu.bu.met.cs665.Delivery_Version1.Shop;
import org.junit.Test;

public class TestDelivery_Version1 {
    @Test
    public void testdeliver(){

        DeliveryRequest Uber = new DeliveryRequest();

        Driver driver1 = new Driver("Yian Yao", "car");

        Driver driver2 = new Driver("Annie", "scooter");

        Driver driver3 = new Driver("Weixuan", "bicycle");

        Driver driver4 = new Driver("Zhuoran", "plane");

        Driver driver5 = new Driver("Haowen Song", "tiger");

        Shop Pizzastore = new Shop("Pizzastore", "888 Brookline Rd");

        Shop Star = new Shop("Star Market", "1550 Soldiers Field Rd");

        Shop Stop = new Shop("Stop Shop", "888 CommonWealth Rd");

        Shop BBQ = new Shop("BBQ", "779 Allston St");

        Shop Victory = new Shop("Victory Restaurant", "01 Brighton St");

        Uber.SubscribeObserver(driver1);

        Uber.SubscribeObserver(driver2);

        Uber.SubscribeObserver(driver3);

        Uber.SubscribeObserver(driver4);

        Uber.SubscribeObserver(driver5);

        Uber.SubscribeObserver(Pizzastore);

        Uber.SubscribeObserver(Star);

        Uber.SubscribeObserver(Stop);

        Uber.SubscribeObserver(BBQ);

        Uber.SubscribeObserver(Victory);

        Uber.notifyObserver("Place an order");

        Uber.notifyObserver("Shop has prepared the order");
    }

}
