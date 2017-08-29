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

public class CustomerDaoImpl implements CustomerDao{
    DBFactory factory;
    Connection connect;
    public CustomerDaoImpl(){
        factory = DBFactory.getInstance();
        connect = factory.getConnected();
    }

   
   
    @Override
    public boolean addCustomer(Customer obj) {
                boolean flag = false;
       try{
        
        String query = "insert into customer(cname, email, password, pincode, phone,address) "
                         + " values(?,?,?,?,?,?)";
        PreparedStatement statement;
        statement = connect.prepareStatement(query);
        statement.setString(1,obj.getCname());
        statement.setString(2,obj.getEmail());
        statement.setString(3,obj.getPassword());
        statement.setInt(4,obj.getPin());
        statement.setLong(5,obj.getPhNo());
        statement.setString(6,obj.getAddr());
        statement.executeUpdate(query);
        flag=true;       
       } catch(Exception ex){
           ex.printStackTrace();
       }
       return flag;
    }

    @Override
    public boolean updatePin(Customer obj, int pin) {
        boolean flag =false;
        try
        {String query = "update customer set pin = ? where custid = ? ";
        PreparedStatement statement;
        statement = connect.prepareStatement(query);
        statement.setInt(1,pin);
        statement.setInt(2,obj.getCustomerId());
        flag=true;       
       } catch(Exception ex){
           ex.printStackTrace();
       }
       return flag;        
    }

    @Override
    public boolean updateAddr(Customer obj, String addr) {
        boolean flag =false;
        try
        {String query = "update customer set address = ? where custid = ? ";
        PreparedStatement statement;
        statement = connect.prepareStatement(query);
        statement.setString(1,addr);
        statement.setInt(2,obj.getCustomerId());
        flag=true;       
       } catch(Exception ex){
           ex.printStackTrace();
       }
       return flag;                
    }

    @Override
    public boolean updatePhNo(Customer obj, long phNo) {
        boolean flag =false;
        try
        {String query = "update customer set phone = ? where custid = ? ";
        PreparedStatement statement;
        statement = connect.prepareStatement(query);
        statement.setLong(1,phNo);
        statement.setInt(2,obj.getCustomerId());
        flag=true;       
       } catch(Exception ex){
           ex.printStackTrace();
       }
       return flag;                
    }

    @Override
    public boolean updatePass(Customer obj, String pass) {
          boolean flag =false;
        try
        {
        String query = "update customer set pass = ? where custid = ? ";
        PreparedStatement statement;
        statement = connect.prepareStatement(query);
        statement.setString(1,pass);
        statement.setInt(2,obj.getCustomerId());
        flag=true;       
       } catch(Exception ex){
           ex.printStackTrace();
       }
       return flag;              
    }
}