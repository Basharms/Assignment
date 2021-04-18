package assignment.servlet;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import assignment.dao.AssignmentDAO;
import assignment.entity.User;
import assignment.service.AssignmentService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Logger logger = Logger.getLogger(LoginServlet.class);
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("LoginServlet.doGet()");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		try {
			// Authenticate user credentials
			AssignmentService service = new AssignmentService();
			
			User user =	service.getUserByCredentials(userName, password);
			if(user != null) {
				if(user.getLogoutTime() == null && user.getLastLoginTime() != null) {
					logger.info("Failed .. user already loggedin");
					// This attribute to determine showing error message or not
					request.setAttribute("showMsg", "true");
					request.setAttribute("errorMsg", "User already loggedin");
					RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
					dispatcher.forward(request, response);
					return;
				}
				
				// Set last login date and update the user
				user.setLastLoginTime(Calendar.getInstance());
				user.setLogoutTime(null);
				service.updateUser(user);
				request.getSession().setAttribute("loggedInUser", user);
				
				logger.info("Success");
				// In case the user is authenticated then load all employees to be loaded in the welcome page
				request.setAttribute("userName", userName);
				request.removeAttribute("showMsg");
				
				Cookie cookie = new Cookie("username", userName);
				response.addCookie(cookie);
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
				dispatcher.forward(request, response);
				
				return;
			} else {
				logger.info("Failed .. user not found for user name :: " + userName + " and passsword :: " + password);
				
				// This attribute to determine showing error message or not
				request.setAttribute("showMsg", "true");
				request.setAttribute("errorMsg", "Invalid credentials");
				RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
				dispatcher.forward(request, response);
				return;
			}
		} catch (Exception e) {
			e.printStackTrace();
			RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
			dispatcher.forward(request, response);
			return;
		}
		
	}

}
