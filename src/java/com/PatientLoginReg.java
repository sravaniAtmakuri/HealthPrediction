
package com;

import Service.Service;
import bean.LoginBean;
import bean.PatientBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PatientLoginReg extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
        String name = request.getParameter("name");
        System.out.println("name: "+name);
        String email = request.getParameter("email");
         String gender = request.getParameter("gender");
        System.out.println("Gender:"+gender);
        String a = request.getParameter("age");
        System.out.println(" age " + a);
        int age = Integer.parseInt(a);
        System.out.println("parsed age " + age);
        String address = request.getParameter("address");
        String userName = request.getParameter("userName");
        String password = request.getParameter("confirmpassword");
       
        PatientBean p = new PatientBean();
        p.setName(name);
        p.setEmail(email);
        p.setAge(age);
        p.setGender(gender);
        p.setAddress(address);    
        p.setUserName(userName);
            
      
        
        LoginBean obj = new LoginBean();
        obj.setUserName(userName);
        obj.setPassword(password);
        obj.setType(2);
        
        Service s = new Service();
        
        int i = s.insertPatientLoginDetails(obj);
        if (i>0)
            {
                int x = s.insertPatient(p); 
                String message="Please log in now !";
                response.sendRedirect("loginPage.jsp");
                
            }
            else
            {
                String message="Please re-enter UserName and password !";
                response.sendRedirect("PatientRegistration.jsp?message="+message);
            }
        
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
