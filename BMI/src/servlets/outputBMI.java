package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/output-bmi")
public class outputBMI extends HttpServlet{
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException,ServletException {
        response.setContentType("text/html");

        double weight = Double.valueOf(request.getParameter("weightField"));
        double height = Double.valueOf(request.getParameter("heightField"));

        double result = weight/(height * height) * 10000;

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        
        out.println("<head><title>Result</title></head>");
        out.println("<body style='margin-top:10em;'>");
        out.println("<center>");
        out.println("Your BMI : " + result + " <br><br> "); 
        
        if (result < 18.5) 
            out.println(" <b style='background-color:aliceblue'> Underweight </b>");
        else if(result >= 18.5 && result < 25)
            out.println(" <b style='background-color:green'> Normal Weight </b>");
        else if(result >= 26 && result < 30)
            out.println("<b style='background-color:orange'> Overweight </b>");
        else if(result >= 31 && result < 40)
            out.println("<b style='background-color:red'> Obese </b>");
            out.println("</center>");
        out.println("");
        out.println("");
        out.println("</body></html>");
    }
    
}