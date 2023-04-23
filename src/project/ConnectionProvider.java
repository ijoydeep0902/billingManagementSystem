/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author JOYDEEP
 */
public class ConnectionProvider {
      public static Connection getCon()
    {
        try
        {
            System.out.println("Connection Provider Stared...");
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        
        
      System.out.println("Starting DriverManager.....");
        
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","Joydeep@5352");
        
        if(con==null)
        {
            JOptionPane.showMessageDialog(null, "con is null");
        }
        else
        {
           System.out.println("Connection Provider returned Successfully");
        }
        
        
        return con; 
        }
        catch(ClassNotFoundException | SQLException e)  
        {
        return null;
        }
                
            
    }
    
}
