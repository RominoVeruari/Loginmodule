/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Test2;
import java.sql.*;
/**
 *
 * @author User
 */
public class Conn1 {
    
    public Storage getStorage(int ID){
        Storage a= new Storage ();
    
   
        
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/db_user","root","");
        Statement st=conn.createStatement();
        ResultSet rs = st.executeQuery("select * from db_client where ID="+ID);
        
        if (rs.next())
                {
                    a.setID(rs.getInt(1));
                    a.setFirstName(rs.getString(2));
                    a.setFatherName(rs.getString(3));
                    a.setLastName(rs.getString(4));
                    a.setBirthDate(rs.getString(5));
                    a.setBirthplace(rs.getString(6));
                    a.setGender(rs.getString(7));
                    a.setMaritalStatus(rs.getString(8));
                    a.setPhoneNumber(rs.getString(9));
                    a.setAddress(rs.getString(10));
                    a.setEmail(rs.getString(11));
                    a.setCF(rs.getString(13));
        
                }
    }
    catch(Exception e){
        System.out.println(e);
    }
    
     return a;
    }
    
}
