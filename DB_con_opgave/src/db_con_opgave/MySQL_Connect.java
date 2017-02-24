/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_con_opgave;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Anders
 */
public class MySQL_Connect {
 private static final String USERNAME="dbbruger";
    private static final String PASSWORD="poli10bil";
    private static final String CONN_STRING="jdbc:mysql://localhost/explorecalifornia";
    public static void main(String[] args) throws SQLException {
         Connection conn = null;
       
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            System.out.println("connected");
            
        } catch (SQLException e) {
            System.err.println(e);
        }finally{
          
              if(conn!=null){
                conn.close();  
            }
        }
    }
    }
    

