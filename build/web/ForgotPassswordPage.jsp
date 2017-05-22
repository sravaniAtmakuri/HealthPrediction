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
	
<script>
    function myFunction1() {
        var password1 = document.getElementById("password").value;
        var password2 = document.getElementById("Confirmpassword").value;
        var ok=true;
        if (password1 != password2) {
            alert("Passwords Do not match");
            document.getElementById("password").style.borderColor = "#E34234";
            document.getElementById("Confirmpassword").style.borderColor = "#E34234";
             ok=false;
        }
        else {
            //alert("Passwords Match!!!");
            document.getElementById("ForgotPasswordPageServlet").submit();
             document.getElementById('submit').disabled = false;
        }
        return ok;
    }
</script>	



	
<body>

  		<nav class= "navbar navbar-inverse navbar-fixed-top" id="my-navbar">
  			
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
          <h1 class="text-center">Forgot Password</h1>
        </div>
         <form  action="ForgotPasswordPageServlet" id="ForgotPasswordPageServlet" method="post" onsubmit=" return myFunction1()">
              <p style="color: red">
                                    <%
                                        String message1=request.getParameter("message1");
                                        if(message1!=null)
                                        {%>
                                        <%=message1%>
                                     <% }
                                    %>
                                </p>
             
         <div class="modal-body">
             <div class="form-group">
                 <input type="text" id="userName" name="userName" placeholder="Username" class="form-control input-lg"/>
             </div>

             <div class="form-group">
                 <input type="password" id="password" name="password" placeholder="Password" class="form-control input-lg" />
             </div>
			 
			 <div class="form-group">
                 <input type="password" id="Confirmpassword" name="Confirmpassword" placeholder="Re enter Password" class="form-control input-lg" />
             </div>

             <div class="form-group">
              
                 <input type="submit" class="btn btn-block btn-lg btn-primary"  name="submit" id="submit" value="Submit"/>
               
             <!--    <span class="center"><a href="LoginPage.jsp">Login</a></span><span></span> -->

             </div>
         </div>
                          </form>

    </div>
 </div>

  		
    <script src="https://code.jquery.com/jquery-3.1.1.js"> </script>
  
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"> </script>
</body>	
</html> 