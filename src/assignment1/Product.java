/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author suneh_vog
 */
public class Product {
    private String itemName;
    private int itemQty;
    private double itemPrice;
    
    public Product(String itemName, int itemQty,double itemPrice){
        this.itemName = itemName;
        this.itemQty = itemQty;
        this.itemPrice = itemPrice;
    }
    public String getItemName(){
        return itemName;
    }
    public int getItemQty(){
        return itemQty;
    }
    public double getItemPrice(){
        double price = 0;
        if(itemName.equalsIgnoreCase("apple"))
            price = 4.0/10*itemQty;
        else if(itemName.equalsIgnoreCase("corn"))
            price = 3/12*itemQty;
        else if(itemName.equalsIgnoreCase("orange"))
            price =4.5/6*itemQty;
        return price;
    }
    public void setItemName(String name)
    {
        this.itemName = name;
    }
    public void setItemQty(int qty)
    {
        this.itemQty = qty;
    }
    public void setItemPrice(double price)
    {
        
    }
    public double calcTotal()
    {
        return getItemPrice();
    }
    public String toString(){
        return  itemName + " for " + itemPrice+ " for "+itemQty;
                }
    
   }
