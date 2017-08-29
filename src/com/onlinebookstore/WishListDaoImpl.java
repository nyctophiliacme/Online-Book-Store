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
public class WishListDaoImpl implements WishListDao{
    
    DBFactory factory;
    Connection connect;
    public WishListDaoImpl(){
        factory = DBFactory.getInstance();
        connect = factory.getConnected();
    }

    @Override
    public boolean addWish(WishList obj) {
         boolean flag = false;
       try{
        
        String query = "insert into wishlist(custid,bookid,wishqty) "
                         + " values(?,?,?)";
        PreparedStatement statement;
        statement = connect.prepareStatement(query);
        statement.setInt(1,obj.getCustId());
        statement.setInt(2,obj.getBookId());
        statement.setInt(3,obj.getWishQty());
        statement.executeUpdate(query);
        flag=true;       
       } catch(Exception ex){
           ex.printStackTrace();
       }
       return flag;
          
    }

    @Override
    public boolean updateQty(WishList obj, int custId, int bookId, int qty) {
          boolean flag =false;
        try
        {String query = "update wishlist set wishqty = ? where custid = ?  and bookid = ?";
        PreparedStatement statement;
        statement = connect.prepareStatement(query);
        statement.setInt(1,qty);
        statement.setInt(2,obj.getCustId());
        statement.setInt(2,obj.getBookId());
        flag=true;       
       } catch(Exception ex){
           ex.printStackTrace();
       }
       return flag;             
    }

    @Override
    public boolean deleteWish(int custId, int bookId) {
            boolean flag =false;
          try
          {String query = "delete from wishlist where custid = ? and bookid = ?";    
          PreparedStatement statement;
          statement = connect.prepareStatement(query);
          statement.setInt(1,custId);
          statement.setInt(2,bookId);
          flag = true;
          }catch(Exception e){
              e.printStackTrace();
          }
          return flag;        
    }
    
}
