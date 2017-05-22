<%@page import="Service.Service" %>
<%@page import="javax.servlet.ServletException" %>
<%@page import="javax.servlet.http.HttpServlet" %>
<%@page import="javax.servlet.http.HttpServletRequest" %>
<%@page import="javax.servlet.http.HttpServletResponse" %>
<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="java.util.ArrayList" %>
<%@page import="bean.PatientBean" %>

<%
    Service service = new Service();
    String s = (String) session.getAttribute("userName");
  PatientBean al = service.retrievePatientData(s);
%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<title> Smart Health App</title>
	<meta name="description" content="Smart Health App">


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
	
</head>
	



	
<body>

  		<nav class= "navbar navbar-inverse navbar-fixed-top" id="my-navbar">
                      <ul class="nav navbar-nav">
                      <li><a href="PatientHomePage1.jsp">HOME</a>
                     
                      <li><a href="FeedbackPatient.jsp">FEEDBACK</a>
                      <li><a href="SearchDoctor.jsp">SEARCH DOCTOR</a></li>
	              </ul>
                    
  			<ul class="nav navbar-nav navbar-right">
                                            <li><a class="" href="logout.jsp">LOGOUT</a></li>
                                        </ul>
  		</nav> 

  		

  		<div class="jumbotron">
			<div class="container text-center" style="max-height: 100px">
				<h1>Disease Prediction</h1>
				<p> Using Data Mining</p>
			</div>
		</div>


 <div class="modal-dialog">
    <div class="modal-content">
        <div class="modal-header">
          <h1 class="text-center">My Profile</h1>
        </div>
        <form class="form-horizontal" id="patientProfileEdit" method="post" action="PatientMyProfileEditServlet" >
       <!--  <form  action="PatientRegistration" method="post">  -->
             <p style="color: red">
                     <!--               <%
                                        String message=request.getParameter("message");
                                        if(message!=null)
                                        {%>
                                        <%=message%>
                                     <% }
                                    %>  -->
                                </p>
       
            <div class="panel-body">
              <div class="row">
                <div class="col-md-1 col-lg-1 " align="center">  </div>
                
                   <div class=" col-md-11 col-lg-11 " align="right"> 
                  <table class="table table-user-information">
                    <tbody>
                      <tr>
                        <td name="Name">Name</td>
                       
                        <td>   <input type="text"  name="name" value="<%=al.getName()%>"> </input></td>
                      </tr>
                      <tr>
                        <td>Email</td>
                        <td ><input type ="text" name="email" value="<%=al.getEmail()%>"></input></td>
                      </tr>
                      <tr>
                        <td>Age</td>
                        <td><input type="text" name="age" value="<%=al.getAge()%>"></input></td>
                      </tr>
                   
                         <tr>
                             <tr>
                        <td>Gender</td>
                        <td><input type="text" name="gender" value="<%=al.getGender()%>"></input></td>
                      </tr>
                        <tr>
                        <td>Address</td>
                        <td><input type="text" name="address" value="<%=al.getAddress()%>"</input></td>
                      </tr>
                        
                     
                    </tbody>
                  </table>
                  <div class="form-inline">
                  <input type="submit" class="" value="Save"/>
             </div>
                 
                </div>
              </div>
            </div>
           </form>
                      
  		
    <script src="https://code.jquery.com/jquery-3.1.1.js"> </script>
  
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"> </script>
</body>	
</html> 