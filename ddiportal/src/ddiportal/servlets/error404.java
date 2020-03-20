package ddiportal.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class error404
 */
@WebServlet("/error404")
public class error404 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public error404() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE HTML>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Error - Page Not Exist</title>");
		out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>");
		out.println("<link href='//fonts.googleapis.com/css?family=Amarante' rel='stylesheet' type='text/css'>");
		out.println("<style type=\"text/css\">");
		out.println("body{");
		out.println("	background:url(images/bg.png);");
		out.println("	margin:0;");
		out.println("	font-family: 'Amarante', cursive;");
		out.println("}");
		out.println(".wrap{");
		out.println("	margin:0 auto;");
		out.println("	width:100%;");
		out.println("}");
		out.println(".logo{");
		out.println("	text-align:center;");
		out.println("}	");
		out.println(".logo p span{");
		out.println("	color:lightgreen;");
		out.println("}	");
		out.println(".sub a{");
		out.println("	color:white;");
		out.println("	background:rgba(0,0,0,0.3);");
		out.println("	text-decoration:none;");
		out.println("	padding:5px 10px;");
		out.println("	font-size:13px;");
		out.println("	font-family: arial, serif;");
		out.println("	font-weight:bold;");
		out.println("}	");
		out.println(".footer{");
		out.println("	color:#555;");
		out.println("	position:absolute;");
		out.println("	right:10px;");
		out.println("	bottom:10px;");
		out.println("	font-size:14px;");
		out.println("}	");
		out.println(".footer a{");
		out.println("	font-size:16px;");
		out.println("	color:#ff4800;");
		out.println("}	");
		out.println("@media screen and (max-width: 1024px){");
		out.println("	img.w3l-logo {");
		out.println("		width: 19%;");
		out.println("	}");
		out.println("	img.w3l-logo1 {");
		out.println("    width: 46%;");
		out.println("}");
		out.println("}");
		out.println("@media screen and (max-width: 991px){}");
		out.println("@media screen and (max-width: 900px){");
		out.println("		.logo {");
		out.println("		margin-top: 2em;");
		out.println("	}");
		out.println("}");
		out.println("@media screen and (max-width: 800px){");
		out.println("	.logo {");
		out.println("		margin-top: 2.5em;");
		out.println("	}");
		out.println("	img.w3l-logo {");
		out.println("		width: 25%;");
		out.println("	}");
		out.println("}");
		out.println("@media screen and (max-width: 736px){");
		out.println("	img.w3l-logo1 {");
		out.println("		width: 44%;");
		out.println("	}");
		out.println("}");
		out.println("@media screen and (max-width: 667px){");
		out.println("	img.w3l-logo {");
		out.println("		width: 29%;");
		out.println("	}");
		out.println("}");
		out.println("@media screen and (max-width: 640px){");
		out.println("	img.w3l-logo {");
		out.println("		width: 33%;");
		out.println("	}");
		out.println("}");
		out.println("@media screen and (max-width: 480px){");
		out.println("	img.w3l-logo {");
		out.println("		width: 40%;");
		out.println("	}");
		out.println("	img.w3l-logo1 {");
		out.println("		width: 53%;	");
		out.println("	}");
		out.println("}");
		out.println("@media screen and (max-width: 414px){");
		out.println("	img.w3l-logo1 {");
		out.println("		width: 62%;");
		out.println("	}");
		out.println("	.footer {");
		out.println("		text-align: center;");
		out.println("		font-size: 14px;");
		out.println("		line-height: 1.7;");
		out.println("		padding: 10px;");
		out.println("	}");
		out.println("} ");
		out.println("@media screen and (max-width: 384px){");
		out.println("	.logo {");
		out.println("		margin-top: 4.5em;");
		out.println("	}");
		out.println("	img.w3l-logo {");
		out.println("		width: 47%;");
		out.println("	}");
		out.println("}");
		out.println("@media screen and (max-width: 320px){");
		out.println("	img.w3l-logo {");
		out.println("		width: 55%;");
		out.println("	}");
		out.println("}");
		out.println("</style>");
		out.println("</head>");
		out.println("");
		out.println("");
		out.println("<body>");
		out.println("");
		out.println(" <img src=\"images/label.png\" class=\"w3l-logo\"/> ");
		out.println(" <div class=\"wrap\">");
		out.println("    <div class=\"logo\">");
		out.println("		<img src=\"images/woody-404.png\" class=\"w3l-logo1\"/>");
		out.println("			<div class=\"sub\">");
		out.println("			  <p><a href=\"home\">Go Back to Home</a></p>");
		out.println("			</div>");
		out.println("     </div>");
		out.println("  </div>");
		out.println("	");
		out.println("	");
		out.println("	<div class=\"footer\">");
		out.println("	 &copy 2012 DDIPG. All Rights Reserved | Design by <a href=\"mailto:animeshs34@gmail.com\">Animesh </a>");
		out.println("	</div>");
		out.println("	");
		out.println("</body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
