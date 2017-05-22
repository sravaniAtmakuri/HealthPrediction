
package com;

import Service.Service;
import bean.DoctorBean;
import bean.LoginBean;
import bean.PatientBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sravani
 */
public class DocRegPageServlet extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      try (PrintWriter out = response.getWriter()) {
           
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String availabilityHours = request.getParameter("avail");
        String specializationArea= request.getParameter("specialization");
        String clinicAddress = request.getParameter("address");
        String userName = request.getParameter("userName");
        String password = request.getParameter("confirmpassword");
        String gender = request.getParameter("gender");
         String phonenumber = request.getParameter("phonenumber");
         
       DoctorBean doctor=new DoctorBean();
       doctor.setName(name);
       doctor.setEmail(email);
       doctor.setClinicAddress(clinicAddress);
       doctor.setAvailabilityHour(availabilityHours);
       doctor.setSpecialization(specializationArea);
       doctor.setUserName(userName);
       doctor.setPhoneNumber(phonenumber);
       doctor.setGender(gender);
            
      
        
        LoginBean obj = new LoginBean();
        obj.setUserName(userName);
        obj.setPassword(password);
        obj.setType(3);
        
        Service s = new Service();
        
        int i = s.insertDoctorLoginDetails(obj);
        if (i>0)
            {
                int x = s.insertDoctor(doctor);
                String message="Please log in now !";
                response.sendRedirect("loginPage.jsp?message="+message);
                
            }
            else
            {
                String message="Please re-enter UserName and password !";
                response.sendRedirect("DocRegPage.jsp?message="+message);
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
