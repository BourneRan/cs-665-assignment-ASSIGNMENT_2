/**
 * Name: Zhuoran Xu
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/19/2023
 * File Name: Driver.java
 * Description: Create a Driver to implement by Observer
 */

package edu.bu.met.cs665.Delivery_Version1;

public class Driver implements Observer{

    private String DriverName;

    private String DeliveryTool;

    private String LatestUpdate;


    public Driver(String name, String tool) {
        this.DriverName = name;
        this.DeliveryTool = tool;

    }

    public String getDriverName(){
        return this.DriverName;
    }

    public String getDeliveryTool(){
        return this.DeliveryTool;
    }

    public String getLatestUpdate() {
        return this.LatestUpdate;
    }
    @Override
    public void update(String UpdateMessage) {
        this.LatestUpdate = "Drivers do nothing";
        if(UpdateMessage.equals("Shop has prepared the order")) {
            this.LatestUpdate = " gets the order and deliver";
            System.out.println("Driver state:"+ getDriverName() + " using " + getDeliveryTool()
                    + this.getLatestUpdate());
        }
        else{
            System.out.println("Driver state:" + this.getLatestUpdate());
        }
    }


}
