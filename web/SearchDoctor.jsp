<%-- 
    Document   : SearchDoctor
    Created on : Mar 13, 2017, 11:50:25 AM
    Author     : sukhpreet
--%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
            <li><a href="PatientHomePage1.jsp">HOME</a>
	<li><a href="PatientMyProfile.jsp">MY PROFILE</a>
	<li><a href="FeedbackPatient.jsp">FEEDBACK</a>
	<ul class="pull-navbar-right">
         <li><a class="" href="logout.jsp">LOGOUT</a></li>
         </ul>
	 
	</ul>
	</div>
	</div><!--End container-->
	</nav><!--End navbar-->
	<!--jumbotron-->
	<div class="jumbotron">
	<div class="container text-center">
	<img src="health.jpg" class="img-responsive" alt="Cinque Terre" > 
	<h1>Disease Prediction</h1>
	<p>Using Data Mining</p>
		</div>
	</div><!-- End jumbotron-->
	
	<!-- call to action-->
	<section>
	<div class="container text-center">
	<form name="searchdoctorform" action="searchDoctorResult.jsp" class="form-inline" method="post">
	<div class="form-group">
	
	<label for="location">Location  </label>
	<input type="text" class="form-control" name="location"  placeholder="Please provide the location">
	<hr> 
	<p style="font-family:verdana"> Gender
	<label class="radio-inliine"><input type="radio" name="optradio" value="M">Male</label>
        <label class="radio-inliine"><input type="radio" name="optradio" value="F">Female</label>
  	<hr>
	<!--</div><!-- End container-->
	<!--<div class="container text-center" name="#searchdoctor">-->
	<!--<form action="search" class="form" method=""post>-->
	<button type="submit" class="btn-lg btn-info">Search Doctor</button>
        <hr>
        
        <a href="HomePagePatient.html" class="btn-lg btn-warning" >Home</a>
      
	
	</form>
	</div>
	
    </section>	
	
	
	
	
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	</body>
</html>
