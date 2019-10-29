package servlets;

// To save as "<TOMCAT_HOME>\webapps\hello\WEB-INF\classes\HelloServlet.java"
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/sayhello")
// Configure the request URL for this servlet (Tomcat 7/Servlet 3.0 upwards)
    public class OnlineResume extends HttpServlet {

    // The doGet() runs once per HTTP GET request to this servlet.
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {
        // Set the response MIME type of the response message
        response.setContentType("text/html");
        // Allocate a output writer to write the response message into the network socket
        PrintWriter out = response.getWriter();   

        // Write the response message, in an HTML page
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>My Resume</title></head>");

        out.println("<meta charset='UTF-8'/>");
        out.println("<meta http-equiv='X-UA-Compatible' content='IE=edge'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("</head>");

        // //  font awesome Icons 

		out.println("<link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.5.0/css/all.css' integrity='sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU' crossorigin='anonymous'>");
		
		// //  W3S.CSS framework 

		out.println("<link rel='stylesheet' type='text/css' href='https://www.w3schools.com/w3css/4/w3.css'>");
        // CSS Styling 
        out.println("<style>");
        out.println("body, html {");
        out.println("height: 100%;");
        out.println("line-height: 1.8;");
        out.println("font-family: 'Bodoni MT', Didot, 'Didot LT STD', 'Book Antiqua', Garamond, 'Times New Roman', serif;");
        out.println("scroll-behavior: smooth;}");

        out.println("td{width:50%;}");
        out.println(".photos{height:200px;}");
        out.println(".zoom{transition:transform .5s}");
        out.println(".zoom:hover{transform: scale(1.2)}");
        out.println(".TEST:hover{cursor:pointer;color:#CB1C1C;}");
        out.println("</style>");
        // End of CSS Styling 

        out.println("<body class='w3-responsive'>");
        out.println("<div class='w3-top w3-responsive'>");
        out.println("<div class='w3-navbar w3-container w3-card w3-teal'>");
        //Home navbar
        out.println("<a href='#Home' class='w3-bar-item w3-button w3-border-teal w3-bottombar w3-hover-border-green'>");
        out.println("<i class='fa fa-home'>HOME</i></a>");
        //Community navbar
        out.println("<a href='#Community'class='w3-bar-item w3-button w3-border-teal w3-bottombar w3-hover-border-green'>");
        out.println("<i class='fas fa-users'></i>Community</a>");
        //Galleries navbar
        out.println("<a href='#Galleries'class='w3-bar-item w3-button w3-border-teal w3-bottombar w3-hover-border-green'><i class='fa fa-camera'>Galleries</i></a>");
        out.println("</div></div>");

        //Opening photo
        out.println("<div class='bgimg-1 w3-display-container w3-animate-top' style='top:24px;''>");
        out.println("<img src='assets/opening.jpg' style='width: 100%;height: 100%;'' id='Home'>");
        out.println("<div class='w3-display-topmiddle w3-wide w3-responsive' style='white-space:nowrap;top:35px;border: 3px groove #F9C20D;padding: 5px;box-shadow: 2px 2px 10px #514C4C';>");
        out.println("<sup><i class='fas fa-quote-left'></i></sup>");
        out.println("Many legends and people have come before us. And now, it's our turn<sub>");
        out.println("<i class='fas fa-quote-right'></i></sub></div></div>");

        //First Section
        out.println("<div class='w3-content w3-container w3-padding-64'>");
        out.println("<h2 class='w3-center w3-wide w3-text-khaki'style='text-shadow:2px 3px 0px gray;''>HELLO WORLD!</h2>");
        
        out.println("<div class='w3-content w3-container'><div class='w3-left w3-panel w3-border-color-teal'style='font-weight: bold;box-shadow: 2px 2px 5px #737373;border-left: 3px solid #F70B0B;border-top: 3px solid #F70B0B;'>");
        out.println("<i class='fas fa-child'></i>ABOUT ME</div> <br> <br>");
        out.println("<div class='w3-left'><p>The name is Muhammad Ilham Adhim. Person who gets joy through seeing nature, articles,memes, and games. Loves History and Instrumental music. Exploring the system of our world through technology. Not master of anything, that's why i keep learning on what i concerned. Seeks professionality for the end, and self-encourage in order to reach it. <br></p></div></div>");
        //End of First Section

        
        //Learning Progress Section
        out.println("<div class='w3-content w3-container>");

        out.println("<div class='w3-content w3-container'><div class='w3-left w3-panel w3-border-color-teal'style='font-weight: bold;box-shadow: 2px 2px 5px #737373;border-left: 3px solid #F70B0B;border-top: 3px solid #F70B0B;'>");        
        out.println("<i class='fas fa-coffee'></i>Learning Progress</div> <br> <br>");
        out.println("<div class='w3-panel'><div class='w3-cell'>I concerned about tech-related stuffs. Not only because i took Informatics as my bachelor degree, but i'm also kind of interested at it . Recently i'm learning how to make a website with HTML and CSS. See my progress on right-side :</div></div></div>");
        
            //HTML
        out.println("<table class='w3-table-all w3-hoverable w3-light-grey'><thead><tr class='w3-light-grey'><td class='w3-hoverable'>I learnt HTML from websites and lectures. And tried to make some web pages with it. Only for experiment purposes and just for fun.</td><td><center><img src='assets/html.png'><br>HTML</center><div class='w3-container w3-pale-blue'style='padding: 0;''><div class='w3-container w3-dark-grey w3-center'style='width:50%;left:0;border-top-right-radius: 50%;border-bottom-right-radius: 50%''> 50%</div></div></td></tr></thead>");
            //CSS
        out.println("<table class='w3-table-all w3-hoverable w3-light-grey'><thead><tr class='w3-light-grey'><td class='w3-hoverable'>After learning HTML, i want to make my web pages to be more beautiful and got some styles on it. Currently,I'm learning how to make responsive web page from pure css and Bootstrap. I used bootstrap in many projects</td><td><center><img src='assets/css.png'><br>CSS</center><div class='w3-container w3-pale-blue'style='padding: 0;''><div class='w3-container w3-dark-grey w3-center'style='width:50%;left:0;border-top-right-radius: 50%;border-bottom-right-radius: 50%''> 50%</div></div></td></tr>");
            //Java
        out.println("<table class='w3-table-all w3-hoverable w3-light-grey'><thead><tr class='w3-light-grey'><td class='w3-hoverable'>I'm also concerned on Java programming language even though it is not that much compared to Web Technologies.I'm looking forward to do Mobile Programming with Java. And i got Java as my first programming language that i learnedin State Polytechnic of Malang.</td><td><center><img src='assets/java.png'><br>Java</center><div class='w3-container w3-pale-blue'style='padding: 0;''><div class='w3-container w3-dark-grey w3-center'style='width:30%;left:0;border-top-right-radius: 50%;border-bottom-right-radius: 50%''> 30%</div></div></td></tr>");        
            //Python
        out.println("<table class='w3-table-all w3-hoverable w3-light-grey'><thead><tr class='w3-light-grey'><td class='w3-hoverable'>I chose Python for my first back-end language last Semester, and used it on Database course's final project. Moreover, i got some basic understanding of IoT with Python</td><td><center><img src='assets/python.png' width=128px height = 128px><br>Python</center><div class='w3-container w3-pale-blue'style='padding: 0;''><div class='w3-container w3-dark-grey w3-center'style='width:45%;left:0;border-top-right-radius: 50%;border-bottom-right-radius: 45%''> 50%</div></div></td></tr>");                
            //Javascript
        out.println("<table class='w3-table-all w3-hoverable w3-light-grey'><thead><tr class='w3-light-grey'><td class='w3-hoverable'>I'm relatively new to Javascript, but already used it on my project for my community. Currently learning ReactJS and NodeJS to go full-stack with JS</td><td><center><img src='assets/javascript.png'><br>Javascript</center><div class='w3-container w3-pale-blue'style='padding: 0;''><div class='w3-container w3-dark-grey w3-center'style='width:40%;left:0;border-top-right-radius: 50%;border-bottom-right-radius: 40%''> 40%</div></div></td></tr></table></div>");        
        //End of Learning Progress Section


        //Community Section
        out.println("<div id='Community'></div><br><br><div class='w3-content w3-container'>");
        out.println("<div class='w3-left w3-panel w3-border-color-teal'style='font-weight: bold;box-shadow: 2px 2px 5px #737373;border-left: 3px solid #F70B0B;border-top: 3px solid #F70B0B;'><i class='fas fa-users'></i>Community</div> <br> <br>");
            //Community Photos
        out.println("<div class='w3-cell-row w3-center w3-margin-top'>");
                //First Photo
        out.println("<div class='w3-card w3-third' style='border-top:5px solid teal;'><img src='assets/WRI.jpg' class='w3-image zoom' style='width:100%'><div class='w3-container'><h5 class='w3-center'>Informatics <br> Research & Workshop </h5></div></div>");
                //Second Photo
        out.println("<div class='w3-card w3-third w3-right' style='border-top:5px solid teal;'><img src='assets/devc.jpg' class='w3-image zoom' style='width:100%;height:236.98'><div class='w3-container'><h5 class='w3-center'>Developer Circle <br> Malang</h5></div></div>");
                //Third Photo
        out.println("<div class='w3-card w3-third w3-right' style='border-top:5px solid teal;'><img src='assets/ITDEC.jpg' class='w3-image zoom' style='width:100%'><div class='w3-container'><h5 class='w3-center'>IT <br> Department English Club</h5></div></div>");
        out.println("</div><br> <br>");
        //End of Community Section

        //Start of Galleries Section
        out.println("<div class='bgimg-1 w3-opacity-min w3-animate-top' style='top:24px;'>");
        out.println("<img src='assets/photography2.jpg' style='width: 100%;height: 100%;'id='Galleries'>");
        out.println("<div class='w3-display-middle w3-container w3-responsive w3-wide w3-color-light-grey' style='white-space:nowrap;border: 3px groove #F9C20D;padding: 5px;box-shadow: 2px 2px 10px #514C4C;'><em><strong>G a l l e r i e s</strong></em></div></div>");

        out.println("<div class='w3-cell-row w3-center w3-margin-top w3-padding-64'>");
            //First photo
        out.println("<div class='w3-card w3-third' style='border-top:5px solid #FF7A00;''><div class='w3-container'><h5 class='w3-center'> Opening Ceremony of<br>International Class</h5></div><img src='assets/Internationalclass.jpg' class='photos w3-image zoom' style ='width:100%;box-shadow: 0px 0px 50px #787878;'></div>");
            //Second photo
        out.println("<div class='w3-card w3-third' style='border-top:5px solid teal;'><div class='w3-container'><h5 class='w3-center'>Leadership <br> Training</h5></div><img src='assets/LDK.jpg' class='photos w3-image w3-shadow zoom' style='width:100%;box-shadow: 0px 0px 50px #787878;''></div>");
            //Third photo
        out.println("<div class='w3-card w3-third' style='border-top:5px solid #FF7A00;'><div class='w3-container'><h5 class='w3-center'>IIUM <BR> Kulliyyah of ICT </h5></div><img src='assets/KICT.jpg' class='photos w3-image zoom' style='width:100%;box-shadow: 0px 0px 50px #787878;'></div></div>");
            //Fourth photo
        out.println("<div class='w3-cell-row w3-center w3-margin-top w3-padding-8'><div class='w3-card w3-third' style='border-top:5px solid teal;''><div class='w3-container'><h5 class='w3-center'>Random <br> Evening</h5></div><img src='assets/views.jpg' class='photos w3-image zoom' style='width:100%;box-shadow: 0px 0px 50px #787878;''></div>");
            //Fifth photo
        out.println("<div class='w3-card w3-third' style='border-top:5px solid #FF7A00;'><div class='w3-container'><h5 class='w3-center'>Teluk Asmara <br>in Malang Region</h5></div><img src='assets/beach.jpg' class='photos w3-image zoom' style='width:100%;box-shadow: 0px 0px 50px #787878;'></div>");
            //Sixth photo
        out.println("<div class='w3-card w3-third' style='border-top:5px solid teal;'><div class='w3-container'><h5 class='w3-center'> IIUM <br> Credit Transfer </h5></div><img src='assets/IIUM.jpg' class='photos w3-image zoom' style='width:100%;box-shadow: 0px 0px 50px #787878;'></div></div><br>");

        //End of Galleries section

        out.println("</body></html>");
        out.close();  // Always close the output writer

    }
}