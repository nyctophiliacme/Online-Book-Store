/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlinebookstore;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author pkhulbe
 */
public class OrdersDaoImpl implements OrdersDao{
    DBFactory factory;
    Connection connect;
    public OrdersDaoImpl(){
        factory = DBFactory.getInstance();
        connect = factory.getConnected();
    }

    @Override
    public boolean addOrders(Orders obj) {
        boolean flag = false;
       try{
        
        String query = "insert into orders(orderdate,custid) "
                         + " values(?,?)";
        PreparedStatement statement;
        statement = connect.prepareStatement(query);
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        dateFormat.format(date);
        
        statement.setDate(1, (java.sql.Date) date);
        statement.setInt(2,obj.getCustId());
        statement.executeUpdate(query);
        flag=true;       
       } catch(Exception ex){
           ex.printStackTrace();
       }
       return flag;
    
        
        }
    }
    
