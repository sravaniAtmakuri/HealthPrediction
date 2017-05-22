<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
		<title>Smart health predictor App </title>
		<meta name="description" content="Wiredeiki App">
		<!-- LAtest compiled and minified CSS-->
		<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">

	
	</head>
	
	<body>
	<!--Navbar -->
	<nav class="navbar navbar-inverse navbar-fixed-top" id="my-navbar">
	<div class="container">
	<div class="navbar-header">
	<button type="button" class="navbar-toogle" data-toogle="collapse" data-target="#navbar-collapse">
		</button>
	<a href="" class="navbar-brand">Smart Health Predictor</a>
	</div><!--navbar header-->
	
	<div class="collapse navbar-collapse" id="navbar-collapse">
	<ul class="nav navbar-nav">
	 <li><a href="PatientMyProfile.jsp">MY PROFILE</a>
	 <li><a href="SearchDoctor.jsp">SEARCH DOCTOR</a>
	 <li><a href="FeedbackPatient.jsp">FEEDBACK</a>
            
                                            <li><a class="" href="logout.jsp">LOGOUT</a></li>
                                    
	 
	 
	</ul>
	</div>
	</div><!--End container-->
	</nav><!--End navbar-->
	<!--jumbotron-->
	<div class="jumbotron">
	<div class="container text-center">
	<h1>Disease Prediction</h1>
	<p>Using Data Mining</p>
		</div>
	</div><!-- End jumbotron-->
	
<!--	</div class="container">
	<section>
	<div class="page-header" id="navbar-collapse#feedback">
	<h2>Feedback </h2>
	</div>  
	</section>
	</div><!-- End container--> 
	<!-- call to action-->
	<section>
            <div class="container text-center">
            <form action="PatientHomePageServlet" method="post">
            <p style="color: green">
                                    <%
                                        String message1=request.getParameter("message4");
                                        if(message1!=null)
                                        {%>
                                         <h1   style="color: green">    <%=message1%> </h1>
                                       <% }
                                    %>
	
	
	
	<div class="form-inline">
            <h3> Please enter the Symptoms</h3>
            <hr>
	<label for="location">Symptom1* </label>
	<input type="text" class="form-control" name="symptom1"  placeholder="Symptom1" required="required">
	<hr> 
        <label for="location">Symptom2 (if any) </label>
	<input type="text" class="form-control" name="symptom2"  placeholder="Symptom2" value="null">
	<hr> 
        <label for="location">Symptom3 (if any)</label>
        <input type="text" class="form-control" name="symptom3"  placeholder="Symptom3" value="null">
	<hr> 
        <label for="location">Symptom4 (if any)</label>
	<input type="text" class="form-control" name="symptom4"  placeholder="Symptom4" value="null">
	<hr> 
	<label for="location">Symptom5 (if any)</label>
        <input type="text" class="form-control" name="symptom5"  placeholder="Symptom5" value="null">
	<hr>
        <label for="location">Enter patient's present age*</label>
        <input type="text" class="form-control" name="age"  placeholder="age" required="required">
	<hr>
	<button type="submit" class="btn-lg btn-info">Predict Disease</button>
        <hr>
        
         
        </div>
	</form>
	</div>
	
    </section>	
	
	
	
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	</body>
</html>