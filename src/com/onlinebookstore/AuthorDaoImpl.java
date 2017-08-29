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
public class AuthorDaoImpl implements AuthorDao{
    
    DBFactory factory;
    Connection connect;
    public AuthorDaoImpl(){
        factory = DBFactory.getInstance();
        connect = factory.getConnected();
    }
    
    @Override
    public boolean addAuthor(Author obj) {
        boolean flag = false;
       try{
        
        String query = "insert into author(aname,email) "
                         + " values(?,?)";
        PreparedStatement statement;
        statement = connect.prepareStatement(query);
        statement.setString(1,obj.getAuthName());
        statement.setString(2,obj.getEmail());
        statement.executeUpdate(query);
        flag=true;       
       } catch(Exception ex){
           ex.printStackTrace();
       }
       return flag;
    
        
        }
    
}
