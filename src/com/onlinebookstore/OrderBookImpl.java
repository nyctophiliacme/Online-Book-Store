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
public class OrderBookImpl implements OrderBookDao{
    
    DBFactory factory;
    Connection connect;
    public OrderBookImpl(){
        factory = DBFactory.getInstance();
        connect = factory.getConnected();
    }
    
    @Override
    public boolean addOrderBook(OrderBook obj) {
        boolean flag = false;
       try{
        
        String query = "insert into orders_book(ordersid,bookid,curprice,ordqty) "
                         + " values(?,?,?,?)";
        PreparedStatement statement;
        statement = connect.prepareStatement(query);
        statement.setInt(1,obj.getOrderId());
        statement.setInt(2,obj.getBookId());
        statement.setDouble(3,obj.getCurrPrice());
        statement.setInt(4,obj.getOrdQty());
        statement.executeUpdate(query);
        flag=true;       
       } catch(Exception ex){
           ex.printStackTrace();
       }
       return flag;
        }
    }