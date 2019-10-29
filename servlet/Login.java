package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//username and password for authentication
	String []username =new String[]{"Arga","Ilham","Ikmal","Azhad"};
	String []password=new String[] {"123","234","345","456"};
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		
		if(isRegistered(name, pass)) {
			request.getRequestDispatcher("Check").forward(request, response);
		}else {
			response.sendRedirect("index.html");
		}
	}
	protected boolean isRegistered(String name, String pass) {
		for(int i=0;i<username.length;i++) {
			if(name.equals(this.username[i]) && pass.equals(this.password[i]))
				return true;
		}
		return false;
	}
	protected int getIndex(String name) {
		for(int i=0;i<name.length();i++) {
			if(name.equals(this.username[i]))
				return i;
		}
		return -1;
	}

}
