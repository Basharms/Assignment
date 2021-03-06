package assignment.servlet;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.log4j.Logger;

import assignment.entity.User;
import assignment.filters.AuthenticationFilter;
import assignment.service.AssignmentService;

/**
 * Application Lifecycle Listener implementation class AssignmentSessionListener
 *
 */
@WebListener
public class AssignmentSessionListener implements HttpSessionListener {

	Logger logger = Logger.getLogger(AssignmentSessionListener.class);
    /**
     * Default constructor. 
     */
    public AssignmentSessionListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
    	logger.info("-- HttpSessionListener#sessionCreated invoked --");
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         logger.info("AssignmentSessionListener.sessionDestroyed()..");
         
         try {
 			User loggdInUser = (User) se.getSession().getAttribute("loggedInUser");
 			
 			if(loggdInUser != null) {
 				loggdInUser.setLogoutTime(Calendar.getInstance());
 				AssignmentService service = new AssignmentService();
 				service.updateUser(loggdInUser);
 			}
 			
 			se.getSession().invalidate();
 			return;
 		} catch (Exception e) {
 			e.printStackTrace();
 			return;
 		}
    }
	
}
