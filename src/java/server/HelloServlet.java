/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rakshit
 */
public class HelloServlet extends HttpServlet {

    @EJB
    HelloBean bean;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        String Uname = request.getParameter("uname");
        String Password = request.getParameter("password");
        
        bean.setUname(Uname);
        bean.setPassword(Password);
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet HelloServlet</title>");            
        out.println("</head>");
        out.println("<body>");
           
        int count;
        if(request.getSession().getAttribute("count")==null)
        {
            count = 0;
        }
        else
        {
            count = (int) request.getSession().getAttribute("count");
        }
        request.getSession().setAttribute("count", ++count);
        out.println("Accessed : " + request.getSession().getAttribute("count"));
        out.println("<h2>"+ bean.sayHello("Rakshit") + "</h2>");
        out.print("<h2>" + bean.checkLogin(Uname, Password)+ "</h2>");
        out.println("</body>");
        out.println("</html>");
    }
}
