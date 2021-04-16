/**
 * 
 */
package assignment.service;

import java.util.List;

import org.apache.log4j.Logger;

import assignment.dao.AssignmentDAO;
import assignment.entity.Statement;
import assignment.entity.User;

/**
 * @author Administrator
 *
 */
public class AssignmentService {
	
	AssignmentDAO dao = new AssignmentDAO();
	Logger logger = Logger.getLogger(AssignmentService.class);
	
	public User getUserByCredentials(String userName, String password) {
		try {
			return dao.getUserByCredentials(userName, password);
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean authenticate(String userName, String password) {
		
		boolean isUserAuthenticated = false;
		User user = dao.getUserByCredentials(userName, password);
		
		if(user != null) {
			logger.info(user.toString());
			isUserAuthenticated = true;
		}
		
		return isUserAuthenticated;
	}

	public void updateUser(User user) {
		dao.updateUser(user);
	}

	public List<Statement> searchStatementByCriteria(SearchStatementCriteria searchStatementCriteria) throws Exception {
		return dao.searchStatementByCriteria(searchStatementCriteria);
	}

}
