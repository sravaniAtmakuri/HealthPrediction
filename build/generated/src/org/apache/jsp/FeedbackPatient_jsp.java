package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FeedbackPatient_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<title> Smart Health App</title>\n");
      out.write("\t<meta name=\"description\" content=\"Smart Health App\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<!-- Optional theme -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\">\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  \t\t<nav class= \"navbar navbar-inverse navbar-fixed-top\" id=\"my-navbar\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("\t<div class=\"navbar-header\">\n");
      out.write("\t<button type=\"button\" class=\"navbar-toogle\" data-toogle=\"collapse\" data-target=\"#navbar-collapse\">\n");
      out.write("\t\t</button>\n");
      out.write("\t<a href=\"\" class=\"navbar-brand\">Smart Health Predictor</a>\n");
      out.write("\t</div><!--navbar header-->\n");
      out.write("\t\n");
      out.write("\t<div class=\"collapse navbar-collapse\" id=\"navbar-collapse\">\n");
      out.write("\t <ul class=\"nav navbar-nav\">\n");
      out.write("         <li><a href=\"PatientHomePage1.jsp\">HOME</a>\n");
      out.write("         <li><a href=\"PatientMyProfile.jsp\">MY PROFILE</a></li>\n");
      out.write("         <li><a href=\"SearchDoctor.jsp\">SEARCH DOCTOR</a>\n");
      out.write("\t </ul>\n");
      out.write("         <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("         <li><a class=\"\" href=\"logout.jsp\">LOGOUT</a></li>\n");
      out.write("         </ul>\n");
      out.write("\t</div>\n");
      out.write("\t</div><!--End container-->\n");
      out.write("  \t\t\t\n");
      out.write("  \t\t</nav> \n");
      out.write("\n");
      out.write("  \t\t\n");
      out.write("\n");
      out.write("  \t\t<div class=\"jumbotron\">\n");
      out.write("\t\t\t<div class=\"container text-center\" style=\"max-height: 100px\">\n");
      out.write("\t\t\t\t<h1>Disease Prediction</h1>\n");
      out.write("\t\t\t\t<p> Using Data Mining</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("<section id=\"contact\" class=\"content-section text-center\">\n");
      out.write(" <div class=\"modal-dialog\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <h1 class=\"text-center\">Feedback</h1>\n");
      out.write("        </div>\n");
      out.write("         <form  action=\"FeedbackPatientServlet\" method=\"post\">\n");
      out.write("         <p style=\"color: green\">\n");
      out.write("                                    ");

                                        String message1=request.getParameter("message3");
                                        if(message1!=null)
                                        {
      out.write("\n");
      out.write("                                         <h1   style=\"color: green\">    ");
      out.print(message1);
      out.write(" </h1>\n");
      out.write("                                       ");
 }
                                    
      out.write("\n");
      out.write("          <p style=\"color: red\">\n");
      out.write("                                    ");

                                        String message2=request.getParameter("message4");
                                        if(message2!=null)
                                        {
      out.write("\n");
      out.write("                                        ");
      out.print(message2);
      out.write("\n");
      out.write("                                     ");
 }
                                    
      out.write("\n");
      out.write("                                </p>                           \n");
      out.write("                                    \n");
      out.write("                                </p>\n");
      out.write("         <div class=\"modal-body\">\n");
      out.write("             <div class=\"form-group\">\n");
      out.write("                 <input type=\"text\" id=\"submitFeedback\" name=\"submitFeedback\" placeholder=\"Write a feedback about our app\" class=\"form-control input-lg\"/>\n");
      out.write("             </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                 \n");
      out.write("               \n");
      out.write("     \n");
      out.write("                <button type=\"submit \"class=\"btn btn-info\" >SUBMIT FEEDBACK</button>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            \n");
      out.write("         </div>\n");
      out.write("         </form>\n");
      out.write("        </div>\n");
      out.write("    </div>    \n");
      out.write("</section>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.1.1.js\"> </script>\n");
      out.write("  \n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"> </script>\n");
      out.write("</body>\t\n");
      out.write("</html> ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
