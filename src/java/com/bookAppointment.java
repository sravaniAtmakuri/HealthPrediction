
package com;

import Service.Service;
import bean.Appointment;
import bean.PatientBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class bookAppointment extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String n =request.getParameter("name");
        String e =request.getParameter("email");
        String g =request.getParameter("gender");
        String d =request.getParameter("adate");
        String t =request.getParameter("atime");
        System.out.println("name" + n);
        
        Service obj=new Service();
        
        HttpSession session = request.getSession();
        
        String DocEmail = (String) session.getAttribute("dEmail");
        System.out.println("Doc name"+DocEmail);
        String PatUsername = (String) session.getAttribute("userName");
        PatientBean obj1 =new PatientBean();
        
        obj1 = obj.getPatientAge(PatUsername);
        
        Appointment obj2 =new Appointment();
        
        obj2.setAge(obj1.getAge());
        obj2.setDate(d);
        obj2.setTime(t);
        obj2.setGender(g);
        obj2.setName(n);
        obj2.setEmail(e);
        obj2.setDocUserName(DocEmail);
        
        
        int i = obj.insertAppointmentDetails(obj2);
         response.sendRedirect("PatientHomePage1.jsp");
        
//        if(i>0)
//        {
//           response.sendRedirect("PatientHomePage1.jsp");
//        }
//        else
//        {
//            System.out.println("Error");
//                    }
            
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
