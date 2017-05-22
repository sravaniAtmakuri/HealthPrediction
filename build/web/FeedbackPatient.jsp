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
                <div class="container">
	<div class="navbar-header">
	<button type="button" class="navbar-toogle" data-toogle="collapse" data-target="#navbar-collapse">
		</button>
	<a href="" class="navbar-brand">Smart Health Predictor</a>
	</div><!--navbar header-->
	
	<div class="collapse navbar-collapse" id="navbar-collapse">
	 <ul class="nav navbar-nav">
         <li><a href="PatientHomePage1.jsp">HOME</a>
         <li><a href="PatientMyProfile.jsp">MY PROFILE</a></li>
         <li><a href="SearchDoctor.jsp">SEARCH DOCTOR</a>
	 </ul>
         <ul class="nav navbar-nav navbar-right">
         <li><a class="" href="logout.jsp">LOGOUT</a></li>
         </ul>
	</div>
	</div><!--End container-->
  			
  		</nav> 

  		

  		<div class="jumbotron">
			<div class="container text-center" style="max-height: 100px">
				<h1>Disease Prediction</h1>
				<p> Using Data Mining</p>
			</div>
		</div>

<section id="contact" class="content-section text-center">
 <div class="modal-dialog">
    <div class="modal-content">
        <div class="modal-header">
          <h1 class="text-center">Feedback</h1>
        </div>
         <form  action="FeedbackPatientServlet" method="post">
         <p style="color: green">
                                    <%
                                        String message1=request.getParameter("message3");
                                        if(message1!=null)
                                        {%>
                                         <h1   style="color: green">    <%=message1%> </h1>
                                       <% }
                                    %>
          <p style="color: red">
                                    <%
                                        String message2=request.getParameter("message4");
                                        if(message2!=null)
                                        {%>
                                        <%=message2%>
                                     <% }
                                    %>
                                </p>                           
                                    
                                </p>
         <div class="modal-body">
             <div class="form-group">
                 <input type="text" id="submitFeedback" name="submitFeedback" placeholder="Write a feedback about our app" class="form-control input-lg"/>
             </div>

            <div class="form-group">
                 
               
     
                <button type="submit "class="btn btn-info" >SUBMIT FEEDBACK</button>

                </form>
             
            </div>

            
         </div>
         </form>
        </div>
    </div>    
</section>
    <script src="https://code.jquery.com/jquery-3.1.1.js"> </script>
  
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"> </script>
</body>	
</html> 