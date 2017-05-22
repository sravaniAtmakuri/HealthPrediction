<%
  // HttpSession session = request.getSession();
    String doc_email=request.getParameter("messageDoc");
    session.setAttribute("dEmail", doc_email);
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
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<link rel="stylesheet" type="text/css" href="css/coin-slider.css" />
<link rel="stylesheet" type="text/css" media="all" href="css/jsDatePick_ltr.min.css"/>
        <script type="text/javascript" src="jsDatePick.min.1.3.js"> </script>
        <script type="text/javascript">
        window.onload=function(){
            
                new JsDatePick({
                    useMode: 2,
                    target:"adate",
                            dateFormat:"%d-%m-%Y"
                });
             
            };     
        </script>
</head>
	
<script>
    function myFunction() {
        var password1 = document.getElementById("password").value;
        var password2 = document.getElementById("confirmpassword").value;
        var ok=true;
        if (password1 != password2) {
            alert("Passwords Do not match");
            document.getElementById("password").style.borderColor = "#E34234";
            document.getElementById("confirmpassword").style.borderColor = "#E34234";
            ok=false;
        }
        else {
            //alert("Passwords Match!!!");
            document.getElementById("DocRegPageServlet").submit();
        }
    return ok;
    }
</script>	




	
<body>

  		<nav class= "navbar navbar-inverse navbar-fixed-top" id="my-navbar">
  			
  		</nav> 
<div class="collapse navbar-collapse" id="navbar-collapse">
	<ul class="nav navbar-nav">
            <li><a href="PatientHomePage1.jsp">HOME</a>
                <ul class="nav navbar-nav navbar-right">
                                            <li><a class="" href="logout.jsp">LOGOUT</a></li>
                                        </ul>
	 
	 
	</ul>
	</div>
  		

  		<div class="jumbotron">
			<div class="container text-center" style="max-height: 100px">
				<h1>Disease Prediction</h1>
				<p> Using Data Mining</p>
			</div>
		</div>


 <div class="modal-dialog">
    <div class="modal-content">
        <div class="modal-header">
          <h1 class="text-center">Book your appointment</h1>
        </div>
         <form  id="bookAppointment" method="post" action="bookAppointment" >
             <p style="color: red">
                                    <%
                                        String message=request.getParameter("message");
                                        if(message!=null)
                                        {%>
                                        <%=message%>
                                     <% }
                                    %>
                                </p>
         <div class="modal-body">
             <div class="form-group">
                 <input type="text" name="name" id="name" required="required" class="form-control"   placeholder="Enter your Name"/>
                </div>

             <div class="form-group">
                <input type="text"  name="email" id="email" required="required" class="form-control"   placeholder="Enter your Email"/>
                </div>
              <div class="form-group">
             <input type="Date" name="adate" id="adate" required = "required"  class="form-control"   placeholder="Appointment date"/>                    
                </div>

              <div class="form-group">
                <input type="text"  name="atime" id="atime"  required="required"  class="form-control"  placeholder="Appointment time"/>
                </div>
            
              <div class="form-group">
              <input type="radio" name="gender" value="M" />Male
<input        type="radio" name="gender" value="F" />Female
                  
                </div>
             
             <div class="form-group">
              
                 <input type="submit" class="btn btn-block btn-lg btn-primary" value="Book"/>
                
             </div>
         </div>
                          </form>

    </div>
 </div>

  		
    <script src="https://code.jquery.com/jquery-3.1.1.js"> </script>
  
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"> </script>
</body>	
</html> 