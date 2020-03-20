package ddiportal.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class alumni
 */
@WebServlet("/alumni")
public class alumni extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public alumni() {
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
		out.println("   <title>Alumni-DDIPG</title>");
		out.println("   <link rel=\"stylesheet\" href=\"css/components.css\">");
		out.println("   <link rel=\"stylesheet\" href=\"css/icons.css\">");
		out.println("   <link rel=\"stylesheet\" href=\"css/responsee.css\">");
		
		out.println("   <link rel=\"stylesheet\" href=\"css/lightcase.css\">");
		
		out.println("   <link rel=\"stylesheet\" href=\"css/template-style.css\">");
		out.println("   <link href=\"https://fonts.googleapis.com/css?family=Poppins:100,200,300,400,700,900&amp;subset=latin-ext\" rel=\"stylesheet\"> ");
		out.println("   <script type=\"text/javascript\" src=\"js/jquery-1.8.3.min.js\"></script>");
		out.println("   <script type=\"text/javascript\" src=\"js/jquery-ui.min.js\"></script>    ");
		out.println(" </head>");
		out.println(" ");
		out.println(" <body class=\"size-1280\">");
		
		out.println("   <!-- HEADER -->");
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
		out.println("               <li><a href=\"alimni\">Alumni</a></li>");
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
		out.println("           Gallery");
		out.println("         </h1>");
		out.println("         ");
		out.println("         <!-- white full width arrow object -->");
		out.println("         <img class=\"arrow-object\" src=\"img/arrow-object-white.svg\" alt=\"\">");
		out.println("       </header>");
		out.println("       ");
		out.println("       <!-- Section 1 -->");
		out.println("       <section class=\"section background-white\">      ");
		out.println("         <div class=\"line\">");
		out.println("           <div class=\"margin2x\">");
		out.println("                       ");
		out.println("             <div class=\"s-12 m-6 margin-bottom-30\">");
		out.println("               <img class=\"full-img\" src=\"img/portfolio/portfolio-01.jpg\" alt=\"\"/>");
		out.println("             </div>");
		out.println("             <div class=\"s-12 m-6 margin-bottom-30\">");
		out.println("               <img class=\"full-img\" src=\"img/portfolio/portfolio-02.jpg\" alt=\"\"/>");
		out.println("             </div> ");
		out.println("             <div class=\"s-12 m-6 margin-bottom-30\">");
		out.println("               <img class=\"full-img\" src=\"img/portfolio/portfolio-03.jpg\" alt=\"\"/>");
		out.println("             </div> ");
		out.println("             <div class=\"s-12 m-6 margin-bottom-30\">");
		out.println("               <img class=\"full-img\" src=\"img/portfolio/portfolio-04.jpg\" alt=\"\"/>");
		out.println("             </div> ");
		out.println("             <div class=\"s-12 m-6 margin-bottom-30\">");
		out.println("               <img class=\"full-img\" src=\"img/portfolio/portfolio-05.jpg\" alt=\"\"/>");
		out.println("             </div> ");
		out.println("             <div class=\"s-12 m-6 margin-bottom-30\">");
		out.println("               <img class=\"full-img\" src=\"img/portfolio/portfolio-06.jpg\" alt=\"\"/>");
		out.println("             </div>                                                                                   ");
		out.println("             ");
		out.println("           </div>");
		out.println("         </div>       ");
		out.println("       </section>");
		out.println("     </article>");
		out.println("     ");
		out.println("     <hr class=\"break\">");
		out.println("     <!-- Section 4 -->");
		out.println("     <section class=\"section-small-padding background-white text-center\">");
		out.println("       <div class=\"line\">");
		out.println("         <div class=\"s-12 m-12 l-9 center margin-bottom-30\">");
		out.println("           <h3 class=\"text-strong text-size-20 text-line-height-1 margin-bottom-10\">Prompta reform conceptam</h3>");
		out.println("           <p>Deleniti pertinacia eu est, te his soluta quaestio pericula illum facilisis.</p>");
		out.println("         </div>");
		out.println("       </div>            ");
		out.println("       <div class=\"line\">  ");
		out.println("         <div class=\"s-12 m-12 l-3 center\">");
		out.println("           <a href=\"contact.html\" class=\"s-12 button border-radius background-primary text-size-20 text-white\">Contact Us</a>");
		out.println("         </div>");
		out.println("       </div>");
		out.println("     </section>        ");
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
		out.println("              <h4 class=\"text-white text-strong\">Our Mission</h4>");
		out.println("              <p>");
		out.println("                <b class=\"text-size-20\">Veri fastidii consectetuer</b> ius in, eum alii dicunt omnium eu. Wisi nostrud equidem ut usu. <b class=\"text-size-20\">Deleniti pertinacia eu est</b>, te his soluta quaestio pericula.");
		out.println("              </p>");
		out.println("           </div>");
		out.println("           <div class=\"s-12 m-6 l-3 xl-2\">");
		out.println("              <h4 class=\"text-white text-strong margin-m-top-30\">Useful Links</h4>");
		out.println("              <a class=\"text-primary-hover\" href=\"page.html\">FAQ</a><br>      ");
		out.println("              <a class=\"text-primary-hover\" href=\"contact.html\">Contact Us</a><br>");
		out.println("              <a class=\"text-primary-hover\" href=\"blog.html\">Blog</a>");
		out.println("           </div>");
		out.println("           <div class=\"s-12 m-6 l-3 xl-2\">");
		out.println("              <h4 class=\"text-white text-strong margin-m-top-30\">Term of Use</h4>");
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
		out.println("           <p class=\"text-size-12\">Copyright 2019, Vision Design - graphic zoo</p>");
		out.println("           <p class=\"text-size-12\">All images have been purchased from Bigstock. Do not use the images in your website.</p>");
		out.println("         </div>");
		out.println("         <div class=\"s-12 l-6\">");
		out.println("           <a class=\"right text-size-12 text-primary-hover\" href=\"http://www.myresponsee.com\" title=\"Responsee - lightweight responsive framework\">Design and coding<br> by Responsee Team</a>");
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
