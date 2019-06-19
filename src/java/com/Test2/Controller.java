/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Test2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
public class Controller extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response )throws IOException ,ServletException
    {
        
        int ID =Integer.parseInt(request.getParameter("ID"));
        Conn1 c1=new Conn1();
        Storage a= c1.getStorage(ID);
        
        //request.setAttribute("data", a);
        
        //RequestDispatcher rd= request.getRequestDispatcher("showStorage.jsp");
        //rd.forward(request, response);
        
        
         HttpSession session = request.getSession();
         session.setAttribute("data",a);
         response.sendRedirect("showStorage.jsp");
        
        
    }
}
