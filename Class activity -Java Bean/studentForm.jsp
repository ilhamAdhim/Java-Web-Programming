<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<meta charset="UTF-8">
	<head>
		<title>Insert title here</title>
	</head>
	<body>
		<font face=”arial” size=”2” color=”#000000”>
		<form method="POST" action='StudentInfo.jsp'>
			<table>
				<tr>
					<td>Name</td>
					<td>:</td>
					<td><input type="text" name=”name”></td>
					
				</tr>
				<tr>
					<td>matric Number</td>
					<td>:</td>
					<td><input type="text" name="matricNo">
					</td>
					
				</tr>
				<tr>
					<td>Gender</td>
					<td>:</td>
					<td><input type='radio' name=”gender” size=”30” value="male">Male
						<input type='radio' name=”gender” size=”30” value="female">Female
					</td>
					
				</tr>
				<tr>
					<td>Date of Birth</td>
					<td>:</td>
					<td><input type='text' name="dateOfBirth" size=”30”></td>
					
				</tr>
				<tr>
					<td> Citizenship </td>
					<td>:</td>
					<td><input type='text' name=”citizenship” size=”30”></td>
					
				</tr>
				<tr>
					<td>Marital Status</td>
					<td>:</td>
					<td><input type='radio' name="maritalStatus" value='single' size=”30”>Single</td>
					<td><input type='radio' name="maritalStatus" value='married' size=”30”>Married</td>	
				</tr>
				<tr>
					<td>Religion</td>
					<td>:</td>
					<td>
					
					<select name = "religion">
						<option value="Islam"> Islam </option>
						<option value="Christian"> Christian </option>
						<option value="Hindu"> Hindu </option>
					</select>
					
					</td>
				</tr>
				
				<tr> 	
					<td>Active</td>
					<td>:</td>
					<td><input type='radio' name=active value="true"size=”30”>Yes</td>
					<td><input type='radio' name=”active” value="false"size=”30”>No</td>
					
				</tr>
				<tr>
					<td>currentYear</td>
					<td>:</td>
					<td><input type='text' name="currentYear" size=”30”></td>
					
				</tr>
				<tr>
					<td>IdNo</td>
					<td>:</td>
					<td><input type='text' name="idNo" size=”30”></td>
					
				</tr>
				<tr>
				<td>
					<input type='submit'  size=”30”>
					<input type='reset' size=”30” value="Clear"></td>
				</tr>
			</table>
		</form>
	</body>
</html>