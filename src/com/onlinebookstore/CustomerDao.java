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
public interface CustomerDao {
    public boolean addCustomer(Customer obj);
    public boolean updatePin(Customer obj, int pin);
    public boolean updateAddr(Customer obj, String addr);
    public boolean updatePhNo(Customer obj, long phNo);
    public boolean updatePass(Customer obj, String pass);
}
