package assignment.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter("/*")
public class AuthenticationFilter implements Filter {

	Logger logger = Logger.getLogger(AuthenticationFilter.class);
	
    /**
     * Default constructor. 
     */
    public AuthenticationFilter() {
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
		
		// place your code here
		HttpServletRequest req = (HttpServletRequest) request;
		logger.info("AuthenticationFilter.doFilter()");
		HttpSession session = req.getSession();
		
		try {
			
			logger.info("req.getServletPath() :: " + req.getServletPath());
			// exclude login from filter 
			if (! ("/login".equals(req.getServletPath()) || "/login.jsp".equals(req.getServletPath()))) {
				// check if the session is new and check logged in user attribute if exist.
				if (session.isNew() || session.getAttribute("loggedInUser") == null) {
					throw new Exception();
				}
			}
			
		} catch (Exception e) {
			session.invalidate();
			logger.info("No session. Please log in again");
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
			return;
		}
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
