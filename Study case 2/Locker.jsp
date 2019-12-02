
<% String status = request.getParameter("status"); %>
<% String index = request.getParameter("index");%>
<% String password = request.getParameter("password"); %>
<% float duration=0 ; %>
<% float total=0; %>

<%int count = 3; %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!--============================================================================================ -->
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
 <link rel="stylesheet" type="text/css" href="style.css">
 <!--============================================================================================ -->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <!--============================================================================================ -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <!--============================================================================================ -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  <!--============================================================================================ -->
  
<meta charset="ISO-8859-1">
<title>Locker Info</title>
</head>
<body>

<script type="text/javascript">
var check = function(){
	let success_message = document.getElementById('showSuccess');
	let warning_message = document.getElementById('showAlert');
	let register_btn = document.getElementById('btnRegister');
	
	  if (document.getElementById('password').value == document.getElementById('confirm_password').value) {
		  success_message.style.display = "block";
		  warning_message.style.display = "none";
	  } else {
		  success_message.style.display = "none";
		  warning_message.style.display = "block";
	  }
	}
	
	
	
</script>

<style>
	body,html{
		height:100%;
		width:100%;
	}
	
	#message{
		width:100%;
	}
</style>
<!-- Button to open the modal -->
<div class="container" style="background-color:rgba(48, 48, 47,.7);">
<center style="margin-top:15em;padding:2em;">
	
	<% if(status.equals("true")){ %>
	<button type="button" class="btn btn-success" data-toggle="modal" data-target="#myModal"> Register locker <%=index %> </button>
	<%}else{ %>
	<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#myModal"> Login to locker <%=index %> </button>
	<%} %>

	</center>
</div>

  <!-- The Modal -->
	<div class="modal fade" id="myModal"  style="margin-left:-20em">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <!-- Modal Header -->
	      <div class="modal-header">
	        <h4 class="modal-title">
	        
	        <% if (status.equals("true")){ %>
	        Register your locker
	        <% }else{ 
	        duration=1+(int)(Math.random()*79);%>
	        
	        Login to your locker
	        <%} %>
	        
	        </h4>
	        <button type="button" class="close" data-dismiss="modal">&times;</button>
	      </div>
	      <!-- Modal body -->
	      <div class="modal-body">
	      <% if (status.equals("true")){ %>
	      <%--Registration process --%>
	        Locker no = <%=index%> <br>
			status = <%=status%><br>
			 
			<form action="main.jsp" style="margin-top:1em;" method="POST">
				<div class="md-input form-group">
				<input type="hidden" name="index" value=<%=index %>>
				<input type="hidden" name="status" value=<%=status %>>
                       <input type="password" name="password" id="password" 
                       class="md-form-control form-control form-control-lg rounded-0" required onkeyup='check();'>
                       <span class="highlight"></span>
                       <span class="bar"></span>
                       <label>Password</label>
                       <div id="username-validate"></div>
                   </div>

                   <div class="md-input form-group">
                       <input type="password" name="password"id="confirm_password"
                           class="md-form-control form-control form-control-lg rounded-0" required onkeyup='check();'>
                       <span class="highlight"></span>
                       <span class="bar"></span>
                       <label>Re-enter password</label>
                       <div id="password-validate"></div>
                   </div>
                   
                   
                   
                   <div class="alert alert-success" role="alert" id="showSuccess" style="display:none">
                   Password match !
                   </div>
                   
                   <div class="alert alert-danger" role="alert" id="showAlert" style="display:none">
  					Password did not match !
  					</div>
                   
                   
                   <br>
				<input type="submit" value="Register" class="btn btn-info" id="btnRegister">
				<button type="button" class="btn btn-danger" data-dismiss="modal" id="btnClose">Close</button>
			</form>
			<% } else{%>
	      <%--Login process with defined password on the specific locker --%>
	      	 Locker no = <%=index%> <br>
			status = <%=status%><br>
			<form action="main.jsp" style="margin-top:1em;" method="POST">
				<div class="md-input form-group">
				<input type="hidden" name="index" value=<%=index %>>
				<input type="hidden" name="status" value=<%=status %>>
                       <input type="password" name="password" 
                       id="loginPassword" class="md-form-control form-control form-control-lg rounded-0" required>
                       <span class="highlight"></span>
                       <span class="bar"></span>
                       <label>Password</label>
                       <div id="username-validate"></div>
                   </div>
                  
                  <div class="alert alert-danger" role="alert" id="showAlert" style="display:none">
  					Password did not match ! Attempt(s) left : 
  					<div id="count">
	  					<%=count %>
  					</div>
  					</div>
                  
				<button type="button" value="Login" class="btn btn-info" id="btnOpenModal"  data-toggle="modal" data-target="#secondModal">
				Login
				</button>
				<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
			</form>
			
			<div class="modal fade" id="secondModal" style="margin-left:20em">
	  			<div class="modal-dialog">
	    			<div class="modal-content">
	      			<!-- Modal Header -->
	      		<div class="modal-header">
	        		<h4 class="modal-title"> Receipt </h4>
	        		</div>
	        		<%
	        		if(duration <= 6){
	        			total = (float)0.5*duration;
	        		}else if(duration <= 24 && duration >= 7){
	        			total = 2*(duration-6) + 3;
	        		}else if(duration <= 72 && duration >= 25){
	        			total = 5*(duration-24) +37; 
	        		}else if(duration >= 73){
	        			total = 287;
	        		}else
	        		
	        		
	        		%>
	        		<div class="modal-body">
	        			Locker number : <%=index %>
	        			<br>
	        			<hr>
						Duration : <%=duration %> hours
						<br>
						<hr>
						Price : <%=total %>
						<br>
						<hr>
						 
	        		</div>
	        		<input type="submit" class="btn btn-danger" value="Checkout">
	        		</div>
	        		</div>
	        		</div>
	
	      <%} %>
	      </div>
	    </div>
	  </div>
	</div>
</form>
</body>
</html>