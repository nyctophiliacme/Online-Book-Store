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
public class PublisherDaoImpl implements PublisherDao {
    
    DBFactory factory;
    Connection connect;
    public PublisherDaoImpl(){
        factory = DBFactory.getInstance();
        connect = factory.getConnected();
    }

    @Override
    public boolean addPublisher(Publisher Obj) {
        boolean flag = false;
       try{
        
        String query = "insert into publisher(pname) "
                         + " values(?)";
        PreparedStatement statement;
        statement = connect.prepareStatement(query);
        statement.setString(1,Obj.getPubName());
        statement.executeUpdate(query);
        flag=true;       
       } catch(Exception ex){
           ex.printStackTrace();
       }
       return flag;
    }
    
    
}
