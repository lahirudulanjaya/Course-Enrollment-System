/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NSBMCourseEnrollmentSystem_DB_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lahiru Dulanjaya
 */
public class DB_connection {
    public static final String sql = "jdbc:mysql://localhost:3306/nsbm";
    public static final String user ="root";
    public static final String password ="Passward1223*";
    
    public static Connection getConnection() throws SQLException{
        Connection con =DriverManager.getConnection(sql, user, password);
        return con;
        
    }
    
}
