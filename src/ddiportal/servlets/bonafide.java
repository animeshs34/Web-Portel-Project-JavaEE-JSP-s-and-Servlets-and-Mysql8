package ddiportal.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ddiportal.dao.BranchDao;
import ddiportal.dao.SemCountDao;
import ddiportal.dao.StudentDao;

/**
 * Servlet implementation class bonafide
 */
@WebServlet("/bonafide")
public class bonafide extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bonafide() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =  response.getWriter();
		SemCountDao scd = new SemCountDao();
		BranchDao bd = new BranchDao();
		StudentDao std= new StudentDao();
		
		
		HttpSession session = request.getSession();
		if(session != null) {
			String branch = bd.getBranch(std.getBranchId((String)session.getAttribute("enroll")));
			int sem = scd.getSem((String)session.getAttribute("enroll"));
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("   <meta charset=\"utf-8\">");
			out.println("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
			out.println("   <title>Untitled</title>");
			out.println("   <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.0/css/bootstrap.min.css\">");
			out.println("   <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css\">");
			out.println("</head>");
			out.println("<body>");
			out.println("   <div class=\"flash animated\" style=\"width:75%;height:100vh;margin-left:110px;\">");
			out.println("       <h3 class=\"text-center\" style=\"margin-top:56px;font-size:33px;margin-bottom:0px;\">University Intitution of Technology</h3>");
			out.println("       <h3 class=\"text-center\" style=\"font-size:24px;line-height:25px;font-weight:normal;margin-bottom:-2px;\">Rajiv Gandhi Proudyogiki Vishwavidyalaya<br></h3>");
			out.println("       <p class=\"text-center\">Airport Rd, Abbas Nagar, Gandhi Nagar, Bhopal, Madhya Pradesh 462033<br></p>");
			out.println("       <hr style=\"margin-top:49px;background-color:#1d1a1a;\">");
			out.println("       <h1 class=\"text-center\" style=\"font-size:28px;font-weight:bold;\">CERTIFICATE</h1>");
			out.println("       <div class=\"float-right\" style=\"width:150px;background-color:#f8f1f1;height:150px;margin-top:-46px;\">");
			out.println("           <p style=\"margin:56px;\">PHOTO</p>");
			out.println("       </div>");
			out.println("       <p class=\"lead text-center float-none\" style=\"margin-top:148px;\">This is to certify that Mr/Miss <b>"+std.getStudentName((String)session.getAttribute("enroll"))+"</b> Dual Degree Integrated PG Programm branch &nbsp;<b>"+branch+"&nbsp;&nbsp;&nbsp;"+sem+"th&nbsp;</b>sem is Bonafide &nbsp;of Rajiv Gandhi Proudyogiki Vishwavidyalaya,Bhopal&nbsp;<br><br></p>");
			out.println("       <h5 class=\"text-right\" style=\"font-weight:normal;margin-top:79px;letter-spacing:-2px;line-height:35px;\">Dual Degree Department Coordinator</h5>");
			out.println("       <h5 class=\"text-right\">(Mr. Arvind Patel)</h5>");
			out.println("       <h5 class=\"text-right\">_____________</h5>");
			out.println("       <h5 class=\"text-right\" onclick=\"window.print()\"><b>print</b></h5>");
			out.println("   </div>");
			
			out.println("   <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>");
			out.println("   <script src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.0/js/bootstrap.bundle.min.js\"></script>");
			out.println("</body>");
			out.println("</html>");
		}
		else
			response.sendRedirect("lrf");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
