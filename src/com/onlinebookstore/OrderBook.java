/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlinebookstore;

/**
 *
 * @author pkhulbe
 */
public class OrderBook {
    
    private int orderId;
    private int bookId;
    private int ordQty;
    private double currPrice;

    
     public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getOrdQty() {
        return ordQty;
    }

    public void setOrdQty(int ordQty) {
        this.ordQty = ordQty;
    }

    public double getCurrPrice() {
        return currPrice;
    }

    public void setCurrPrice(double currPrice) {
        this.currPrice = currPrice;
    }

   
    
}
