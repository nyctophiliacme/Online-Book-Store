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
public interface StaffDao {
    public boolean addStaff(Staff obj);
    public boolean updatePass(Staff obj,String pass);
    public boolean deleteStaff(int staffId);
}
