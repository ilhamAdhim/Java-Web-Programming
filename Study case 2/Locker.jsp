
<% String status = request.getParameter("status"); %>
<% String index = request.getParameter("index");%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
 <link rel="stylesheet" type="text/css" href="style.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Locker Info</title>
</head>
<body>

<!-- Button to open the modal -->
<% if(status.equals("true")){ %>
<button type="button" class="btn btn-success" data-toggle="modal" data-target="#myModal"> Register locker <%=index %> </button>
<%}else{ %>
<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#myModal"> Login to locker <%=index %> </button>
<%} %>

<a href="main.jsp">
	<button class="btn btn-info"> Back to main menu</button>
</a>

  <!-- The Modal -->
	<div class="modal fade" id="myModal"  style="margin-left:-20em">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <!-- Modal Header -->
	      <div class="modal-header">
	        <h4 class="modal-title">
	        
	        <% if (status.equals("true")){ %>
	        Register your locker
	        <% }else{ %>
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
                       <input type="password" name="password" class="md-form-control form-control form-control-lg rounded-0" required>
                       <span class="highlight"></span>
                       <span class="bar"></span>
                       <label>Password</label>
                       <div id="username-validate"></div>
                   </div>

                   <div class="md-input form-group">
                       <input type="password" name="password"
                           class="md-form-control form-control form-control-lg rounded-0" required>
                       <span class="highlight"></span>
                       <span class="bar"></span>
                       <label>Re-enter password</label>
                       <div id="password-validate"></div>
                   </div>
                   
				<input type="submit" value="Register" class="btn btn-info">
				<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
			</form>
			<% } else{%>
	      <%--Login process with defined password on the specific locker --%>
	      	 Locker no = <%=index%> <br>
			status = <%=status%><br>
			<form action="main.jsp" style="margin-top:1em;" method="POST">
				<div class="md-input form-group">
				<input type="hidden" name="index" value=<%=index %>>
				<input type="hidden" name="status" value=<%=status %>>
                       <input type="password" name="password" class="md-form-control form-control form-control-lg rounded-0" required>
                       <span class="highlight"></span>
                       <span class="bar"></span>
                       <label>Password</label>
                       <div id="username-validate"></div>
                   </div>
                  
				<button type="button" value="Login" class="btn btn-info" data-toggle="modal" data-target="#secondModal">
				Login
				</button>
				<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
			</form>
			
			<div class="modal fade" id="secondModal" style="margin-left:20em">
	  			<div class="modal-dialog">
	    			<div class="modal-content">
	      			<!-- Modal Header -->
	      		<div class="modal-header">
	        		<h4 class="modal-title"> Hehehe</h4>
	        		
	        		</div>
	        		<div class="modal-body">
	        			akwoakwao
						Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.
						Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.
						Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.
						Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.
						Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.
						Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.
						Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.
						Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.
						Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.
						Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.
						Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.
						
						Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.
						Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.
						Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.
	        			
	        		</div>
	        		<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
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