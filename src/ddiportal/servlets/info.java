package ddiportal.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class info
 */
@WebServlet("/info")
public class info extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public info() {
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
		out.println("   <title>Information</title>");
		out.println("   <link rel=\"stylesheet\" href=\"css/components.css\">");
		out.println("   <link rel=\"stylesheet\" href=\"css/icons.css\">");
		out.println("   <link rel=\"stylesheet\" href=\"css/responsee.css\">");
		out.println("   <link rel=\"stylesheet\" href=\"owl-carousel/owl.carousel.css\">");
		out.println("   <link rel=\"stylesheet\" href=\"owl-carousel/owl.theme.css\">");
		out.println("   <link rel=\"stylesheet\" href=\"css/lightcase.css\">");
		out.println("   <!-- CUSTOM STYLE -->      ");
		out.println("   <link rel=\"stylesheet\" href=\"css/template-style.css\">");
		out.println("   <link href=\"https://fonts.googleapis.com/css?family=Poppins:100,200,300,400,700,900&amp;subset=latin-ext\" rel=\"stylesheet\"> ");
		out.println("   <script type=\"text/javascript\" src=\"js/jquery-1.8.3.min.js\"></script>");
		out.println("   <script type=\"text/javascript\" src=\"js/jquery-ui.min.js\"></script>   ");
		out.println(" </head>");
		out.println("  <body class=\"size-1280\">");
		out.println("   ");
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
		out.println("         <h1 class=\"animated-element slow text-extra-thin text-white text-s-size-30 text-m-size-40 text-size-50 text-line-height-1 margin-bottom-30 margin-top-130\">");
		out.println("           Information");
		out.println("         </h1>");
		out.println("         ");
	
		out.println("       </header>");
		out.println("       <!-- Section 1 -->");
		out.println("       <section class=\"section-small-padding background-white text-center\">      ");
		out.println("         <div class=\"line\">");
		out.println("          ");
		out.println("           <h2 class=\"text-dark text-size-50 text-m-size-40\">"+request.getParameter("text")+"</h2>");
		out.println("         </div>                                                                                                    ");
		out.println("       </section>");
		out.println("       ");
		out.println("     </article>");
		out.println("   </main>");
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
		out.println("              <a class=\"text-primary-hover\" href=\"\">Animesh Singh</a><br>");
		out.println("              <a class=\"text-primary-hover\" href=\"\">Kirti Baghele</a><br>");
		out.println("              <a class=\"text-primary-hover\" href=\"\">Ashish Singh</a><br>");
		out.println("              <a class=\"text-primary-hover\" href=\"\">Ritesh Singh</a>");
		out.println("           </div>");
		out.println("           <div class=\"s-12 m-6 l-3 xl-3\">");
		out.println("              <h4 class=\"text-white text-strong margin-m-top-30\">Contact Us</h4>");
		out.println("               <p><i class=\"icon-sli-screen-smartphone text-primary\"></i> 91-91799953607</p>");
		out.println("               <a class=\"text-primary-hover\" href=\"mailto:animeshs34@gmail.com\"><i class=\"icon-sli-mouse text-primary\"></i> animeshs34@gmail.com</a><br>");
		out.println("               ");
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
		out.println("   <script type=\"text/javascript\" src=\"owl-carousel/owl.carousel.js\"></script>");
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
