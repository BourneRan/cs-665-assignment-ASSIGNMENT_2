/**
 * Name: Zhuoran Xu
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/19/2023
 * File Name: Driver.java
 * Description: Create a Driver to implement by Observer
 */

package edu.bu.met.cs665.Delivery_Version2;

public class Driver implements Observer {
    private String DriverName;

    private String DeliveryTool;




    public Driver(String name, String tool){
        this.DriverName = name;
        this.DeliveryTool = tool;

    }

    public String getDriverName(){
        return this.DriverName;
    }

    public String getDeliveryTool(){
        return this.DeliveryTool;
    }


    @Override
    public void update(DeliveryRequest deliveryRequest) {

        System.out.println("Notify driver " + getDriverName());

        System.out.println("There is a new delivery request");

        System.out.println("The order number is " + deliveryRequest.getOrderId());

        System.out.println("The address is " + deliveryRequest.getOrderAddress() + "\n");


    }
}
