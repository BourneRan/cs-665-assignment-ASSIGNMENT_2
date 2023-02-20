/**
 * Name: Zhuoran Xu
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/19/2023
 * File Name: DeliveryRequest.java
 * Description: Create a DeliveryRequest to implement by Subject
 */

package edu.bu.met.cs665.Delivery_Version2;

public class DeliveryRequest {
    private String OrderAddress;

    private int OrderId;

    public DeliveryRequest(String address, int Id) {
        this.OrderAddress = address;
        this.OrderId = Id;
    }

    public String getOrderAddress(){
        return this.OrderAddress;
    }

    public int getOrderId(){
        return this.OrderId;
    }


}
