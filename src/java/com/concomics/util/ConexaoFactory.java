/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concomics.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ramon
 */
public class ConexaoFactory {
    
    private static String url = "jdbc:mysql://localhost:3306/mydb";    
    private static String driverNome = "com.mysql.jdbc.Driver";   
    private static String username = "root";   
    private static String password = "Root10!!";

    public Connection getConnection() {
        try{
            
            return DriverManager.getConnection(url, username, password);
                    
        } catch(SQLException ex){
            
            throw new RuntimeException(ex);
            
        }
    }
    
}
