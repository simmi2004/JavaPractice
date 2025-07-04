/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Malhotra Computer
 */
public class SIngletonClass {
   Connection conn = null;
   
   private static SIngletonClass instance = null;
   
   
   private SIngletonClass () {
       try {
           //jdbc:mysql://localhost:3306/librarym?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]
           //jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]
           //jdbc:mysql://localhost:3306/librarym?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]
           //jdbc:mysql://localhost:3306/libraryManagement?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]
           //jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarym","root","");
            if(conn != null){
                String studentTable = "CREATE TABLE IF NOT EXISTS studentTable(id INT AUTO_INCREMENT, name varchar(255), contact varchar(225), email varchar(255), PRIMARY KEY(id))";
               PreparedStatement ps = conn.prepareCall(studentTable);
               ps.execute();
            }
       } catch (SQLException ex) {
           System.getLogger(SIngletonClass.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
       }
       
     
   }
   
   public static SIngletonClass getInstance(){
       if(instance == null){
        instance = new SIngletonClass();
       }
       return instance;
   }
    
    
    
}
