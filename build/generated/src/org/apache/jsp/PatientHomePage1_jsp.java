package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PatientHomePage1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("\t\t<title>Smart health predictor App </title>\r\n");
      out.write("\t\t<meta name=\"description\" content=\"Wiredeiki App\">\r\n");
      out.write("\t\t<!-- LAtest compiled and minified CSS-->\r\n");
      out.write("\t\t<!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Optional theme -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\">\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t</head>\r\n");
      out.write("\t\r\n");
      out.write("\t<body>\r\n");
      out.write("\t<!--Navbar -->\r\n");
      out.write("\t<nav class=\"navbar navbar-inverse navbar-fixed-top\" id=\"my-navbar\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t<div class=\"navbar-header\">\r\n");
      out.write("\t<button type=\"button\" class=\"navbar-toogle\" data-toogle=\"collapse\" data-target=\"#navbar-collapse\">\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t<a href=\"\" class=\"navbar-brand\">Smart Health Predictor</a>\r\n");
      out.write("\t</div><!--navbar header-->\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"collapse navbar-collapse\" id=\"navbar-collapse\">\r\n");
      out.write("\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t <li><a href=\"PatientMyProfile.jsp\">MY PROFILE</a>\r\n");
      out.write("\t <li><a href=\"SearchDoctor.jsp\">SEARCH DOCTOR</a>\r\n");
      out.write("\t <li><a href=\"FeedbackPatient.jsp\">FEEDBACK</a>\r\n");
      out.write("            \r\n");
      out.write("                                            <li><a class=\"\" href=\"logout.jsp\">LOGOUT</a></li>\r\n");
      out.write("                                    \r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div><!--End container-->\r\n");
      out.write("\t</nav><!--End navbar-->\r\n");
      out.write("\t<!--jumbotron-->\r\n");
      out.write("\t<div class=\"jumbotron\">\r\n");
      out.write("\t<div class=\"container text-center\">\r\n");
      out.write("\t<h1>Disease Prediction</h1>\r\n");
      out.write("\t<p>Using Data Mining</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div><!-- End jumbotron-->\r\n");
      out.write("\t\r\n");
      out.write("<!--\t</div class=\"container\">\r\n");
      out.write("\t<section>\r\n");
      out.write("\t<div class=\"page-header\" id=\"navbar-collapse#feedback\">\r\n");
      out.write("\t<h2>Feedback </h2>\r\n");
      out.write("\t</div>  \r\n");
      out.write("\t</section>\r\n");
      out.write("\t</div><!-- End container--> \r\n");
      out.write("\t<!-- call to action-->\r\n");
      out.write("\t<section>\r\n");
      out.write("            <div class=\"container text-center\">\r\n");
      out.write("            <form action=\"PatientHomePageServlet\" method=\"post\">\r\n");
      out.write("            <p style=\"color: green\">\r\n");
      out.write("                                    ");

                                        String message1=request.getParameter("message4");
                                        if(message1!=null)
                                        {
      out.write("\r\n");
      out.write("                                         <h1   style=\"color: green\">    ");
      out.print(message1);
      out.write(" </h1>\r\n");
      out.write("                                       ");
 }
                                    
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"form-inline\">\r\n");
      out.write("            <h3> Please enter the Symptoms</h3>\r\n");
      out.write("            <hr>\r\n");
      out.write("\t<label for=\"location\">Symptom1* </label>\r\n");
      out.write("\t<input type=\"text\" class=\"form-control\" name=\"symptom1\"  placeholder=\"Symptom1\" required=\"required\">\r\n");
      out.write("\t<hr> \r\n");
      out.write("        <label for=\"location\">Symptom2 (if any) </label>\r\n");
      out.write("\t<input type=\"text\" class=\"form-control\" name=\"symptom2\"  placeholder=\"Symptom2\" value=\"null\">\r\n");
      out.write("\t<hr> \r\n");
      out.write("        <label for=\"location\">Symptom3 (if any)</label>\r\n");
      out.write("        <input type=\"text\" class=\"form-control\" name=\"symptom3\"  placeholder=\"Symptom3\" value=\"null\">\r\n");
      out.write("\t<hr> \r\n");
      out.write("        <label for=\"location\">Symptom4 (if any)</label>\r\n");
      out.write("\t<input type=\"text\" class=\"form-control\" name=\"symptom4\"  placeholder=\"Symptom4\" value=\"null\">\r\n");
      out.write("\t<hr> \r\n");
      out.write("\t<label for=\"location\">Symptom5 (if any)</label>\r\n");
      out.write("        <input type=\"text\" class=\"form-control\" name=\"symptom5\"  placeholder=\"Symptom5\" value=\"null\">\r\n");
      out.write("\t<hr>\r\n");
      out.write("        <label for=\"location\">Enter patient's present age*</label>\r\n");
      out.write("        <input type=\"text\" class=\"form-control\" name=\"age\"  placeholder=\"age\" required=\"required\">\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<button type=\"submit\" class=\"btn-lg btn-info\">Predict Disease</button>\r\n");
      out.write("        <hr>\r\n");
      out.write("        \r\n");
      out.write("         \r\n");
      out.write("        </div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("    </section>\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("\t<!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
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
