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
public class WishList {
    
    private int custId;
    private int bookId;
    private int wishQty;

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getWishQty() {
        return wishQty;
    }

    public void setWishQty(int wishQty) {
        this.wishQty = wishQty;
    }
    
}
