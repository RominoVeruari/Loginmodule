/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Login;

import com.Login.dao.LoginDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
        String uname= request.getParameter("uname");
        String pass= request.getParameter("pass");
        LoginDao dao= new LoginDao();
        
        if(dao.check(uname, pass))
        {
            
            HttpSession session = request.getSession();
            session.setAttribute("username", uname);
            response.sendRedirect("wellcome.jsp");
        }
        else {
            response.sendRedirect("login.jsp");
        }
    }

    

}
