<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%!boolean[] status=new boolean[31];%>
<%!String[] color = new String[31]; %>
<%!String[] password=new String[31]; %>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
 <link rel="stylesheet" type="text/css" href="style.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>


<!-- store the password from Locker.jsp to array based on its index  -->
<%if(request.getParameter("password")!=null){
	int in=Integer.valueOf(request.getParameter("index"));
	String passwordFromLocker = request.getParameter("password");
	if(request.getParameter("status").equals("true")){
	out.println("HELLOOO");
		status[in]=false;
		password[in] =  passwordFromLocker;
	}else{
		out.println("WORLDDD");	
		status[in] = true;
		password[in] = " ";
	}
} else{

	for(int i=0 ; i<15 ; i++){
		status[i] = false;
	}
	for(int i=15 ; i<status.length ; i++){
		status[i] = true;
}


}

%>


<style>
td .customBtn{
	height:80px;
	width:80px;
}

.modal-title{
	text-align: center;
}
td{
	padding:.7em;
}
</style>

<div class="container" style="background-color:rgba(48, 48, 47,.z7);">

<h1 style="color:white">
	<center> Locker Management System </center>
</h1>
<center>
<table>
		<%int k=0; %>
		<%for(int i=0;i<5;i++){ %>
		<tr>
			<% for(int j=0;j<6;j++){ %>
			<% k++; %>
			<td>
				<!-- Button to Open the Modal -->
				<%--<% if(status[k]){ %>
				  <button type="button" class="btn btn-success customBtn"
				   data-toggle="modal" data-target="#myModal">
				    <%=k %>
				  </button>
				  <%}else{ %>
				  <button type="button" class="btn btn-danger customBtn"
				   data-toggle="modal" data-target="#myModal">
				    <%=k %>
				  </button>
				  <% }%> --%>
				  
				  <form action="Locker.jsp">
				  	<input type="hidden" name="status" value="<%=status[k] %>">
				  	<% if (status[k]){ %>
				  	<input type="submit" name="index" class="btn btn-success customBtn" value="<%=k%>">
				  	<%}else{ %>
				  	<input type="submit" name="index" class="btn btn-danger customBtn" value="<%=k%>">
				  	<%} %> 
				  </form>
				  
			</td>
			<%} %>
		</tr>
		<%} %>
</table>

</div>

</body>
</html>