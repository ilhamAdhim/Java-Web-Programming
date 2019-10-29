package servlets;
//Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
//Extend HttpServlet class

public class ServletLifeCycle extends HttpServlet {
	private String message = “Hello World”;
	public void doGet(HttpServletRequest request,
	HttpServletResponse response) throws ServletException,
	IOException {
	//Set response content type
	response.setContentType("text/html");
	//Actual logic goes here.
	PrintWriter out = response.getWriter();
	out.println("<h1>" + message + "</h1>");
	}
}