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
public class StaffDaoImpl implements StaffDao{
    DBFactory factory;
    Connection connect;
    public StaffDaoImpl(){
        factory = DBFactory.getInstance();
        connect = factory.getConnected();
    }

    @Override
    public boolean addStaff(Staff obj) {
        boolean flag = false;
       try{
        
        String query = "insert into staff(sname, email,password) "
                         + " values(?,?,?)";
        PreparedStatement statement;
        statement = connect.prepareStatement(query);
        statement.setString(1,obj.getSname());
        statement.setString(2,obj.getEmail());
        statement.setString(3,obj.getPassword());
        statement.executeUpdate(query);
        flag=true;       
       } catch(Exception ex){
           ex.printStackTrace();
       }
       return flag;
    }

    @Override
    public boolean updatePass(Staff obj, String pass) {
          boolean flag =false;
        try
        {
        String query = "update staff set pass = ? where satffid = ? ";
        PreparedStatement statement;
        statement = connect.prepareStatement(query);
        statement.setString(1,pass);
        statement.setInt(2,obj.getStaffId());
        flag=true;       
       } catch(Exception ex){
           ex.printStackTrace();
       }
       return flag;            
    }

    @Override
    public boolean deleteStaff(int staffId) {
          boolean flag =false;
          try
          {String query = "delete from staff where satffid = ? ";    
          PreparedStatement statement;
          statement = connect.prepareStatement(query);
          statement.setInt(1,staffId);
          flag = true;
          }catch(Exception e){
              e.printStackTrace();
          }
          return flag;
    }
}
