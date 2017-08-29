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
public interface WishListDao {
    public boolean addWish(WishList obj);
    public boolean updateQty(WishList obj,int custId,int bookId,int qty);
    public boolean deleteWish(int custId, int bookId);
}
