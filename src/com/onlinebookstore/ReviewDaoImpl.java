/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlinebookstore;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author pkhulbe
 */
public class ReviewDaoImpl implements ReviewDao{
    DBFactory factory;
    Connection connect;
    public ReviewDaoImpl(){
        factory = DBFactory.getInstance();
        connect = factory.getConnected();
    }

    @Override
    public boolean addReview(Review obj) {
        boolean flag = false;
       try{
        
        String query = "insert into review(bookid,custid,comment,rating) "
                         + " values(?,?,?,?)";
        PreparedStatement statement;
        statement = connect.prepareStatement(query);
        statement.setInt(1,obj.getBookId());
        statement.setInt(2,obj.getCustId());
        statement.setString(3,obj.getComment());
        statement.setDouble(4,obj.getRating());
        statement.executeUpdate(query);
        flag=true;       
       } catch(Exception ex){
           ex.printStackTrace();
       }
       return flag;
    }
    
}
