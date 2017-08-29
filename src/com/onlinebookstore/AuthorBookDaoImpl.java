/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlinebookstore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import static javax.management.remote.JMXConnectorFactory.connect;

/**
 *
 * @author pkhulbe
 */
public class AuthorBookDaoImpl implements AuthorBookDao {
    DBFactory factory;
    Connection connect;
    public AuthorBookDaoImpl(){
        factory = DBFactory.getInstance();
        connect = factory.getConnected();
    }

    @Override
    public boolean addAuthorBook(AuthorBook obj) {
        boolean flag = false;
       try{
        
        String query = "insert into author_book(authorid,bookid) "
                         + " values(?,?)";
        PreparedStatement statement;
        statement = connect.prepareStatement(query);
        statement.setInt(1,obj.getAuthId());
        statement.setInt(2,obj.getBookId());
        statement.executeUpdate(query);
        flag=true;       
       } catch(Exception ex){
           ex.printStackTrace();
       }
       return flag;
    }
    
    
}
