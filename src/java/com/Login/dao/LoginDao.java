/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class LoginDao {
    String sql= "select * from login where uname=? and pass=?" ;
    String url ="jdbc:mysql://localhost:3306/db_user";
    String username= "root";
    String password= "";
    public boolean check(String uname, String pass){
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection(url,username,password);
            PreparedStatement st=conn.prepareStatement(sql);
            st.setString(1, uname);
            st.setString(2, pass);
            ResultSet rs= st.executeQuery();
            if(rs.next()){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        return false ;
    }
}
