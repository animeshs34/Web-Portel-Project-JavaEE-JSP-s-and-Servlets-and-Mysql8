package ddiportal.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ddiportal.dao.LoginDao;
import ddiportal.pojo.Login;

/**
 * Servlet Filter implementation class bonafide
 */
@WebFilter("/bonafide")
public class bonafide implements Filter {

	
	private ServletContext context;
    /**
     * Default constructor. 
     */
    public bonafide() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		HttpSession session= req.getSession(false);
		String enrollment = new String();
		String password = new String();
		LoginDao ld = new LoginDao();
		
		if(session!=null) {
			enrollment = (String) session.getAttribute("enroll");
			password = (String) session.getAttribute("pass");
			
			
			if(enrollment != null && password != null) {
				if(ld.verify(new Login(enrollment,password))) {
					chain.doFilter(request, response);
				}
				else {
					res.sendRedirect("lrf");
				}
			}
			
		}
		else {
			res.sendRedirect("lrf");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		this.context = fConfig.getServletContext();
		this.context.log("home filter initialized");
	}

}
