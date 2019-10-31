/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlinebookstore;

import java.sql.Date;

/**
 * @author pkhulbe
 */
public class Book {

    private int bookId;
    private String bname;
    private double price;
    private int authId;
    private int pubId;
    private Date nextStock;
    private int avlqty;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }


    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAuthId() {
        return authId;
    }

    public void setAuthId(int authId) {
        this.authId = authId;
    }

    public int getPubId() {
        return pubId;
    }

    public void setPubId(int pubId) {
        this.pubId = pubId;
    }

    public Date getNextStock() {
        return nextStock;
    }

    public void setNextStock(Date nextStock) {
        this.nextStock = nextStock;
    }

    public int getAvlqty() {
        return avlqty;
    }

    public void setAvlqty(int avlqty) {
        this.avlqty = avlqty;
    }

}
