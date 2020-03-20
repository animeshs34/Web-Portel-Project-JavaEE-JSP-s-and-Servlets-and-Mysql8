package ddiportal.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ddiportal.dao.LoginDao;
import ddiportal.pojo.Login;

/**
 * Servlet implementation class lrfservlet
 */
@WebServlet("/lrfservlet")
public class lrfservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public lrfservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
	 String enrollment = request.getParameter("enrollment");
	 String password = request.getParameter("password");
	 if(enrollment !=null && password!=null) {
		 LoginDao ld = new LoginDao();
		 if(ld.verify(new Login(enrollment,password))) {
			 HttpSession session = request.getSession();
				session.setAttribute("enroll", enrollment);
				session.setAttribute("pass", password);
				response.sendRedirect("home");
		 }
		 else
			 response.sendRedirect("lrf");
		
	 }
	
		
	}

}
