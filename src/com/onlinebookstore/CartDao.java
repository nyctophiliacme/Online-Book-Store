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
public interface CartDao {
    public boolean addCart(Cart obj);
    public boolean updateQty(Cart obj,int custId,int bookId,int qty);
    public boolean addCart(int custId, int bookId);
}
