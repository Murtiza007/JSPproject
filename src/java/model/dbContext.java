/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class dbContext {
  
      public static String message="";
      public static Connection connect() throws SQLException{
      try{
         
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspdb","root","");
        dbContext.message="Connection Successful";
          return con;
      }
      catch(Exception ex){
        dbContext.message="Connection failed";
        return null;
      }
      
      }
      
  
}