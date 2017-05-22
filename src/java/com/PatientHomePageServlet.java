
package com;

import Service.Service;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PatientHomePageServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            ArrayList<String> result=new ArrayList<String>();
  //          ArrayList<String>message=new ArrayList<String>();
           String message="";
             String symptom1 = request.getParameter("symptom1");
             String symptom2 = request.getParameter("symptom2");
             String symptom3 = request.getParameter("symptom3");
             String symptom4 = request.getParameter("symptom4");
             String symptom5 = request.getParameter("symptom5");
             System.out.println("sym" + symptom2);
             String a = request.getParameter("age");
             int age = Integer.parseInt(a);
             String age_group = "";
             if (age<=10){
                 age_group = "KID";
             }
             else if (age>10 && age <=19){
                 age_group = "TEEN";
             }
             else if (age>19 && age <=55){
                 age_group = "ADULT";
             }
             else if (age>55)
             {
                 age_group = "OLD";
             }
             Service service=new Service();
             result=service.prediction(symptom1, symptom2, symptom3, symptom4,symptom5,age_group);
             
             for(int i=0;i<result.size();i++){
                 if (symptom2.equals("null") && symptom3.equals("null") && symptom4.equals("null") && symptom5.equals("null"))
                 {
                     message=result.get(0)+message;
                     break;
                 }
                 else if (symptom3.equals("null") && symptom4.equals("null") && symptom5.equals("null"))
                 {
                     message=result.get(0)+message;
                     break;
                 }
                 else if (symptom4.equals("null") && symptom5.equals("null"))
                 {
                     message=result.get(0)+message;
                     break;
                 }
                 else if (symptom5.equals("null"))
                 {
                     message=result.get(0)+message;
                     break;
                 }
                 message=result.get(0)+message;
             }
       
            String message4="You might be suffering from \""+message+"\"";
          response.sendRedirect("PatientHomePage1.jsp?message4="+message4);
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
