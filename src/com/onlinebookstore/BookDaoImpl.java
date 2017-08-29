/*
 This is the implementation of the interface EmpDao
 */
package com.onlinebookstore;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDaoImpl implements BookDao{
    DBFactory factory;
    Connection connect;
    public BookDaoImpl(){
        factory = DBFactory.getInstance();
        connect = factory.getConnected();
    }

    @Override
    public boolean addBook(Book obj) {
        boolean flag = false;
       try{
        
        String query = "insert into book(price, avlqty, bname, authorid, publisherid, nextstock) "
                         + " values(?,?,?,?,?,?)";
        PreparedStatement statement;
        statement = connect.prepareStatement(query);
        statement.setDouble(1,obj.getPrice());
        statement.setInt(2,obj.getAvlqty());
        statement.setString(3,obj.getBname());
        statement.setInt(4,obj.getAuthId());
        statement.setInt(5,obj.getPubId());
        statement.setDate(6,obj.getNextStock());
        statement.executeUpdate(query);
        flag=true;       
       } catch(Exception ex){
           ex.printStackTrace();
       }
       return flag;
    }

    @Override
    public boolean updatePrice(Book obj, double price) {
       boolean flag = false;
       try{
        
        String query = "update book set price = ? where bookId = ? ";
        PreparedStatement statement;
        statement = connect.prepareStatement(query);
        statement.setDouble(1, price);
        statement.setInt(2,obj.getBookId());
        flag=true;       
       } catch(Exception ex){
           ex.printStackTrace();
       }
       return flag;
    }

    @Override
    public boolean updateQty(Book obj, int qty) {
        boolean flag = false;
       try{
        
        String query = "update book set avlqty = ? where bookId = ? ";
        PreparedStatement statement;
        statement = connect.prepareStatement(query);
        statement.setInt(1, qty);
        statement.setInt(2,obj.getBookId());
        flag=true;       
       } catch(Exception ex){
           ex.printStackTrace();
       }
       return flag;
    }

    @Override
    public boolean updateNextStock(Book obj, Date date) {
        boolean flag = false;
       try{
        
        String query = "update book set price = ? where bookId = ? ";
        PreparedStatement statement;
        statement = connect.prepareStatement(query);
        statement.setDate(1,date);
        statement.setInt(2,obj.getBookId());
        flag=true;       
       } catch(Exception ex){
           ex.printStackTrace();
       }
       return flag;
    }    
}