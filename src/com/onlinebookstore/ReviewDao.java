/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlinebookstore;

import java.sql.Connection;

/**
 *
 * @author pkhulbe
 */
public interface ReviewDao {
    public boolean addReview(Review obj);
    
}
