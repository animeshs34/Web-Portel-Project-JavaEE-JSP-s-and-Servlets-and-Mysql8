package ddiportal.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class lrf
 */
@WebServlet("/lrf")
public class lrf extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public lrf() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"en-US\">");
		out.println(" <head>");
		out.println("   <meta charset=\"UTF-8\">");
		out.println("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />");
		out.println("   <title>Dual Degree Student Login</title>");
		out.println("   <link rel=\"stylesheet\" href=\"css/components.css\">");
		out.println("   <link rel=\"stylesheet\" href=\"css/icons.css\">");
		out.println("   <link rel=\"stylesheet\" href=\"css/responsee.css\">");
		out.println("   <link rel=\"stylesheet\" href=\"css/lightcase.css\">");
		out.println("       ");
		out.println("   <link rel=\"stylesheet\" href=\"css/template-style.css\">");
		out.println("  ");
		out.println("<link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">");
		out.println("	<link href=\"//fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext\" rel=\"stylesheet\">");
		out.println("");
		out.println("   <link href=\"https://fonts.googleapis.com/css?family=Poppins:100,200,300,400,700,900&amp;subset=latin-ext\" rel=\"stylesheet\"> ");
		out.println("   <script type=\"text/javascript\" src=\"js/jquery-1.8.3.min.js\"></script>");
		out.println("   <script type=\"text/javascript\" src=\"js/jquery-ui.min.js\"></script>   ");
		out.println("");
		out.println("   <script>");
		out.println("       addEventListener(\"load\", function () {");
		out.println("         setTimeout(hideURLbar, 0);");
		out.println("       }, false);");
		out.println("   ");
		out.println("       function hideURLbar() {");
		out.println("         window.scrollTo(0, 1);");
		out.println("       }");
		out.println("     </script>");
		out.println("");
		out.println("           <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\" />");
		out.println("           <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">");
		out.println("           <link href=\"//fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext\"");
		out.println("             rel=\"stylesheet\">");
		out.println(" </head>");
		out.println("  <body class=\"size-1280\">");
		out.println("  ");
		out.println("   <header role=\"banner\" class=\"position-absolute\">    ");
		out.println("     <!-- Top Navigation -->");
		out.println("     <nav class=\"background-transparent background-primary-dott full-width sticky\">          ");
		out.println("       <div class=\"top-nav\"> ");
		
		out.println("         <div class=\"logo hide-l hide-xl hide-xxl\">");
		out.println("            <a href=\"home\" class=\"logo\">");
		out.println("             <!-- Logo White Version -->");
		out.println("             <img class=\"logo-white\" src=\"img/rgpvlogo.png\" alt=\"\">");
		
		out.println("           </a>");
		out.println("         </div>                  ");
		out.println("         <p class=\"nav-text\"></p>");
		out.println("         ");
		out.println("         <!-- left menu items -->");
		out.println("         <div class=\"top-nav left-menu\">");
		out.println("            <ul class=\"right top-ul chevron\">");
		out.println("               <li><a href=\"home\">Home</a></li>");
		out.println("               <li><a href=\"about\">About Us</a></li>");
		out.println("               <li><a href=\"services\">Our Services</a></li>");
		out.println("            </ul>");
		out.println("         </div>");
		out.println("         ");
		out.println("         <!-- logo -->");
		out.println("         <ul class=\"logo-menu\">");
		out.println("           <a href=\"home\" class=\"logo\">");
		out.println("             <!-- Logo White Version -->");
		out.println("             <img class=\"logo-white\" src=\"img/rgpvlogo.png\" alt=\"\">");
	     
		out.println("           </a>");
		out.println("         </ul>");
		out.println("         ");
		out.println("         <!-- right menu items -->");
		out.println("         <div class=\"top-nav right-menu\">");
		out.println("            <ul class=\"top-ul chevron\">");
		out.println("               <li><a href=\"resulthome\">Result</a></li>");
		out.println("               <li><a href=\"alumni\">Alumni</a></li>");
		out.println("               <li><a href=\"contact\">Contact</a></li>");
		out.println("            </ul> ");
		out.println("         </div>");
		out.println("       </div>");
		out.println("     </nav>");
		out.println("   </header>");
		out.println("   ");
		out.println("   <!-- MAIN -->");
		out.println("   <main role=\"main\">");
		out.println("     <article>    ");
		out.println("       <!-- Header -->");
		out.println("       <header class=\"section background-image text-center\" style=\"background-image:url(img/img-05.jpg)\">");
		out.println("                  ");
		out.println("        <div class=\"\">");
		out.println("           <!-- title -->");
		out.println("           <h1>Student Login</h1>");
		out.println("           <!-- //title -->");
		out.println("           <div class=\"sub-main-w3\">");
		out.println("             ");
		out.println("             <!-- vertical tabs -->");
		out.println("             <div class=\"vertical-tab\">");
		out.println("               <div id=\"section1\" class=\"section-w3ls\">");
		out.println("                 <input type=\"radio\" name=\"sections\" id=\"option1\" checked>");
		out.println("                 <label for=\"option1\" class=\"icon-left-w3pvt\"><span class=\"fa fa-user-circle\" aria-hidden=\"true\"></span>Login</label>");
		out.println("                 <article>");
		out.println("                   <form action=\"lrfservlet\" method=\"post\">");
		out.println("                     <h3 class=\"legend\">Login Here</h3>");
		out.println("                     <div class=\"input\">");
		out.println("                       <span class=\"fa fa-user-o\" aria-hidden=\"true\"></span>");
		out.println("                       <input type=\"text\" placeholder=\"Enrollment\" name=\"enrollment\" required />");
		out.println("                     </div>");
		out.println("                     <div class=\"input\">");
		out.println("                       <span class=\"fa fa-key\" aria-hidden=\"true\"></span>");
		out.println("                       <input type=\"password\" placeholder=\"Password\" name=\"password\" required />");
		out.println("                     </div>");
		out.println("                     <button type=\"submit\" class=\"btn submit\">Login</button>");
		out.println("                     ");
		out.println("                   </form>");
		out.println("                 </article>");
		out.println("               </div>");
		out.println("               <div id=\"section2\" class=\"section-w3ls\">");
		out.println("                 <input type=\"radio\" name=\"sections\" id=\"option2\">");
		out.println("                 <label for=\"option2\" class=\"icon-left-w3pvt\"><span class=\"fa fa-pencil-square\" aria-hidden=\"true\"></span>Register</label>");
		out.println("                 <article>");
		out.println("                   <form action=\"lrfsservlet\" method=\"post\">");
		out.println("                     <h3 class=\"legend\">Register Here</h3>");
		out.println("                     <div class=\"input\">");
		out.println("                       <span class=\"fa fa-user-o\" aria-hidden=\"true\"></span>");
		out.println("                       <input type=\"text\" placeholder=\"Enrollment\" name=\"enrollment\" required />");
		out.println("                     </div>");
		out.println("                     <div class=\"input\">");
		out.println("                       <span class=\"fa fa-key\" aria-hidden=\"true\"></span>");
		out.println("                       <input type=\"password\" placeholder=\"Password\" name=\"password\" required />");
		out.println("                     </div>");
		out.println("                     <div class=\"input\">");
		out.println("                       <span class=\"fa fa-key\" aria-hidden=\"true\"></span>");
		out.println("                       <input type=\"password\" placeholder=\"Confirm Password\" name=\"password\" required />");
		out.println("                     </div>");
		out.println("                     <button type=\"submit\" class=\"btn submit\">Register</button>");
		out.println("                   </form>");
		out.println("                 </article>");
		out.println("               </div>");
		out.println("               <div id=\"section3\" class=\"section-w3ls\">");
		out.println("                 <input type=\"radio\" name=\"sections\" id=\"option3\">");
		out.println("                 <label for=\"option3\" class=\"icon-left-w3pvt\"><span class=\"fa fa-lock\" aria-hidden=\"true\"></span>Forgot Password?</label>");
		out.println("                 <article>");
		out.println("                   <form action=\"#\" method=\"post\">");
		out.println("                     <h3 class=\"legend last\">Reset Password</h3>");
		out.println("                     <p class=\"para-style\">Enter your email address and enrollment below and we'll send you an email with instructions.</p>");
		out.println("                     <p class=\"para-style-2\"><strong>Need Help?</strong> Learn more about how to <a href=\"#\">retrieve an existing");
		out.println("                         account.</a></p>");
		out.println("                     <div class=\"input\">");
		out.println("                       <span class=\"fa fa-envelope-o\" aria-hidden=\"true\"></span>");
		out.println("                       <input type=\"email\" placeholder=\"Email\" name=\"email\" required />");
		out.println("                     </div>");
		out.println("                     <div class=\"input\">");
		out.println("                       <span class=\"fa fa-user-o\" aria-hidden=\"true\"></span>");
		out.println("                       <input type=\"text\" placeholder=\"Enrollment\" name=\"enrollment-new\" required />");
		out.println("                     </div>");
		out.println("                     <button type=\"submit\" class=\"btn submit last-btn\">Reset</button>");
		out.println("                   </form>");
		out.println("                 </article>");
		out.println("               </div>");
		out.println("             </div>");
		out.println("             <!-- //vertical tabs -->");
		out.println("             <div class=\"clear\"></div>");
		out.println("           </div>");
		out.println("           ");
		out.println("         </div>");
		out.println("       ");
		out.println("        ");
		out.println("       </header>");
		out.println("    ");
		out.println("     ");
		out.println("    ");
		out.println("   ");
		out.println("   <!-- FOOTER -->");
		out.println("   <footer>");
		out.println("     <!-- Social -->");
		out.println("     <div class=\"background-primary padding text-center\">");
		out.println("       <a href=\"/\"><i class=\"icon-facebook_circle text-size-25 text-dark\"></i></a> ");
		out.println("       <a href=\"/\"><i class=\"icon-twitter_circle text-size-25 text-dark\"></i></a>");
		out.println("       <a href=\"/\"><i class=\"icon-google_plus_circle text-size-25 text-dark\"></i></a>");
		out.println("       <a href=\"/\"><i class=\"icon-instagram_circle text-size-25 text-dark\"></i></a> ");
		out.println("       <a href=\"/\"><i class=\"icon-linked_in_circle text-size-25 text-dark\"></i></a>                                                                       ");
		out.println("     </div>");
		out.println("     <!-- Main Footer -->");
		out.println("     <section class=\"section background-dark\">");
		out.println("       <div class=\"line\"> ");
		out.println("         <div class=\"margin2x\">");
		out.println("           <div class=\"s-12 m-6 l-3 xl-5\">");
		out.println("              <h4 class=\"text-white text-strong\">Address</h4>");
		out.println("              <p>");
		out.println("                <b class=\"text-size-20\">Airport Rd,Abbas Nagar,Gandhi Nagar</b> Bhopal,Madhya Pradesh 462033 ");
		out.println("              </p>");
		out.println("           </div>");
		out.println("           <div class=\"s-12 m-6 l-3 xl-2\">");
		out.println("              <h4 class=\"text-white text-strong margin-m-top-30\">Email</h4>");
		out.println("              ");
		out.println("              <a class=\"text-primary-hover\" href=\"mailto:animeshs34@gmail.com\">animeshs34@gmail.com</a>");
		out.println("           </div>");
		out.println("           <div class=\"s-12 m-6 l-3 xl-2\">");
		out.println("              <h4 class=\"text-white text-strong margin-m-top-30\">Our Team</h4>");
		out.println("              <a class=\"text-primary-hover\" href=\"page.html\">Terms and Conditions</a><br>");
		out.println("              <a class=\"text-primary-hover\" href=\"page.html\">Refund Policy</a><br>");
		out.println("              <a class=\"text-primary-hover\" href=\"page.html\">Disclaimer</a>");
		out.println("           </div>");
		out.println("           <div class=\"s-12 m-6 l-3 xl-3\">");
		out.println("              <h4 class=\"text-white text-strong margin-m-top-30\">Contact Us</h4>");
		out.println("               <p><i class=\"icon-sli-screen-smartphone text-primary\"></i> 0800 4521 800 50</p>");
		out.println("               <a class=\"text-primary-hover\" href=\"mailto:contact@sampledomain.com\"><i class=\"icon-sli-mouse text-primary\"></i> contact@sampledomain.com</a><br>");
		out.println("               <a class=\"text-primary-hover\" href=\"mailto:office@sampledomain.com\"><i class=\"icon-sli-mouse text-primary\"></i> office@sampledomain.com</a>");
		out.println("           </div>");
		out.println("         </div>  ");
		out.println("       </div>    ");
		out.println("     </section>");
		out.println("     <div class=\"background-dark\">");
		out.println("        <div class=\"line\">");
		out.println("           <hr class=\"break margin-top-bottom-0\" style=\"border-color: #777;\">");
		out.println("        </div>");
		out.println("     </div>");
		out.println("     <!-- Bottom Footer -->");
		out.println("     <section class=\"padding-2x background-dark full-width\">");
		out.println("       <div class=\"line\">");
		out.println("         <div class=\"s-12 l-6\">");
		out.println("           <p class=\"text-size-12\">Copyright 2019, Dual Degree RGPV Bhopal</p>");
		out.println("         </div>");
		out.println("         <div class=\"s-12 l-6\">");
		out.println("         ");
		out.println("         </div>");
		out.println("       </div>  ");
		out.println("     </section>");
		out.println("   </footer>");
		out.println("   <script type=\"text/javascript\" src=\"js/responsee.js\"></script>");
	
		out.println("   <script type=\"text/javascript\" src=\"js/template-scripts.js\"></script> ");
		out.println(" </body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
