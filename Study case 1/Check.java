package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Check
 */
@WebServlet("/Check")
public class Check extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//multidimensional array for employee identity
	String [][]identity =new String[][] {
		{"James Arthur","Charles Xavier","Henderson","Morgan Smash","Alex Koplo","Young Lex","Harrison Hills","Adam Levin","Martin Garrix","Jones"},
		{"1918843","1918271","1812232","1712382","1928313","1928137","1827341","1928361","1928456","1637529"}};

	//amount of employee is equals to size of array identity
	int amountOfEmployee = identity[0].length;
		
	//array to store working hour each day
	double [][]workingHour=new double[22][amountOfEmployee];
	
	//array to store the number of days for each employee
	int [] day=new int[amountOfEmployee];
	double rate=6;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		//condition to avoid null pointer exception
		String status=request.getParameter("idInput");
		if(status!=null) {
			double startTime=convertStartTime(request.getParameter("starttime"));
			double endTime=convertEndTime(request.getParameter("endtime"));
			String id=request.getParameter("idInput");
			pushWorkingHour(id, startTime, endTime);
		}
		
		
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<html><body>"+
				"<style>\r\n" + 
				"	    h1 {text-align:center;}\r\n" + 
				"	    p{text-align:center;}\r\n" + 
				"	    body {font-family: 'Helvetica', Times, serif;font-size: 18px;text-align:center;background-color: lightseagreen;}\r\n" + 
				"        table{font-family: arial, sans-serif;border-collapse: collapse;width: 70%;}\r\n" + 
				"        td, th {border: 1px solid #dddddd;text-align: center;padding: 8px;}\r\n" + 
				"        tr:nth-child(even) {background-color: #5F9EA0;}\r\n" + 
				"</style>");
		
		out.println("<br><br><h1>Payroll Management System</h1><br>"
				+ "<form method='post' action='Check'>"
				+ "<b> <input type='text' placeholder='insert Id' name='idInput' id='idInput' required> </b>"
				+ "<b>Start Time</b><input type='text' name='starttime' id='inputStartTime' placeholder='HH:MM (24H)' required><b>End Time</b><input type='text' name='endtime' id='inputEndTime' placeholder='HH:MM (24H)' required>"
				+ "<input type=submit value='upload'>"
				+ "</form>"+
				"<table id='table' border='1' align = center>\r\n" + 
				"            <tr><th>Name</th><th>ID</th><th>Salary</th></tr>\r\n" + 
				"            <br><br><br>");
		
		//to display id,name,salary in the form of table
		for(int i=0;i<amountOfEmployee;i++) {
			out.println("<tr>"
					+ "<td>"+identity[0][i]+"</td>"
					+ "<td>"+identity[1][i]+"</td>"
					+ "<td id ='salary"+i+"'>"+calculateSalary(i)+"</td>");
		}
		out.println("</table>"
				+ "<a href='index.html'><button>Logout</button></a>");
		out.println("</body></html>");
	}
	
	//calculate salary based on rate and deducted by 11% for EPF
	protected double calculateSalary(int empIndex) {
		double total=0;
		for(int i=0;i<workingHour.length;i++) {
			total+=workingHour[i][empIndex];
		}
		return total*rate*0.89;
	}
	
	//push or insert working value to array
	protected void pushWorkingHour(String id,double startTime,double endTime) {
		for(int i=0;i<identity[1].length;i++) {
			if(id.equalsIgnoreCase(identity[1][i])) {
				
				//condition to check whether employee work days have reach 22 days 
				if(day[i]<=22)
					day[i]++;
				else
					day[i]=0;
				
				//pushing to workingHour multidimension array
				workingHour[day[i]][i]=endTime-startTime;
				break;
			}
		}
	}
	
	//convert start time from string to double, get hour value +1 hour if minute value more than 0 
	protected double convertStartTime(String time) {
		String []arrTime=time.split(":");
		
		//define minute and hour based on this conversion from String to double
		double min=Double.valueOf(arrTime[1]);
		double hour=Double.valueOf(arrTime[0]);
		
		if(min>0) {
			//Get hour from arrTime in index 0 and + 1 if minute value more than 0
			return hour+1;
		}else
			return hour;
	}
	
	//convert end time from string to double, get hour value
	protected double convertEndTime(String time) {
		String []arrTime=time.split(":");
		double min=Double.valueOf(arrTime[1]);
		//in end time hour add by minute devided by 60 as a total hour
		double hour=Double.valueOf(arrTime[0])+(min/60);
		return hour;
	}
}
