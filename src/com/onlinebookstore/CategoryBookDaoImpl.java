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
public class CategoryBookDaoImpl implements CategoryBookDao {
    DBFactory factory;
    Connection connect;
    public CategoryBookDaoImpl(){
        factory = DBFactory.getInstance();
        connect = factory.getConnected();
    }

    @Override
    public boolean addCategoryBook(CategoryBook obj) {
        boolean flag = false;
       try{
        
        String query = "insert into category_book(categoryid,bookid) "
                         + " values(?,?)";
        PreparedStatement statement;
        statement = connect.prepareStatement(query);
        statement.setInt(1,obj.getCategoryId());
        statement.setInt(2,obj.getBookId());
        statement.executeUpdate(query);
        flag=true;       
       } catch(Exception ex){
           ex.printStackTrace();
       }
       return flag;
    }
    
}
