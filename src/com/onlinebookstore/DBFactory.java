/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlinebookstore;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author pkhulbe
 */
public class DBFactory {
    
    private static DBFactory factory = new DBFactory();
    private DBFactory(){}
    public static DBFactory getInstance(){ return factory;}
    
    public Connection getConnected(){
        Connection connection = null;
         try{
            DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/derby","root","root");
            System.out.println("Derby Connected !!!");
            }catch(Exception e){
            e.printStackTrace();
        }
            return connection;
    }
}
