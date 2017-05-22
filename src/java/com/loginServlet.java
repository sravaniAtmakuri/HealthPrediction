
package com;

import Service.Service;
import bean.LoginBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class loginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        String u=request.getParameter("userName");
        String p=request.getParameter("password");
        System.out.println("Username" + u);
        Service obj=new Service();
        boolean login=obj.login(u,p);
        session.setAttribute("userName", u);
      
      
      if(login)
        {
           LoginBean obj1 = new LoginBean();
           obj1 = obj.getUserType(u, p);
           if(obj1.getType() == 1)
           {
            response.sendRedirect("AdminHomePage.jsp");
           }
           else if(obj1.getType() == 2)
           {
            response.sendRedirect("PatientHomePage1.jsp");
           }
           else if(obj1.getType() == 3)
           {
            response.sendRedirect("DoctorHomePage.jsp");
           }
        }
        
        else
        {
            String message="Please enter correct User Name and password !";
            response.sendRedirect("loginPage.jsp?message1="+message);
        }
        
    
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
