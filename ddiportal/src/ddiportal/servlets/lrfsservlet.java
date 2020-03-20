package ddiportal.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ddiportal.dao.LoginDao;
import ddiportal.dao.StudentDao;

/**
 * Servlet implementation class lrfsservlet
 */
@WebServlet("/lrfsservlet")
public class lrfsservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public lrfsservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String enrollment = request.getParameter("enrollment");
		String password = request.getParameter("password");
		
		System.out.println(""+enrollment);
		System.out.println(""+password);
		
		if(enrollment !=null && password!=null) {
			LoginDao ld = new LoginDao();
			StudentDao sd = new StudentDao();
			if( sd.getStudentName(enrollment)!=null) {
			if(ld.register(enrollment, password))
			{
				response.sendRedirect("info?text=Congratulation you are Succesfully Registered");
			}
			else
				response.sendRedirect("info?text=Oops Failed to Register");
		}
			else
				response.sendRedirect("info?text=Oops Failed to Register,Please try to fill correct information again..!");
			}
		
	}
	
}
