<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="studentInfo" class="servlet.Student"></jsp:useBean>
<jsp:setProperty property="*" name="studentInfo"/>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%="Name : " + studentInfo.getName() %>
	<br>
	<%="Matric No : " + studentInfo.getMatricNo()%>
	<br>
	<%="Gender : " + studentInfo.getGender()%>
	<br>
	
	<%="DOB : " + studentInfo.getDateOfBirth()%>
	<br>
	<%="Citizenship : " + studentInfo.getCitizenship()%>
	<br>
	<%="Marital Status : " + studentInfo.getMaritalStatus()%>
	<br>
	<%="Religion : " + studentInfo.getReligion() %>
	<br>
	<%="Current Year : " + studentInfo.getCurrentYear() %>
	<br>
	<%="Id No : " + studentInfo.getIdNo() %>
	<br>
	
</body>
</html>