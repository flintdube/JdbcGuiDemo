/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcguiprojectdemo.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Photo.M
 */
public class DBconnection {

    private static DBconnection jdbc;
    
    private DBconnection(){
    }
    
    public static DBconnection getInstance(){
        if(jdbc==null)
            jdbc= new DBconnection();
    return jdbc;
    }
   
    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Test", "sa", "Passw0rd");
            if (conn == null) {
                System.out.println("Db Connection failed...");
            } else {
                System.out.println("db connection established...");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
