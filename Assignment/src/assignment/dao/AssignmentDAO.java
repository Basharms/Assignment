/**
 * 
 */
package assignment.dao;

import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import assignment.entity.Statement;
import assignment.entity.User;
import assignment.service.SearchStatementCriteria;
import assignment.util.AssignmentUtil;

/**
 * @author Administrator
 *
 */
public class AssignmentDAO {
	Logger logger = Logger.getLogger(AssignmentDAO.class);
	
	
	public List<Statement> searchStatementByCriteria(SearchStatementCriteria searchCriteria) throws Exception {
		Session session = AssignmentUtil.initHibernateSession();
		List<Statement> statementList = null;
		try {
			logger.info("AssignmentDAO.getStatementsList()");
			Criteria criteria = session.createCriteria(Statement.class);
			String accoutId = String.valueOf(searchCriteria.getAccountId());
			criteria.add(Restrictions.eq("accountId", accoutId));
			logger.info("Search criteria :: " + searchCriteria.toString());
			boolean serachCriteriaSpecfied = false;
			if((searchCriteria.getAmountFrom() != null && searchCriteria.getAmountFrom().trim().length() > 0) 
					&& (searchCriteria.getAmountTo() != null && searchCriteria.getAmountTo().trim().length() > 0)) {
				serachCriteriaSpecfied = true;
				logger.info("ADD amount range to criteria");
				
				double amountFrom = Double.parseDouble(searchCriteria.getAmountFrom());
				double amountTo = Double.parseDouble(searchCriteria.getAmountTo());
				
				criteria.add(Restrictions.between("amount", amountFrom, amountTo));
			}
			if((searchCriteria.getDateFrom() != null && searchCriteria.getDateFrom().trim().length() > 0) && 
					(searchCriteria.getDateTo() != null && searchCriteria.getDateTo().trim().length() > 0)) {
				
				serachCriteriaSpecfied = true;
				logger.info("ADD date range to criteria");
				
		        String dateFrom = searchCriteria.getDateFrom();
		        String dateTo = searchCriteria.getDateTo();
		        
		        Calendar calFrom = AssignmentUtil.stringToCalendar(dateFrom);
		        Calendar calTo = AssignmentUtil.stringToCalendar(dateTo);
		        
		        logger.info("calFrom.getTime() :: " + calFrom.getTime());
		        logger.info("calTo.getTime() :: " + calTo.getTime());
				criteria.add(Restrictions.ge("dateField", calFrom));
				criteria.add(Restrictions.le("dateField", calTo));
			}
			
			if(! serachCriteriaSpecfied) {
				logger.info("No search Criteria specified");
				
				Calendar cal = Calendar.getInstance();
				cal.add(Calendar.MONTH, -3);
				logger.info(cal.getTime());
				
				
				criteria.add(Restrictions.ge("dateField", cal));
			}
			
			statementList = criteria.list();

		} catch (HibernateException e) {
			logger.error((new StringBuffer("An error occured while searching statement:")
					.append(searchCriteria.toString())));
			throw e;
		} catch (Exception e) {
			logger.error((new StringBuffer("An error occured while searching statement:")
					.append(searchCriteria.toString())));
			throw e;
		}
		
		return statementList;
	}
	public void updateUser(User user) {
		
		logger.info("AssignmentDAO.updateUser()");
		try {
			Session session = AssignmentUtil.initHibernateSession();
			session.saveOrUpdate(user);
			
			Transaction tx = session.beginTransaction();
			tx.commit();
			
		} catch (HibernateException e) {
			logger.error((new StringBuffer("An error occured while updating User object with userName :")
					.append(user.getUserName()).toString()));
			throw e;
		} catch (Exception e) {
			logger.error((new StringBuffer("An error occured while updating User object with userName :")
					.append(user.getUserName()).toString()));
			throw e;
		}
	}
	
	public User getUserByCredentials(String userName, String password) {

		Session session = AssignmentUtil.initHibernateSession();
		User bean = null;
		try {
			bean = (User) session.createCriteria(User.class)
					.add(Restrictions.eq("userName", userName))
					.add(Restrictions.eq("password", password))
					.uniqueResult();

		} catch (HibernateException e) {
			logger.error((new StringBuffer("An error occured while retrieving User object with userName :")
					.append(userName).toString()));
			throw e;
		} catch (Exception e) {
			logger.error((new StringBuffer("An error occured while retrieving User object with userName :")
					.append(userName).toString()));
			throw e;
		}
		return bean;
	}
	
}
