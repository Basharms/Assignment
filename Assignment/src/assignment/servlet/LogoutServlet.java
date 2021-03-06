package assignment.servlet;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import assignment.entity.User;
import assignment.filters.AuthenticationFilter;
import assignment.service.AssignmentService;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Logger logger = Logger.getLogger(LogoutServlet.class);

	/**
     * @see HttpServlet#HttpServlet()
     */
    public LogoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("LogoutServlet.doGet()");
		try {
			User loggdInUser = (User) request.getSession().getAttribute("loggedInUser");
			
			if(loggdInUser != null) {
				loggdInUser.setLogoutTime(Calendar.getInstance());
				AssignmentService service = new AssignmentService();
				service.updateUser(loggdInUser);
			}
			
			request.getSession().invalidate();
			request.removeAttribute("showMsg");
			request.removeAttribute("errorMsg");
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
			return;
		} catch (ServletException e) {
			e.printStackTrace();
			RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
			dispatcher.forward(request, response);
			return;
		} catch (IOException e) {
			e.printStackTrace();
			RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
			dispatcher.forward(request, response);
			return;
		} catch (Exception e) {
			e.printStackTrace();
			RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
			dispatcher.forward(request, response);
			return;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("LogoutServlet.doPost()");
	}

}
