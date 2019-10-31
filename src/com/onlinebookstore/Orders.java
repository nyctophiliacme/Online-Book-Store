/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlinebookstore;

/**
 * @author pkhulbe
 */
public class Orders {
    private String ordDate;
    private int custId;

    public String getOrdDate() {
        return ordDate;
    }

    public void setOrdDate(String ordDate) {
        this.ordDate = ordDate;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }


}
