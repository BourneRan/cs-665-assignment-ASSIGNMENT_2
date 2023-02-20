/**
 * Name: Zhuoran Xu
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/19/2023
 * File Name: Shop.java
 * Description: Create a shop class implement by Observer
 */

package edu.bu.met.cs665.Delivery_Version1;

public class Shop implements Observer{

    private String ShopName;

    private String Shopaddress;
    private String LatestUpdate;

    public Shop(String name, String shopaddress){
        this.ShopName = name;
        this.Shopaddress = shopaddress;
    }

    public String getLatestUpdate() {
        return LatestUpdate;
    }

    public String getShopName() {
        return ShopName;
    }

    @Override
    public void update(String UpdateMessage) {
        this.LatestUpdate = " Shops do nothing";
        if(UpdateMessage.equals("Place an order")){
            this.LatestUpdate = " prepares the order";
            System.out.println("Shop state: " + getShopName() + this.getLatestUpdate());
        }
        else{
            System.out.println("Shop state: "  + this.getLatestUpdate());
        }

    }
}
